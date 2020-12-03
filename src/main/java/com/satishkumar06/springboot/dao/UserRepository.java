package com.satishkumar06.springboot.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.satishkumar06.springboot.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	public List<User> findByName(String name);
	
	public List<User> findByNameAndCity(String name, String city);
	
	public List<User> findByCityStartingWith(String city);

}
