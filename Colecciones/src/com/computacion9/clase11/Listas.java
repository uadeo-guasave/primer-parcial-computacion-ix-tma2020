package com.computacion9.clase11;

import java.util.*;

public class Listas {

	public static void main(String[] args) {

		Alumno alumno1 = new Alumno(1,"9730035", "Bidkar", "Aragon Cardenas");
		Alumno alumno2 = new Alumno(2,"1730034", "Daniela", "Gerardo Mondragon");
		Alumno alumno3 = new Alumno(3,"1630142", "Javier", "Villa Quintero");
		Alumno alumno4 = new Alumno(3,"1630142", "Javier", "Villa Quintero");

		List<Alumno> listaDeAlumnos = new ArrayList<Alumno>();
		listaDeAlumnos.add(alumno1);
		listaDeAlumnos.add(alumno2);
		listaDeAlumnos.add(alumno3);
		listaDeAlumnos.add(alumno4);

		for (Alumno alumno : listaDeAlumnos) {
			System.out.println("Alumno: " + alumno.getNombres() + " " + alumno.getApellidos() + ", Matricula: "
					+ alumno.getMatricula());
		}

	}

}
