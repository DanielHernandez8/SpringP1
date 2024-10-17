package com.danielhernandez.SpringP1.repository;

import com.danielhernandez.SpringP1.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonaRepository extends JpaRepository<Persona,Integer> {
    //List<Persona> findAll();
}
