package br.com.springapp.generics;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public abstract class GenericRepository <T, ID extends Serializable> implements CrudRepository<T, Serializable>	{

	public GenericRepository(Class<T> persistedClass) {
		this.persistedClass = persistedClass;
	}

	@PersistenceContext
	private EntityManager em;
	
	private Class<T> persistedClass;
	

	
	public void save(T entity) {
		em.persist(entity);
	}

	public void update(T entity) {
		em.merge(entity);
	}

	public T findById(Serializable primaryKey) {
		return em.find(persistedClass, primaryKey);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return em.createQuery(" SELECT entity FROM "+ persistedClass.getSimpleName() +" entity").getResultList();
	}

	public long count() {
		return (Long) em.createNativeQuery("SELECT count(*) FROM " +persistedClass.getSimpleName() ).getSingleResult();
	}

	public void delete(T entity) {
		em.remove(entity);
		
	}

	public boolean existsById(Serializable primaryKey) {
		return findById(primaryKey) != null;
	}

	
	
}
