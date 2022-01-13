package com.gjsgabriel.gjsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gjsgabriel.gjsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
