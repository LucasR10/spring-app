package br.com.springapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping("/ola")
	public String ola(){
		return "olá";
		
	}

}
