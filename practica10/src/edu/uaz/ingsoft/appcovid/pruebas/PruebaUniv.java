package edu.uaz.ingsoft.appcovid.pruebas;
import edu.uaz.ingsoft.appcovid.universitarios.*;
import edu.uaz.ingsoft.appcovid.universitarios.maestros.*;
import edu.uaz.ingsoft.appcovid.universitarios.alumnos.*;
import edu.uaz.ingsoft.appcovid.utils.*;

public class PruebaUniv{
	public static void main(String[] args) {
		Tablero.insertar(new Universitario("Jose Miguel"));
		// insertar(new Maestro("Giovanna Esmeralda", 10f), 4);
		// insertar(new Alumno("Hanna Jimena", 80));
		// insertar(new Universitario("Saul Alfonso"));
		// insertar(new Maestro("Edwin Brayan", 5000f), 6);
		// insertar(new Alumno("Esther Sarahi", 5));

		System.out.println(mostrar());

	}
}