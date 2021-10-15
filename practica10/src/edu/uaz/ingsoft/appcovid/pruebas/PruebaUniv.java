package edu.uaz.ingsoft.appcovid.pruebas;
import edu.uaz.ingsoft.appcovid.universitarios.*;
import edu.uaz.ingsoft.appcovid.universitarios.maestros.*;
import edu.uaz.ingsoft.appcovid.universitarios.alumnos.*;
import edu.uaz.ingsoft.appcovid.utils.*;

public class PruebaUniv{
	public static void main(String[] args) {
		Tablero.insertar(new Universitario("Jose Miguel"));
		Tablero.insertar(new Maestro("Giovanna Esmeralda", 10f), 4);
		Tablero.insertar(new Alumno("Hanna Jimena", 80));
		Tablero.insertar(new Universitario("Saul Alfonso"));
		Tablero.insertar(new Maestro("Edwin Brayan", 5000f), 6);
		Tablero.insertar(new Alumno("Esther Sarahi", 5));
		/* hubo un error en la compilacion "cannot find symbol", por un error en 
		un paquete mal colocado y tambien en la parte de que no se necesita instancear
		para invocar
		*/
		Tablero.mostrar();
		Tablero.borrar(4);
		Tablero.borrar();
		Tablero.borrar(10);
		Tablero.mostrar();

	}
}