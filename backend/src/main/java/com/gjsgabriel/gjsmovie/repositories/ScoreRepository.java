package com.gjsgabriel.gjsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gjsgabriel.gjsmovie.entities.Score;
import com.gjsgabriel.gjsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
