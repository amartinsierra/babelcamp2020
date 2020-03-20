package com.curso.dao;

import java.util.List;

import com.curso.model.Contacto;

public interface ContactosDao {
	void save(Contacto contacto);
	Contacto find(int idContacto);
	void update(Contacto contacto);
	List<Contacto> findAll();
	void delete(Contacto contacto);
	Contacto findByEmail(String email);
}
