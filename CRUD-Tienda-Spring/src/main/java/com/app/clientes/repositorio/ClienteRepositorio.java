package com.app.clientes.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.clientes.entidad.clientes;



@Repository
public interface ClienteRepositorio extends JpaRepository<clientes, Long> {


	
	
}
