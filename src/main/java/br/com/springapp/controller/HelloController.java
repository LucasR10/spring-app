package br.com.springapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/hello")
public class HelloController {
	
	@RequestMapping(value="/ok" , produces = "application/json" )
	@ResponseBody		
	public String ola(){
		return "ok está ok!!";
		
	}

}
