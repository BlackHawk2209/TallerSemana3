package com.ibm.academia.apirest.services;

import com.ibm.academia.apirest.entities.Persona;

public interface EmpleadoDAO extends PersonaDAO {

	public Iterable<Persona> buscarEmpleadoPorTipoEmpleado(String tipoEmpleado);
	}
