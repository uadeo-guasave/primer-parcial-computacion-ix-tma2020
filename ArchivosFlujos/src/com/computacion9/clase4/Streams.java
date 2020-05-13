package com.computacion9.clase4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Streams {

	public static void main(String[] args) {
		
		// FileInputStream y FileOutputStream
		File ruta = new File("/Users/bidkar/Desktop/java_clase_file/streams.txt");
		// File ruta = new File("/Users/bidkar/Downloads/logo-uadeo.png");
		
		String texto = "Texto escrito con FileOutputStream";
		 escribirEnArchivo(ruta, texto);
		leerArchivo(ruta);

	}

	private static void leerArchivo(File ruta) {
		
		try {
			FileInputStream archivo = new FileInputStream(ruta);
			
			int c = 0;
			while(c!=-1) {
				c = archivo.read();
				System.out.print((char)c);
			}
			
			archivo.close();
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no existe");
		} catch (IOException e) {
			System.out.println("No se puede leer el archivo " + ruta.getName());
		}
		
	}

	private static void escribirEnArchivo(File ruta, String texto) {
		
		try {
			FileOutputStream archivo = new FileOutputStream(ruta);
			archivo.write(texto.getBytes());
			
			archivo.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no existe");
		} catch (IOException e) {
			System.out.println("No se puede escribir en el archivo " + ruta.getName());
		}
		
	}

}
