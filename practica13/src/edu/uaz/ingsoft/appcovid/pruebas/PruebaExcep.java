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

		Universitario[] arregloPersonas = Tablero.getPersonas();
		for (Universitario univ: arregloPersonas) {
			if (univ instanceof Alumno) {
				((Alumno)univ).llenarCalificaciones();
			}
		}
		Tablero.mostrar();

		Maestro u1 = new Maestro("Patrick", 100f);
		Alumno u2 = new Alumno("Sarahi");
		u2.llenarCalificaciones();

		for (int i = 0; i<10 ; i++) {
			int rand = (int)(Math.random()*20);
			try{
				if (i % 2 == 0) {
					Tablero.insertar(u1, rand);
					Tablero.insertar(u2, rand + 1);
				} else if (i % 2 != 0) {
					Tablero.borrar(rand);
				}
			}	
		}
		Tablero.mostrar();
	}
}