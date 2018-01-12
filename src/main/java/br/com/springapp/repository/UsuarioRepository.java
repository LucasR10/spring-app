package br.com.springapp.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.springapp.entidades.Usuario;

@Transactional
@Repository
public class UsuarioRepository {


	@PersistenceContext
	private EntityManager em;

	@Transactional(readOnly=false)
	public void save(Usuario entity) {
		em.persist(entity);
	}

	@Transactional(readOnly=false)
	public void update(Usuario entity) {
		em.merge(entity);
	}
	
	@Transactional(readOnly=true)
	public Usuario findById(Long primaryKey) {
		return em.find(Usuario.class, primaryKey);
	}

	@Transactional(readOnly=false)
	public void delete(Usuario entity) {
		em.remove(entity);
	}
	
	
	@Transactional(readOnly=true)
	public boolean existsById(Serializable primaryKey) {
		return false;
	}

	@SuppressWarnings("unchecked")
	public List<Usuario> findAll() {
		return em.createQuery(" SELECT u FROM Usuario  u").getResultList();
	}

	public long count() {
		return (Long) em.createNativeQuery("SELECT count(*) FROM " + Usuario.class.getSimpleName() ).getSingleResult();
	}
	
	
	
}
