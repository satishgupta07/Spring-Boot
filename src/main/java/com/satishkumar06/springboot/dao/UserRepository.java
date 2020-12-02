package com.satishkumar06.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.satishkumar06.springboot.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	

}
