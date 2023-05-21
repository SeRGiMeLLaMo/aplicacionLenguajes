package com.proyect.aplicacion.service;

import com.proyect.aplicacion.interfaceService.IPersonaService;
import com.proyect.aplicacion.interfaces.PersonaRepository;
import com.proyect.aplicacion.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> listar() {
        return personaRepository.findAll();
    }

    @Override
    public Optional<Persona> listarPorId(int id) {
        return personaRepository.findById((long) id);
    }


    @Override
    public int guardar(Persona persona) {
        Persona personaGuardada = personaRepository.save(persona);
        return personaGuardada != null ? 1 : 0;
    }

    @Override
    public void eliminar(int id) {
        personaRepository.deleteById((long) id);
    }
}
