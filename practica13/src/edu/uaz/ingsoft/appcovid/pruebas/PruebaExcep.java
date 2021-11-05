package edu.uaz.ingsoft.appcovid.pruebas;
import edu.uaz.ingsoft.appcovid.universitarios.*;
import edu.uaz.ingsoft.appcovid.universitarios.maestros.*;
import edu.uaz.ingsoft.appcovid.universitarios.alumnos.*;
import edu.uaz.ingsoft.appcovid.utils.*;
public class PruebaExcep {
	public static void main(String[] args) {
		try{
			Tablero.insertar(new Maestro("Cristian", 1000.f));
			Tablero.insertar(new Maestro("Jorge", 100000f));
			Tablero.insertar(new Alumno("Valeria"));
			Tablero.insertar(new Maestro("Federico", 5f));
			Tablero.insertar(new Alumno("Hanna"));
			Tablero.insertar(new Alumno("Miriam"));
		} catch (TableroException te){
			System.out.print(te +" "+te.getIndex());
		}
		Tablero.mostrar();
		Tablero.getPersonas();
	}
}