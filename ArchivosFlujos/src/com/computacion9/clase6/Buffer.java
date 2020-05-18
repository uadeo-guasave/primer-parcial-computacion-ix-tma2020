package com.computacion9.clase6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Buffer {

	public static void main(String[] args) {
		
		File ruta = new File("/Users/bidkar/Desktop/java_clase_file/mock_data.csv");
		
		leerBuffer(ruta);
		// leerFileReader(ruta);
		// TODO: convertir de csvatsv (csv2tsv)
		// TODO: convertir de tsvacsv (tsv2csv)

	}

//	private static void leerFileReader(File ruta) {
//		
//		try {
//			FileReader archivo = new FileReader(ruta);
//			int c = 0;
//			while(c!=-1) {
//				c = archivo.read();
//				System.out.print((char)c);
//			}
//			archivo.close();
//		} catch (IOException e) {
//			e.getCause();
//			System.out.println("El archivo no existe");
//		}
//		
//	}

	private static void leerBuffer(File ruta) {
		try {
			BufferedReader archivo = new BufferedReader(new FileReader(ruta));
			
			String linea;
			while ((linea = archivo.readLine()) != null) {
				System.out.println(linea);
			}
			
			archivo.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
