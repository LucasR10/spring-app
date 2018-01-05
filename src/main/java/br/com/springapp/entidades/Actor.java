package br.com.springapp.entidades;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;


@Entity(name="tb_actor")
public class Actor implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Getter
	private Long id;
	@Getter @Setter
	private String name;
	@Getter @Setter
	private String email;
	
	
	public Actor(Long id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	 public Actor() {
	}


}
