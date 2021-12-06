package com.ibm.academia.apirest.services;

import java.util.Optional;

import com.ibm.academia.apirest.entities.Aula;

public interface AulaDAO extends GenericoDAO<Aula> {

	public Iterable<Aula> findAulasByPizarron(String tipoPizarron); 
	
	public Iterable<Aula> findAulasByPabellon(String nombre);
	
	public Optional<Aula> findAulasByNumeroAulaContains(Integer numeroAula);
}
