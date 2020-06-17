package com.computacion9.clase18;

public class Producto {
	private int id;
	private String nombre;
	private double precio;
	private int categoria_id;
	
	public Producto(int id, String nombre, double precio, int categoria_id) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.categoria_id = categoria_id;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public int getCategoriaId() {
		return categoria_id;
	}
	
}
