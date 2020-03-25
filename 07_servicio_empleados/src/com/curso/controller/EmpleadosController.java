package com.curso.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Empleado;

@RestController
public class EmpleadosController {
	List<Empleado> empleados;
	public EmpleadosController() {
		empleados=new ArrayList<>();
		empleados.add(new Empleado("Ana","Financiero",2000));
		empleados.add(new Empleado("Jose","Informática",1800));
		empleados.add(new Empleado("Pepe","Informática",2500));
		empleados.add(new Empleado("empleado A","Ventas",1300));
		empleados.add(new Empleado("empleado B","Financiero",1600));
	}
	
	@GetMapping(value="/empleado",produces=MediaType.APPLICATION_JSON_VALUE)
	public Empleado obtenerEmpleado() {
		return new Empleado("pepito","ventas",1400);
	}
	@GetMapping(value="/empleados",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Empleado> todos(){
		return empleados;
	}
}
