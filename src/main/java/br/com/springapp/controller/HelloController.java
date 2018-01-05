package br.com.springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value="/hello")
public class HelloController {
	
	@RequestMapping(value="/buscar" , produces = "application/json" )
	@ResponseBody		
	public String ola(){
		return "olá";
		
	}

}
