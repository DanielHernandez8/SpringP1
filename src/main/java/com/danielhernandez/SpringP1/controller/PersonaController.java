package com.danielhernandez.SpringP1.controller;

import com.danielhernandez.SpringP1.entities.Persona;
import com.danielhernandez.SpringP1.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/people")
public class PersonaController {
    @Autowired
    private PersonaRepository personaRepository;

    @GetMapping()
    public List<Persona> selectPeople() {
        List<Persona> people = personaRepository.findAll();
        return people;
    }

    @PostMapping("/")
    public void createPeople(@RequestBody Persona person) {
        personaRepository.save(person);
    }


    @DeleteMapping("/{id}")
    public void deletePeople(@PathVariable("id") Integer id) {
        Persona i = new Persona();
        i.setId(id);
        personaRepository.delete(i);
    }


}
