package edu.uaz.ingsoft.appcovid.universitarios.alumnos;
import edu.uaz.ingsoft.appcovid.universitarios.*;
import edu.uaz.ingsoft.appcovid.utils.*;


public class Alumno extends Universitario{
	private static Calificacion[] calificaciones = new Calificacion[5];
	private float promedio;

	public Alumno(String nombre){
		super(nombre);
		setCalificacion();
		promedio = getPromedio();
	}

	// public void forEach(){
	// 	for (Calificacion pos : calificaciones) {
			
	// 	}
	// }

	public void setCalificacion(){
		for (Calificacion calif : calificaciones) {
			calif = Calificacion.CERO;
		}
	}

	public void setCalificacion(Calificacion c, int indice){
		calificaciones[indice] = c;
		S
	}

	public float getPromedio(){
		int n = 0;
		int sumatoria = 0;
		for (Calificacion pos : calificaciones) {
			sumatoria += pos.getCalif();
			n++;
			promedio = sumatoria / n;
		}
		return promedio;
	}

	// public Alumno(String nombre){
	// 	this(nombre, 5);
	// }

	public boolean equals(Object o){
		boolean result = false;
		if ((o != null) && (o instanceof Alumno)){
			Alumno student = (Alumno) o;
			for (Calificacion calif : calificaciones) {
				if (super.getNombre() == student.getNombre()  
					                        //no agarra este, checarlo
					&& calif.getCalif() == student.calif.getCalif()){
					result = true;
				}	
			}
		}
		return result;
	}

	public int hashCode(){
		int hashcode = super.getNombre().hashCode();
		for (Calificacion pos : calificaciones) {
			return hashcode*pos.getCalif();
		}
	}

	public String toString(){
		for (Calificacion pos : calificaciones) {
			return "Alumno "+ super.toString() +"\t"+ pos.getCalif();
		}
	}

}