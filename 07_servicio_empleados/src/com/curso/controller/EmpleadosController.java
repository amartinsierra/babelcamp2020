package com.curso.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping(value="/empleados/{dep}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Empleado> filtroDepartamento(@PathVariable("dep") String dep){
		return empleados
			.stream()
			.filter(e->e.getDepartamento().equals(dep))
			.collect(Collectors.toList());
	}
	@GetMapping(value="/empleados/{dep}/{salario}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Empleado> filtroDepartamento(@PathVariable("dep") String dep,
											@PathVariable("salario") double salario){
		return empleados
			.stream()
			.filter(e->(e.getDepartamento().equals(dep)&&e.getSalario()<salario))
			.collect(Collectors.toList());
	}
	
	
	@DeleteMapping(value="/empleados/{nombre}")
	public void eliminarPorNombre(@PathVariable("nombre") String nombre) {
		empleados.removeIf(e->e.getNombre().equals(nombre));
	}
	
	@PostMapping(value="/empleado",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void altaEmpleado(@RequestBody Empleado emp) {
		empleados.add(emp);
	}
	
	@PutMapping(value="/empleado/{nombre}/{salario}")
	public void actualizaSalario(@PathVariable("nombre") String nombre,
								 @PathVariable("salario") double salario) {
		Empleado em=empleados.stream()
				.filter(e->e.getNombre().equals(nombre))
				.findFirst()
				.orElse(null);
		if(em!=null) {
			em.setSalario(salario);
		}
	}
	
}
