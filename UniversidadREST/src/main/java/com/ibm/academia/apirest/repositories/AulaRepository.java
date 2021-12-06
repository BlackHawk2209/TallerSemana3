package com.ibm.academia.apirest.repositories;

import java.util.Optional;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.entities.Aula;


@Repository
public interface AulaRepository extends CrudRepository<Aula, Integer> {


	public Iterable<Aula> findAulasByPizarron(String tipoPizarron);
	

	public Iterable<Aula> findAulasByPabellon(String nombre);
	

	public Optional<Aula> findAulasByNumeroAulaContains(Integer numeroAula);
}
