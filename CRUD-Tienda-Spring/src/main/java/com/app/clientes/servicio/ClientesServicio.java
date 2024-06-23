package com.app.clientes.servicio;

import java.util.List;

import com.app.clientes.entidad.clientes;

public interface ClientesServicio {
	
	public List<clientes> listarTodosLosClientes();
	public clientes guardarCliente(clientes cliente);
	public clientes obtenerClientePorId(long id);
	public clientes actualizarCliente(clientes cliente);
	public void eliminarCliente(long id);
}
