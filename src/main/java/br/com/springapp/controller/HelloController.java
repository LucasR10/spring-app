package br.com.springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/hello")
@Controller
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET, name ="/ola")
	public String ola(){
		return "olá";
		
	}

}
