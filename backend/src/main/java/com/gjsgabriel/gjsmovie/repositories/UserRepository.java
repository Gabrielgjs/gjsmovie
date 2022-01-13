package com.gjsgabriel.gjsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gjsgabriel.gjsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
