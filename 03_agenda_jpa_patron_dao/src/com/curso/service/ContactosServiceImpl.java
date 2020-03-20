package com.curso.service;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.curso.dao.ContactosDao;
import com.curso.model.Contacto;

@Service
public class ContactosServiceImpl implements ContactosService {
	
	@Autowired
	ContactosDao dao;
	
	
	@Override
	public void altaContacto(Contacto contacto) {
		if(dao.findByEmail(contacto.getEmail())==null) {
			dao.save(contacto);
		}else {
			dao.update(contacto);
		}
		
	}

	@Override
	public List<Contacto> recuperarContactos() {
		return dao.findAll();
	}
	
	@Transactional
	@Override
	public void eliminarContacto(int idContacto) {
		Contacto contacto=dao.find(idContacto);
		if(contacto!=null) {
			dao.delete(contacto);
		}
	}

	
}
