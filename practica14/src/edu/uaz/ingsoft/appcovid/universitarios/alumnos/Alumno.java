package edu.uaz.ingsoft.appcovid.universitarios.alumnos;
import edu.uaz.ingsoft.appcovid.universitarios.*;
import edu.uaz.ingsoft.appcovid.utils.*;

public class Alumno extends Universitario implements Tutorias{
	private Calificacion[] calificaciones = new Calificacion[5];
	private float promedio;

	public Alumno(String nombre){
		super(nombre);
		setCalificacion();
		promedio = getPromedio();
	}
	//metodo que regresa todo el arreglo de calificaciones
	public Calificacion[] getCalificaciones(){
		return calificaciones;
	}
	//metodo que obtiene el promedio de las calificaciones del arreglo
	public float getPromedio(){
		float sumatoria = 0;
		for (Calificacion pos : calificaciones) {
			sumatoria += (float)pos.getCalif();
		}
		promedio = (float)(sumatoria / calificaciones.length);
		return promedio;
	}
	//metodo de la clase abstracta usado para imprimir el listado de calificaciones
	//seguido del promedio de las mismas
	public void getNota(){
		String listadoCalif = "";
		for (Calificacion pos : calificaciones) {
			listadoCalif += pos.getCalif() +" ";
		}
		System.out.println("  "+ listadoCalif +" "+getPromedio());
	}
	//metodo que genera calificaciones aleatorias de la clase enumerada
	private static Calificacion getCalifAleatoria(){
		int rand = (int)(Math.random()*10);
			switch (rand) {
				case 0: return Calificacion.CERO;
				case 1: return Calificacion.UNO;
				case 2: return Calificacion.DOS;
				case 3: return Calificacion.TRES;
				case 4: return Calificacion.CUATRO;
				case 5: return Calificacion.CINCO;
				case 6: return Calificacion.SEIS;
				case 7: return Calificacion.SIETE;
				case 8: return Calificacion.OCHO;
				case 9: return Calificacion.NUEVE;
				case 10: return Calificacion.DIEZ;
			}
		return Calificacion.CERO;					
	}
	//metodo que establece las calificaciones de todos los 
	//indices automaticamente en 0
	public void setCalificacion(){
		for (int i = 0; i < calificaciones.length; i++) {
			calificaciones[i] = Calificacion.CERO;
		}
	}
	//metodo que establece las calificaciones que el usuario lo asigne
	//en el indice que lo prefiera
	public void setCalificacion(Calificacion c, int indice){
		calificaciones[indice] = c;
		promedio = getPromedio();
	}
	//metodo de la interface Tutoria que se implementa para imprimir
	// un mensaje de estado y sus calificaciones
	public void realizarTutoria(){
		System.out.println("Recibe Tutorias");
		String listadoCalif = "";
		for (Calificacion pos : calificaciones) {
			listadoCalif += pos.getCalif() +" ";
		}
		System.out.println("  "+ listadoCalif); 
	}
	//metodo local para asignar valores aleatorios a los elementos del arreglo
	//usando el metodo para obtener calificaciones aleatorias del enum
	public void llenarCalificaciones(){
		for (int i = 0 ; i < calificaciones.length ; i++) {
			setCalificacion(getCalifAleatoria(), i);
		}
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
	//metodo toString que regresa nombre del alumno, sus calificaciones
	//y el promedio que tiene
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