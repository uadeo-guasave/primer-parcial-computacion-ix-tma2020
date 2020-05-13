package com.computacion9.clase4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Objects {

	public static void main(String[] args) {
		
		File ruta = new File("/Users/bidkar/Desktop/java_clase_file/objects.txt");
		
		
		escribirEnArchivoSerializado(ruta);
		leerArchivoSerializado(ruta);
	}

	private static void leerArchivoSerializado(File ruta) {
		
		try {
			FileInputStream flujo = new FileInputStream(ruta);
			ObjectInputStream archivo = new ObjectInputStream(flujo);
			
			User usuario = (User) archivo.readObject();
			System.out.println(usuario.Firstname + " " + usuario.Lastname);
			
			archivo.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void escribirEnArchivoSerializado(File ruta) {
		try {
			FileOutputStream flujo = new FileOutputStream(ruta);
			ObjectOutputStream archivo = new ObjectOutputStream(flujo);
			User usuario = new User(1, "bidkar", "123", "Bidkar", "Aragon");
			archivo.writeObject(usuario);
			
			archivo.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
