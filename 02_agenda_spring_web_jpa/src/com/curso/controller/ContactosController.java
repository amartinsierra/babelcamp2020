package com.curso.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.model.Contacto;
import com.curso.service.ContactosService;

@Controller
public class ContactosController {
	@Autowired
	ContactosService service;
	
	@GetMapping(value="/contactos")
	public String recuperarContactos(HttpServletRequest request) {
		List<Contacto> lista=service.recuperarContactos();
		request.setAttribute("contactos", lista);
		return "contactos";
	}
	
	@PostMapping(value="/alta")
	public String altaContacto(@RequestParam("nombre") String nombre,
							@RequestParam("email") String email,
							@RequestParam("edad")  int edad) {
		Contacto contacto=new Contacto(edad,email,nombre);
		service.altaContacto(contacto);
		return "menu";
	}
	
	@GetMapping(value="/eliminar")
	public String eliminarContacto(@RequestParam("idContacto") int idContacto) {
		service.eliminarContacto(idContacto);
		return "contactos";
	}
}
