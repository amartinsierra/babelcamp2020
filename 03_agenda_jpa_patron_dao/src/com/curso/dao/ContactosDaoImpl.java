package com.curso.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.curso.model.Contacto;

@Repository
public class ContactosDaoImpl implements ContactosDao {
	@PersistenceContext
	EntityManager em;
	@Transactional
	@Override
	public void save(Contacto contacto) {
		em.persist(contacto);

	}

	@Override
	public Contacto find(int idContacto) {
		return em.find(Contacto.class, idContacto);
	}
	@Transactional
	@Override
	public void update(Contacto contacto) {
		em.merge(contacto);

	}

	@Override
	public List<Contacto> findAll() {
		TypedQuery<Contacto> query=em.createNamedQuery("Contacto.findAll", Contacto.class);
		return query.getResultList();
	}
	@Transactional
	@Override
	public void delete(Contacto contacto) {
		em.remove(contacto);

	}

	@Override
	public Contacto findByEmail(String email) {
		String jpql="Select c From Contacto c Where c.email=?1";
		TypedQuery<Contacto> query=em.createQuery(jpql,Contacto.class);
		query.setParameter(1, email);
		List<Contacto> resultado=query.getResultList();
		return resultado.size()>0?resultado.get(0):null;
	}

}
