package com.satishkumar06.springboot;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

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
		
//		User user = new User();
//		user.setName("Satish Kumar Gupta");
//		user.setCity("New Delhi");
//		user.setStatus("I am Java Programmer");
//		
//		User user1 = userRepository.save(user);
//		
//		System.out.println(user1);
		
		//Create object of User
		User user1 = new User();
		user1.setName("Uttam");
		user1.setCity("City1");
		user1.setStatus("Python Programmer");
		
		User user2 = new User();
		user2.setName("Ankit");
		user2.setCity("City2");
		user2.setStatus("C++ Programmer");
		
		User user3 = new User();
		user3.setName("Satyam");
		user3.setCity("City3");
		user3.setStatus("Web Developer");
		
//		//saving single user
//		User resultUser = userRepository.save(user2);
//		System.out.println("saved user "+resultUser);
//		System.out.println("done...");
		
//		List<User> users = List.of(user1,user2);
//		Iterable<User> result = userRepository.saveAll(users);
//		
//		result.forEach(user->{
//			System.out.println(user);
//		});
		
//		//Update the user of id=4
//		Optional<User> optional = userRepository.findById(4);
//		User user = optional.get();
//		
//		user.setName("Ankit Tiwari");
//		User result = userRepository.save(user);
//		
//		System.out.println(result);
		
//		//how to get the data
//		Iterable<User> itr = userRepository.findAll();
////		Iterator<User> iterator = itr.iterator();
////		
////		while(iterator.hasNext()) {
////			User user = iterator.next();
////			System.out.println(user);
////		}
//		
////		itr.forEach(new Consumer<User>() {
////			public void accept(User t) {
////				System.out.println(t);
////			}
////		});
//		
//		itr.forEach(user->{
//			System.out.println(user);
//		});
		
		
		//Deleting the user
//		userRepository.deleteById(4);
//		System.out.println("deleted");
		
		Iterable<User> alluser = userRepository.findAll();
		alluser.forEach(user->{
			System.out.println(user);
		});
		userRepository.deleteAll(alluser);
	}

}
