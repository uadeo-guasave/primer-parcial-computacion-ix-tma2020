package com.computacion9.clase26;

import java.util.HashSet;

import com.computacion9.clase18.Categoria;

public class Colecciones {
	
	public static HashSet<Categoria> categorias = new HashSet<Categoria>();

	public static void main(String[] args) {
		
		Categoria ratones = new Categoria(1, "Mouse/Ratones");
		Categoria almacenamiento = new Categoria(2, "Almacenamiento");
		
		
		categorias.add(ratones);
		categorias.add(almacenamiento);
		
		Producto raton1 = new Producto(1, "Mouse Logitech m185", 199.00d, 1);
		
		System.out.println("Producto: " + raton1.getNombre() + ", Categoria: "
				+ raton1.getCategoria().getNombre());

	}

}
