package com.curso.service;

import java.util.List;

import com.curso.model.Contacto;

public interface ContactosService {
	void altaContacto(Contacto contacto);
	List<Contacto> recuperarContactos();
	void eliminarContacto(int idContacto);
}
