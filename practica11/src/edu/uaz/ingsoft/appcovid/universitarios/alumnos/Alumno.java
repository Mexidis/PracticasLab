package edu.uaz.ingsoft.appcovid.universitarios.alumnos;
import edu.uaz.ingsoft.appcovid.universitarios.*;
import edu.uaz.ingsoft.appcovid.utils.*;


public class Alumno extends Universitario{
	private static Calificacion[] calificaciones = new Calificacion[5];
	private float promedio;

	public Alumno(String nombre){
		super(nombre);
		setCalificacion();

	}

	public void setCalificacion(){
		for (Calificacion calif : calificaciones) {
			calif = Calificacion.CERO;
		}
	}

	public void setCalificacion(Calificacion c, int indice){
		calificaciones[indice] = c;
		int sumatoria = 0;
		for (Calificacion pos : calificaciones) {
			sumatoria = sumatoria + ;
			promedio = sumatoria / calificaciones.length;
		}
	}

	// public Alumno(String nombre){
	// 	this(nombre, 5);
	// }

	public boolean equals(Object o){
		boolean result = false;
		if ((o != null) && (o instanceof Alumno)){
			Alumno student = (Alumno) o;
			if (super.getNombre() == student.getNombre() && 
				calificaciones[] == student.calificaciones[]){
				result = true;
			}
		}
		return result;
	}

	public int hashCode(){
		int hashcode = super.getNombre().hashCode();
		return hashcode*calificaciones[];
	}

	public String toString(){
		return "Alumno "+ super.toString() +"\t"+ calificaciones[];
	}

}