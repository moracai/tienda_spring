package com.app.clientes.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name="clientes")

public class clientes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	
	@Column(name="nombre",nullable = false,length = 45)
	private String nombre;
	
	@Column(name="apellido",nullable = false,length = 45)
	private String apellido;
	
	@Column(name="edad",nullable = false,length = 11)
	private int edad;
	
	@Column(name="identificacion",nullable = false,length = 11)
	private int identificacion;
	
	public clientes (){
	
}

	public clientes(Long id, String nombre, String apellido, int edad, int identificacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.identificacion = identificacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	@Override
	public String toString() {
		return "clientes [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", identificacion=" + identificacion + "]";
	}
}
	
	
	
	
	
	