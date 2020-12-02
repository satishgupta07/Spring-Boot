package com.satishkumar06.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.satishkumar06.springboot.dao.UserRepository;
import com.satishkumar06.springboot.entities.User;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		User user = new User();
		user.setName("Satish Kumar Gupta");
		user.setCity("New Delhi");
		user.setStatus("I am Java Programmer");
		
		User user1 = userRepository.save(user);
		
		System.out.println(user1);
	}

}
