package com.proyect.aplicacion.controller;

import com.proyect.aplicacion.interfaces.PersonaRepository;
import com.proyect.aplicacion.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaRepository personaRepository;

    @GetMapping("/")
    public List<Persona> getAllPersonas() {
        return personaRepository.findAll();
    }

    @PostMapping("/")
    public Persona createPersona(@RequestBody Persona persona) {
        return personaRepository.save(persona);
    }

    @GetMapping("/{id}")
    public Persona getPersonaById(@PathVariable Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Persona updatePersona(@PathVariable Long id, @RequestBody Persona personaDetails) {
        Persona persona = personaRepository.findById(id).orElse(null);
        if (persona != null) {
            persona.setName(personaDetails.getName());
            persona.setPhone(personaDetails.getPhone());
            return personaRepository.save(persona);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePersona(@PathVariable Long id) {
        personaRepository.deleteById(id);
    }
}
