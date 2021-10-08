package edu.uaz.ingsoft.appcovid.universitarios.maestros;
import edu.uaz.ingsoft.appcovid.universitarios.*;

public class Maestro extends Universitario{

	private float sueldo;

	public Maestro(String nombre, float sueldo){
		super(nombre);
		this.sueldo = sueldo;
	}

	public Maestro(String nombre){
		this(nombre, 1000.00f);
	}

	public float setSueldo(float sueldo){
		if (sueldo <= 20000.00f && sueldo >= 100.00f){
			return sueldo;
		} else{
			this.sueldo = sueldo;
			return sueldo = 1000.00f;
		}
	}

	public boolean equals(Object o){
		boolean result = false;
		if ((o != null) && (o instanceof Maestro)){
			Maestro lehrer = (Maestro) o;
			if ((lehrer.equals(lehrer) && super.no ){
				result = true;
			}
		}
		return result;
	}

	public int hashCode(){
		int hashcode = this(nombre.hashCode());
		return hashcode;
	}

	public String toString(){
		return super.toString() +"\t"+ sueldo;
	}
}
	
