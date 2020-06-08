package com.computacion9.clase15;

import java.util.ArrayList;
import java.util.Iterator;

import com.computacion9.clase13.Libro;

public class ColeccionLinkedList {

	public static void main(String[] args) {

		Libro libro1 = new Libro("Java 1", "Javero", "Oracle", "978-3-16-148410-1");
		Libro libro2 = new Libro("Java 2", "Javero", "Oracle", "978-3-16-148410-2");
		Libro libro3 = new Libro("Java 3", "Javero", "Oracle", "978-3-16-148410-3");
		Libro libro4 = new Libro("Java 4", "Javero", "Oracle", "978-3-16-148410-4");

		ArrayList<Libro> libros = new ArrayList<Libro>();

		libros.add(libro1);
		libros.add(libro2);
		libros.add(libro3);
		libros.add(libro4);

//		for (Libro libro : libros) {
//			System.out.println(libro.getNombre());
//			if (libro.getIsbn() == "978-3-16-148410-2") {
//				libros.remove(libro);
//			}
//		}

		Iterator<Libro> it = libros.iterator();

		while (it.hasNext()) {
			Libro libro = (Libro) it.next();
			if (libro.getIsbn() == "978-3-16-148410-2") {
				it.remove();
			} else {
				System.out.println(libro.getNombre());
			}
		}

	}

}
