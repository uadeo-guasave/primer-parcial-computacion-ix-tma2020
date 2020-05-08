package com.computacion9.clase2;

import java.io.*;

public class ClaseFile {

	public static void main(String[] args) {
		
		String ruta = "/Users/bidkar/Desktop/java_clase_file/ejemplo.txt";
		
		File archivo = new File(ruta);
		
		System.out.println(archivo.getAbsolutePath());
		
		// crear el archivo en caso de no existir
		try {
			archivo.createNewFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		if (archivo.exists()) {
			if (archivo.isDirectory()) {
				System.out.println("Es un directorio");
			} else if (archivo.isFile()) {
				System.out.println("Es un archivo");
			}
		} else {
			System.out.println("El archivo o directorio no existe");
		}
		
		// eliminar archivo existente
		if (archivo.delete()) {
			System.out.println("El archivo \n" + ruta + "\nha sido eliminado correctamente.");
		}
		

	}

}
