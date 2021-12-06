package com.ibm.academia.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.apirest.entities.Pabellon;
import com.ibm.academia.apirest.repositories.PabellonRepository;

@Service
public class PabellonDAOImpl extends GenericoDAOImpl<Pabellon, PabellonRepository> implements PabellonDAO {

	@Autowired
	public PabellonDAOImpl(PabellonRepository repository) {
		super(repository);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Pabellon> findPabellonByDireccion_CodigoPostal(String codigoPostal) {
		return repository.findPabellonByDireccion_CodigoPostal(codigoPostal);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Pabellon> findPabellonByNombreContains(String nombre) {
		return repository.findPabellonByNombreContains(nombre);
	}

	
}
