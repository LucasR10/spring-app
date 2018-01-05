package br.com.springapp.entidades;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;

@SuppressWarnings("unused")
@Data	
@Entity(name="tb_customer")
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String firstName;
	private String email;
	private Boolean active;
	
	public Customer(Long id, String firstName, String email, Boolean active) {
		this.id = id;
		this.firstName = firstName;
		this.email = email;
		this.active = active;
	}
	
	public Customer() {
	}
	
	
}
