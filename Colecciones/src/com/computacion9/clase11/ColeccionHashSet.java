package com.computacion9.clase11;

import java.util.*;

public class ColeccionHashSet {

	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno("9730035", "Bidkar", "Aragon Cardenas");
		Alumno alumno2 = new Alumno("1730034", "Daniela", "Gerardo Mondragon");
		Alumno alumno3 = new Alumno("1630142", "Javier", "Villa Quintero");
		Alumno alumno4 = new Alumno("1630142", "Javier", "Villa Quintero");
		
		Set<Alumno> listaDeAlumnos = new HashSet<Alumno>();
		
		listaDeAlumnos.add(alumno1);
		listaDeAlumnos.add(alumno2);
		listaDeAlumnos.add(alumno3);
		listaDeAlumnos.add(alumno4);
		
		for (Alumno alumno : listaDeAlumnos) {
			System.out.println("Alumno: " + alumno.getNombres() + " " + alumno.getApellidos() + ", Matricula: "
					+ alumno.getMatricula());
		}
		
		// TODO: validar que no agregue duplicados

	}

}
