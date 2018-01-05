package br.com.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.springapp.entidades.Actor;
import br.com.springapp.repository.ActorRepository;


@RestController
@RequestMapping(value="/actor")
public class ActorController  {
	
    @Autowired
	private ActorRepository repository;
	
	@RequestMapping(value="/find/{key}" , produces = "application/json" )
	@ResponseBody		
	public Actor findById(@PathVariable("key")Long key){
		return repository.findById(key);
		
	}

}
