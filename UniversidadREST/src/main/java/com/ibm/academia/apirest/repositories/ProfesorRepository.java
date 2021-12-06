package com.ibm.academia.apirest.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.entities.Persona;

@Repository("repositorioProfesores")
public interface ProfesorRepository extends PersonaRepository {

@Query("select p.nombre FROM Profesor p where p.carreras.nombre = ?1")
	public Iterable<Persona> findProfesorByCarrera(String nombre);
}
