package com.computacion9.clase11;

import java.util.*;

public class ColeccionHashSet {

	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno(1,"9730035", "Bidkar", "Aragon Cardenas");
		Alumno alumno2 = new Alumno(2,"1730034", "Daniela", "Gerardo Mondragon");
		Alumno alumno3 = new Alumno(3,"1630142", "Javier", "Villa Quintero");
		Alumno alumno4 = new Alumno(3,"1630142", "Javier", "Villa Quintero");
		
		Set<Alumno> listaDeAlumnos = new HashSet<Alumno>();
		
		listaDeAlumnos.add(alumno1);
		listaDeAlumnos.add(alumno2);
		listaDeAlumnos.add(alumno3);
		listaDeAlumnos.add(alumno4);
		
		for (Alumno alumno : listaDeAlumnos) {
			System.out.println("Id: " + alumno.getId() + ", Alumno: " + alumno.getNombres() + " " + alumno.getApellidos() + ", Matricula: "
					+ alumno.getMatricula());
			System.out.println(alumno.hashCode());
			
		}
		
		if (alumno3.equals(alumno4)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintos");
		}
		
		// TODO: validar que no agregue duplicados

	}

}
