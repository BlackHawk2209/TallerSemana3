package com.ibm.academia.apirest.services;

import com.ibm.academia.apirest.entities.Pabellon;

public interface PabellonDAO  extends GenericoDAO<Pabellon>{

	public Iterable<Pabellon> findPabellonByDireccion_CodigoPostal(String codigoPostal);
	
	public Iterable<Pabellon> findPabellonByNombreContains(String nombre);
}
