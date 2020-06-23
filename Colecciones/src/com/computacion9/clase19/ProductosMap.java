package com.computacion9.clase19;

import java.util.HashMap;
import java.util.Iterator;import java.util.Map;

import com.computacion9.clase18.*;

public class ProductosMap {

	public static void main(String[] args) {

		Categoria mx = new Categoria(1, "Comida Mexicana");
		Categoria jp = new Categoria(2, "Comida Japonesa");
		Categoria cn = new Categoria(3, "Comida China");

		Producto pozole = new Producto(1, "Pozole", 70.0, 1);
		Producto menudo = new Producto(2, "Menudo", 60.0, 1);
		Producto sushi = new Producto(3, "Sushi", 80.0, 2);
		Producto gumbao = new Producto(4, "Gumbao Pekines", 190.0, 3);

		HashMap<Producto, Categoria> platillos = new HashMap<Producto, Categoria>();
		platillos.put(pozole, mx);
		platillos.put(menudo, mx);
		platillos.put(sushi, jp);
		platillos.put(gumbao, cn);

		System.out.println(platillos);

//		Iterar con iterator
		Iterator<Producto> it = platillos.keySet().iterator();
		System.out.println("Utilizando Iterator");
		while (it.hasNext()) {
//			Obtener la llave
			Producto producto = (Producto) it.next();

//			Obtener el valor
			Categoria categoria = (Categoria) platillos.get(producto);

			System.out.println("Platillo: " + producto.getNombre() + ", Precio: $" + producto.getPrecio()
					+ ", Categoría: " + categoria.getNombre());
		}

//		Usando keySet() y values() con ForEach
		System.out.println("\nUtilizando keySet(), values() con forEach");
		for (Producto producto : platillos.keySet()) {
			System.out.println("Platillo: " + producto.getNombre() + ", Precio: $" + producto.getPrecio());
		}

		for (Categoria categoria : platillos.values()) {
			System.out.println("Categoría: " + categoria.getNombre());
		}

		for (Producto producto : platillos.keySet()) {
			Categoria categoria = (Categoria) platillos.get(producto);
			System.out.println("Platillo: " + producto.getNombre() + ", Precio: $" + producto.getPrecio()
					+ ", Categoría: " + categoria.getNombre());
		}
		
//		Usando Map.Entry<K,V>
		for(Map.Entry<Producto, Categoria> entrada : platillos.entrySet()) {
			System.out.println("Platillo: " + entrada.getKey().getNombre() + ", Precio: $" + entrada.getKey().getPrecio()
			+ ", Categoría: " + entrada.getValue().getNombre());
		}
		
//		Usando forEach y arrow functions
		platillos.forEach((k,v) -> System.out.println("Producto: " + k.getNombre() + ", Categoria: " + v.getNombre()));

	}

}
