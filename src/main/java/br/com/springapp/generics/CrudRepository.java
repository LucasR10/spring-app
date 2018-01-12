package br.com.springapp.generics;

import java.io.Serializable;
import java.util.List;

public interface CrudRepository <T, ID extends Serializable>	{

	
	void save(T entity);
	
	void update(T entity);

	 T  findById(ID primaryKey); 

	 List	<T> findAll();               

	 long count();                        

	 void delete(T entity);               

	 boolean existsById(ID primaryKey);
}
