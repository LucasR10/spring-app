package br.com.springapp.repository;

import org.springframework.transaction.annotation.Transactional;

import br.com.springapp.entidades.Customer;
import br.com.springapp.generics.GenericRepository;

@Transactional
public class CustomerRepository extends GenericRepository<Customer, Long> {

	public CustomerRepository() {
		super(Customer.class);
		
	}

}
