package com.app.clientes.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.clientes.entidad.clientes;
import com.app.clientes.repositorio.ClienteRepositorio;

@Service
public class ClienteServicioImpl implements ClientesServicio {

	@Autowired
	private ClienteRepositorio repositorio;  
	
	@Override
	public List<clientes> listarTodosLosClientes() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public clientes guardarCliente(clientes cliente) {
		// TODO Auto-generated method stub
		return repositorio.save(cliente);
	}

	@Override
	public clientes obtenerClientePorId(long id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).get();
	}

	@Override
	public clientes actualizarCliente(clientes cliente) {
		// TODO Auto-generated method stub
		return repositorio.save(cliente);
	}

	@Override
	public void eliminarCliente(long id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

}
