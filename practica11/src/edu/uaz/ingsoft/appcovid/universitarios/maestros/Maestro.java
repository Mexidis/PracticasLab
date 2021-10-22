package edu.uaz.ingsoft.appcovid.universitarios.maestros;
import edu.uaz.ingsoft.appcovid.universitarios.*;

public class Maestro extends Universitario{

	private float sueldo;

	public Maestro(String nombre, float sueldo){
		super(nombre);
		if (sueldo <= 20000.00f && sueldo >= 100.00f){
			this.sueldo = sueldo;
		} else{
			this.sueldo = 1000.00f;
		}
	}

	public Maestro(String nombre){
		this(nombre, 1000.00f);
	}

	// public float setSueldo(float sueldo){
	// 	if (sueldo <= 20000.00f && sueldo >= 100.00f){
	// 		return sueldo;
	// 	} else{
	// 		this.sueldo = sueldo;
	// 		return sueldo = 1000.00f;
	// 	}
	// }

	public boolean equals(Object o){
		boolean result = false;
		if ((o != null) && (o instanceof Maestro)){
			Maestro teacher = (Maestro) o;
			if (super.getNombre() == teacher.getNombre()
				 && sueldo == teacher.sueldo){
				result = true;
			}
		}
		return result;
	}

	public int hashCode(){
		int hashcode = super.getNombre().hashCode();
		return hashcode*(int)(sueldo);
	}

	public String toString(){
		return "Maestro "+ super.toString() +"\t"+ sueldo;
	}
}
	
