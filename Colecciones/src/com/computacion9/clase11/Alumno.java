package com.computacion9.clase11;


public class Alumno {
	
	private int id;
	private String matricula;
	private String nombres;
	private String apellidos;
	
	public Alumno(int _id, String _matricula, String _nombres, String _apellidos) {
		this.id = _id;
		this.matricula = _matricula;
		this.nombres = _nombres;
		this.apellidos = _apellidos;
	}
	
	// TODO: sobreescribir los métodos equals() y hashCode()
	
//	public boolean equals(Object obj) {
//		if (obj instanceof Alumno) {
//			if (((Alumno) obj).getMatricula() == this.matricula) {
//				return true;
//			}
//		} // no es igual
//		
//		return false;
//	}
//	
//	public int hashCode() {
//		int h = Integer.parseInt(this.matricula) * 8387;
//		return h;
//	}
	

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

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
