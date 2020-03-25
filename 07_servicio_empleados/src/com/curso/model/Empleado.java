package com.curso.model;

public class Empleado {
	private String nombre;
	private String departamento;
	private double salario;
	public Empleado(String nombre, String departamento, double salario) {
		super();
		this.nombre = nombre;
		this.departamento = departamento;
		this.salario = salario;
	}
	public Empleado() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
