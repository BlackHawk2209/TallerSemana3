package com.ibm.academia.apirest.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.entities.Persona;

@Repository("repositorioEmpleados")
public interface EmpleadoRepository  extends PersonaRepository{

	@Query("select e from Empleado e where e.tipoEmpleado like %?1%")
	Iterable<Persona> buscarEmpleadoPorTipoEmpleado(String tipoEmpleado);

}
