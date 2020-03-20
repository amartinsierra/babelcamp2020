package com.curso.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.curso.model.Contacto;

@Repository
public class ContactosServiceImpl implements ContactosService {
	@PersistenceContext
	EntityManager em;
	
	
	@Transactional
	@Override
	public void altaContacto(Contacto contacto) {
		em.persist(contacto);

	}

	@Override
	public List<Contacto> recuperarContactos() {
		String jpql="Select c From Contacto c";
		/*Query query=em.createQuery(jpql);
		return (List<Contacto>)query.getResultList();*/
		TypedQuery<Contacto> query=em.createQuery(jpql,Contacto.class);
		return query.getResultList();
	}
	@Transactional
	@Override
	public void eliminarContacto(int idContacto) {
		Contacto contacto=em.find(Contacto.class, idContacto);
		if(contacto!=null) {
			em.remove(contacto);
		}
	}

}
