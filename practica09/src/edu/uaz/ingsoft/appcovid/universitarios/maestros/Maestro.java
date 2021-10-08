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

	public float sueldo(){
		if (this.sueldo <= 20000.00f && this.sueldo >= 100.00f){
			return sueldo;
		} else{
			return sueldo = 1000.00f;
		}
	}
}
	
