package com.curso.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.model.Descuento;
import com.curso.service.FacturaService;

@Controller
public class FacturaController {
	@Autowired
	FacturaService service;
	
	@PostMapping(value="/facturar")
	public String facturar(@RequestParam("producto") String producto,
							@RequestParam("precio") double precio,
							@RequestParam("unidades")int unidades,
							HttpServletRequest request) {
		int descuento=service.descuentoProducto(producto);
		double factura=precio*unidades;
		factura*=((100-descuento)/100.0);
		request.setAttribute("factura", factura);
		return "factura";		
	}
	
	@GetMapping(value= "/listado")
	public String listaDescuentos(HttpServletRequest request) {
		List<Descuento> descuentos=service.obtenerDescuentos();
		request.setAttribute("descuentos", descuentos);
		return "listado";
	}
	@GetMapping(value="/datos")
	public String paginaDatos(HttpServletRequest request) {
		/*List<Descuento> descuentos=service.obtenerDescuentos();
		request.setAttribute("descuentos", descuentos);*/
		listaDescuentos(request);
		return "datos";
	}
}
