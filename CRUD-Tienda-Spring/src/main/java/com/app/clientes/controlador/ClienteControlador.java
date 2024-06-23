package com.app.clientes.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.clientes.entidad.clientes;
import com.app.clientes.servicio.ClientesServicio;



@Controller
public class ClienteControlador {

	@Autowired
	private ClientesServicio servicio;
	@GetMapping({"/clientes", "/"})
	public String listarClientes(Model modelo) {
		modelo.addAttribute("clientes",servicio.listarTodosLosClientes());
		return "clientes";
	}
	@GetMapping({"/clientes/nuevo"})
	public String mostrarFormularioRegistrarCliente(Model modelo) {
		clientes cliente = new clientes();
		modelo.addAttribute("clientes",cliente);
		return "crear_cliente";
		
}
	@PostMapping("/clientes")
	public String guardarCliente(@ModelAttribute("cliente")clientes cliente) {
		servicio.guardarCliente(cliente);
		//TODO:process POST request
		return "redirect:/clientes";
	}

	@GetMapping({"/clientes/editar/{id}"})
	public String mostrarFormularioEditarCliente(@PathVariable Long id, Model modelo ) {
				modelo.addAttribute("clientes",servicio.obtenerClientePorId(id));
		return "editar_cliente";
	}
	
	
	@PostMapping("/clientes/{id}")
	public String actualizarCliente(@PathVariable Long id, Model modelo, @ModelAttribute("cliente")clientes cliente) {
			
		clientes clienteExistente = servicio.obtenerClientePorId(id);
		clienteExistente.setId(id);
		clienteExistente.setNombre(cliente.getNombre());
		clienteExistente.setApellido(cliente.getApellido());
		clienteExistente.setEdad(cliente.getEdad());
		clienteExistente.setIdentificacion(cliente.getIdentificacion());
		
		servicio.actualizarCliente(clienteExistente);
		
		//TODO:process POST request
		return "redirect:/clientes";
	
	}
	
	@GetMapping({"/clientes/eliminar/{id}"})
	public String eliminarCliente(@PathVariable Long id) {
		servicio.eliminarCliente(id);
		return "redirect:/clientes";
	
	}
	
	
}