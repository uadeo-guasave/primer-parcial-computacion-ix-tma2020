package com.computacion9.clase3;

import java.io.*;

public class ReaderWriter {

	public static void main(String[] args) {
		
		File ruta = new File("/Users/bidkar/Desktop/java_clase_file/mal_chiste_geek.txt");
		
		leerArchivo(ruta);
		
		String texto = "Que mal chiste de verdad, que malo!";
		escribirArchivo(ruta, texto);

	}
	
	private static void escribirArchivo(File ruta, String texto) {
		
		// TODO: Agregar el código para verificar si el archivo existe, y
		// en caso de que sí, que anexe el contenido al final, sino al
		// principio del archivo.
		
		try {
			FileWriter archivo = new FileWriter(ruta);
			
			for (int i=0;i<texto.length();i++) {
				archivo.write(texto.charAt(i));
			}
			archivo.close();
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("No se pudo escribir en el archivo");
		}
		
	}

	private static void leerArchivo(File ruta) {
		
		try {
			FileReader archivo = new FileReader(ruta);
			int c = 0;
			while(c!=-1) {
				c = archivo.read();
				System.out.print((char)c);
			}
			archivo.close();
		} catch (IOException e) {
			e.getCause();
			System.out.println("El archivo no existe");
		}
		
		
		
	}

}
