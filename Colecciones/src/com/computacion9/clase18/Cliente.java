package com.computacion9.clase18;

public class Cliente {
	private int id;
	private String nombre;
	private String direccion;
	
	public Cliente(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = "siempre la misma";
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}
	
}