package com.springboot.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.backend.model.User;
import com.springboot.backend.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackEndApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackEndApplication.class, args);
	}
	
	@Autowired
	private UserRepository repository;

	@Override
	public void run(String... args) throws Exception {
		this.repository.save(new User("Khushi", "Bhanushali", "khushi@gmail.com"));
		this.repository.save(new User("Dhara", "Sukhadiya", "dhara@gmail.com"));
		this.repository.save(new User("Nisha", "Soni", "nisha@gmail.com"));
		
	}

}
