package com.computacion9.clase18;

import java.util.*;

public class MapaHashMap {

	public static void main(String[] args) {
		
		Categoria cat1 = new Categoria(1, "Shogou");
		Categoria cat2 = new Categoria(2, "Shounen");
		Categoria cat3 = new Categoria(3, "Yuri");
		Categoria cat4 = new Categoria(4, "Yaoi");
		Categoria cat5 = new Categoria(5, "Ciencia ficción");
		Categoria cat6 = new Categoria(6, "Drama");
		
		HashMap<Integer,Categoria> map = new HashMap<Integer,Categoria>();
		map.put(1, cat1);
		map.put(2, cat2);
		map.put(3, cat3);
		map.put(4, cat4);
		map.put(5, cat5);
		map.put(6, cat6);
		
		System.out.println(map);
		map.remove(3);
		System.out.println(map);
		
		HashMap<String,ArrayList<Categoria>> map2 = new HashMap<String,ArrayList<Categoria>>();
		ArrayList<Categoria> mangas = new ArrayList<Categoria>();
		mangas.add(cat1);
		mangas.add(cat2);
		mangas.add(cat3);
		mangas.add(cat4);
		map2.put("Manga", mangas);
		
		ArrayList<Categoria> libros = new ArrayList<Categoria>();
		libros.add(cat5);
		libros.add(cat6);
		map2.put("Libro", libros);
		
		System.out.println(map2);
		map2.remove("Libro");
		System.out.println(map2);
	}

}
