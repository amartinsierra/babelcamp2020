package com.curso.service;

import java.util.List;

import com.curso.model.Contacto;

public interface ContactosService {
	void altaContacto(Contacto contacto);
	List<Contacto> recuperarContactos();
	void eliminarContacto(int idContacto);
	
	List<Contacto> recuperarContactosPorEdades(int e1, int e2);
	Contacto buscarPorEmail(String email);
	void eliminarPorNombre(String nombre);
}
