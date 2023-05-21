package com.proyect.aplicacion.interfaces;

import com.proyect.aplicacion.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
