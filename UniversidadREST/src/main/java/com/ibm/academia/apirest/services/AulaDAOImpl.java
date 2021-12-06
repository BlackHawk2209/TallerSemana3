package com.ibm.academia.apirest.services;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.apirest.entities.Aula;
import com.ibm.academia.apirest.repositories.AulaRepository;

@Service
public class AulaDAOImpl extends GenericoDAOImpl<Aula, AulaRepository> implements AulaDAO {

	public AulaDAOImpl(AulaRepository repository) {
		super(repository);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Aula> findAulasByPizarron(String tipoPizarron) {
		return repository.findAulasByPizarron(tipoPizarron);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Aula> findAulasByPabellon(String nombre) {
		return repository.findAulasByPabellon(nombre);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Aula> findAulasByNumeroAulaContains(Integer numeroAula){
		return repository.findAulasByNumeroAulaContains(numeroAula);
	}
	
	
	
	

}
