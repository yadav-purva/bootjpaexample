package com.jpa.test;


import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
	ApplicationContext context= SpringApplication.run(BootjpaexampleApplication.class, args);
	UserRepository userRepository=context.getBean(UserRepository.class);
/*	User user=new User();
	user.setName("Purva Yadav");
	user.setCity("Khargone");
	user.setStatus("I am learning Spring boot and Perform the CRUD Operation");
	User user1=userRepository.save(user);
		System.out.println(user1);*/

		//Create User Object
		User user1=new User();
		user1.setName("item1");
		user1.setCity("Indore");
		user1.setStatus("Springboot learner");

		User user2=new User();
		user2.setName("item2");
		user2.setCity("Ujjain");
		user2.setStatus("Springboot learner");

		//Saving single user
		//User user3=userRepository.save(user2);
		List<User> users=new ArrayList<>();
		users.add(user1);
		users.add(user2);
	Iterable<User> result=userRepository.saveAll(users);
		//System.out.println(user3);

		//result.forEach(System.out::println);

		//Update the userid
	/*	Optional<User> optional=userRepository.findById(1);
		User user=optional.get();
		user.setName("Ankit tiwari");
		User users1=userRepository.save(user);
		System.out.println(users1);*/

		//How to get data
		//findById(id)-return Optional Containing youe data

		Iterable<User> itr=userRepository.findAll();
		itr.forEach(System.out::println);

		//Delete the  user elemets
	//	userRepository.delete(users1);
		/*userRepository.deleteById(1);
		System.out.println("Deleted Successfully!");*/
		//userRepository.deleteAll(itr);
		//System.out.println("Deleted Successfully!");



	}
}
