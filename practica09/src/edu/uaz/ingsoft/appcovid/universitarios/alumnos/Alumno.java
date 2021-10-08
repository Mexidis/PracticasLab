package edu.uaz.ingsoft.appcovid.universitarios.alumnos;
import edu.uaz.ingsoft.appcovid.universitarios.*;

public class Alumno extends Universitario{
	private int grade;

	public Alumno(String nombre, int grade){
		super(nombre);
		if(grade <= 10  && grade >= 0){
			this.grade = grade;
		} else{
			grade = 5;
		}
	}

	public Alumno(String nombre){
		this(nombre, 5);
	}

	/* public int setGrade(int grade){
		if (grade <= 10  && grade >= 0){
			return grade;
		} else{
			this.grade = grade;
			return grade = 5;
		}
	}*/

	public boolean equals(Object o){
		boolean result = false;
		if ((o != null) && (o instanceof Alumno)){
			Alumno student = (Alumno) o;
			if (super.getNombre() == student.getNombre() && grade == student.grade){
				result = true;
			}
		}
		return result;
	}

	public int hashCode(){
		int hashcode = super.getNombre().hashCode();
		return hashcode*grade;
	}

	public String toString(){
		return super.toString() +"\t"+ grade;
	}

}