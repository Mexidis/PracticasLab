package edu.uaz.ingsoft.appcovid.universitarios.alumnos;
import edu.uaz.ingsoft.appcovid.universitarios.*;
import edu.uaz.ingsoft.appcovid.utils.*;

public class Alumno extends Universitario implements Tutorias{
	private static Calificacion[] calificaciones = new Calificacion[5];
	private float promedio;

	public Alumno(String nombre){
		super(nombre);
		setCalificacion();
		promedio = getPromedio();
	}

	public Calificacion[] getCalificaciones(){
		return calificaciones;
	}

	public float getPromedio(){
		float sumatoria = 0;
		for (Calificacion pos : calificaciones) {
			sumatoria += (float)pos.getCalif();
		}
		promedio = (float)(sumatoria / calificaciones.length);
		return promedio;
	}
	
	public void setCalificacion(){
		for (int i = 0; i < calificaciones.length; i++) {
			calificaciones[i] = Calificacion.CERO;
		}
	}

	public void setCalificacion(Calificacion c, int indice){
		calificaciones[indice] = c;
		promedio = getPromedio();
	}

	public void realizarTutoria(){
		System.out.println("Recibe tutorias");
		System.out.println(getCalificaciones());
	}

	public boolean equals(Object o){
		boolean result = false;
		if ((o != null) && (o instanceof Alumno)){
			Alumno student = (Alumno) o;
			if (super.getNombre().equals(student.getNombre())){
				Calificacion[] calificacionesStudent = student.getCalificaciones();
				for (int i = 0; i < calificaciones.length; i++){
					if(calificaciones[i].equals(calificacionesStudent[i])){
						result = true;
					} else {
						result = false;	
						break;
					}
				}
			} else {  
				result = false;		
			}	
		}
		return result;
	}

	public int hashCode(){
		int hashcode = super.getNombre().hashCode();
		for (Calificacion pos : calificaciones) {
			return hashcode*pos.getCalif();
		}
		return 0;
	}


	public String toString(){
		String alumno;
		String listadoCalif = "";
		String promedio;
		for (Calificacion pos : calificaciones) {
			listadoCalif += pos.getCalif() +" ";
		}
		alumno = "Alumno "+ super.toString() +"\t";
		promedio = String.valueOf(getPromedio());
		return alumno + listadoCalif +"  "+ promedio;
	}
}