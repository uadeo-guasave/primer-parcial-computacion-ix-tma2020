package com.computacion9.clase26;

import com.computacion9.clase18.Categoria;

public class Producto extends com.computacion9.clase18.Producto {
	
	private Categoria categoria;

	public Producto(int id, String nombre, double precio, int categoria_id) {
		super(id, nombre, precio, categoria_id);
		
		for (Categoria cat : Colecciones.categorias) {
			if (categoria_id == cat.getId()) {
				this.categoria = cat;
				break;
			}
		}
	}
	
	public Categoria getCategoria() {
		return this.categoria;
	}

}
