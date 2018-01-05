package br.com.springapp.repository;

import java.io.Serializable;

import org.springframework.transaction.annotation.Transactional;

import br.com.springapp.entidades.Actor;
import br.com.springapp.generics.GenericRepository;

@Transactional
public class ActorRepository extends GenericRepository<Actor, Serializable> {

	public ActorRepository() {
		super(Actor.class);
		
	}
	
	

}
