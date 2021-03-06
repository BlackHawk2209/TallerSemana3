package com.ibm.academia.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.apirest.entities.Persona;
import com.ibm.academia.apirest.repositories.PersonaRepository;
import com.ibm.academia.apirest.repositories.ProfesorRepository;

@Service
public class ProfesorDAOImpl extends PersonaDAOImpl implements ProfesorDAO{

	@Autowired
	public ProfesorDAOImpl(@Qualifier("repositorioProfesores")PersonaRepository repository) {
		super(repository);
	}


	@Override
	@Transactional(readOnly = true)
	public Iterable<Persona> findProfesorByCarrera(String nombre) {
		return ((ProfesorRepository)repository).findProfesorByCarrera(nombre);
	}

	
}
