package com.springboot.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.backend.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
