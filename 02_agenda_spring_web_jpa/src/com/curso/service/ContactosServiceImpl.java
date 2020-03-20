package com.curso.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
		//String jpql="Select c From Contacto c";
		/*Query query=em.createQuery(jpql);
		return (List<Contacto>)query.getResultList();*/
		TypedQuery<Contacto> query=em.createNamedQuery("Contacto.findAll",Contacto.class);
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

	@Override
	public List<Contacto> recuperarContactosPorEdades(int e1, int e2) {
		String jpql="Select c From Contacto c Where c.edad>=?1 and c.edad<=?2";
		TypedQuery<Contacto> query=em.createQuery(jpql,Contacto.class);
		//sustituimos parámetros por sus valores
		query.setParameter(1, e1);
		query.setParameter(2, e2);
		return query.getResultList();
	}

	@Override
	public Contacto buscarPorEmail(String email) {
		String jpql="Select c From Contacto c Where c.email=?1";
		TypedQuery<Contacto> query=em.createQuery(jpql,Contacto.class);
		query.setParameter(1, email);
		List<Contacto> resultado=query.getResultList();
		return resultado.size()>0?resultado.get(0):null;
	}
	@Transactional
	@Override
	public void eliminarPorNombre(String nombre) {
		//String jpql="Delete from Contacto c where c.nombre=?1";
		Query query=em.createNamedQuery("Contacto.deleteByName");
		query.setParameter(1, nombre);
		query.executeUpdate();
		
	}

}
