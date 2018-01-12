package br.com.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.springapp.entidades.Usuario;
import br.com.springapp.repository.UsuarioRepository;


@RestController
@RequestMapping(value="/user")
public class UsuarioController  {
	
    
    @Autowired
	private UsuarioRepository service;
	
	@RequestMapping(value="/buscar/{id}" , produces = "application/json" ,method= RequestMethod.GET )
	@ResponseBody		
	public Usuario findById(@PathVariable("id")Long id){
		return service.findById(id);
		
	}
	
	@RequestMapping(value="/buscar" , produces = "application/json",method= RequestMethod.GET )
	@ResponseBody		
	public List<Usuario> findAll(){
		for (Usuario u : service.findAll()) {
			System.out.println( u.toString());
		}
		return service.findAll();
	}
	
	@RequestMapping(value="/remover" , produces = "application/json",consumes={ "application/json"}  ,method= RequestMethod.DELETE )
	@ResponseBody		
	public void remover( @PathVariable("user") Usuario user ){
		service.delete(user);
		
	}
	@RequestMapping(value="/adicionar" , produces = "application/json", consumes={ "application/json"}  ,method= RequestMethod.PUT )
	@ResponseBody		
	public void adicionar(@PathVariable("user")Usuario user){
		service.save(user);
		
	}

}
