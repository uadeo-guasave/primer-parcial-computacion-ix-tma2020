package com.computacion9.clase11;

public class Alumno {
	
	private String matricula;
	private String nombres;
	private String apellidos;
	
	public Alumno(String _matricula, String _nombres, String _apellidos) {
		this.matricula = _matricula;
		this.nombres = _nombres;
		this.apellidos = _apellidos;
	}
	
	// TODO: sobreescribir los métodos equals() y getHashCode()

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
}
