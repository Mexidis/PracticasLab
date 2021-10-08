package edu.uaz.ingsoft.appcovid.universitarios;

public class Universitario{
	private String nombre;

	public Universitario(String nombre){
		this.nombre = nombre;
	}

	public boolean equals(Object o){
		boolean result = false;
		if ((o != null) && (o instanceof Universitario)){
			Universitario u = (Universitario) o;
			if (nombre == u.nombre){
				result = true;
			}
		}
		return result;
	}

	public int hashCode(){
		return Integer.valueOf(nombre).intValue();
	}

	public String toString(){
		return nombre;
	}


}