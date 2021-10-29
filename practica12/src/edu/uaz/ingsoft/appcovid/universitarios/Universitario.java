package edu.uaz.ingsoft.appcovid.universitarios;

public abstract class Universitario{
	private String nombre;

	public Universitario(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public abstract void getNota();

	public boolean equals(Object o){
		boolean result = false;
		if ((o != null) && (o instanceof Universitario)){
			Universitario u = (Universitario) o;
			if (this.nombre.equals(u.nombre)){
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