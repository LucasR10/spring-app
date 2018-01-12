package br.com.springapp.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="tb_usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Getter
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Getter @Setter
	private String name;
	@Getter @Setter
	private String email;
	
	
	public Usuario(Long id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	 public Usuario() {
	}

    @Override
    public String toString() {
    	return "Nome :"+ this.name +" - Email"+ this.email +" ";
    }
}
