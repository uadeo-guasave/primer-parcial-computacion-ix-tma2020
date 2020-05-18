package com.computacion9.clase6;

import java.util.Formatter;
import java.util.Scanner;

public class ScannerFormatter {

	public static void main(String[] args) {
		
		System.out.println("Escribe tu nombre");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.next();
		
		System.out.println("Escribe tus apellidos");
		Scanner sc2 = new Scanner(System.in);
		String apellidos = sc2.next();
		
		System.out.println(nombre + " " + apellidos);
		
		StringBuilder sb = new StringBuilder();
		Formatter fm = new Formatter(sb);
		fm.format("%1$20s %2$20s", nombre, apellidos);
		
		System.out.println(fm.toString());
		
	}

}
