package edu.uaz.ingsoft.appcovid.universitarios;

public class Universitario{
	private String nombre;

	public Universitario(String nombre){
		this.nombre = nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public boolean equals(Object o){
		boolean result = false;
		if ((o != null) && (o instanceof Universitario)){
			Universitario u = (Universitario) o;
			if (nombre.equals(nombre)){
				result = true;
			}
		}
		return result;
	}

	public int hashCode(){
		int hashcode = nombre.hashCode();
		return hashcode;
	}

	public String toString(){
		return nombre;
	}
}