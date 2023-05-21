package com.proyect.aplicacion.interfaceService;

import com.proyect.aplicacion.model.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {
    List<Persona> listar();
    Optional<Persona> listarPorId(int id);
    int guardar(Persona persona);
    void eliminar(int id);
}

