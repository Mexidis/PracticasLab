package edu.uaz.ingsoft.appcovid.pruebas;
import edu.uaz.ingsoft.appcovid.universitarios.*;
import edu.uaz.ingsoft.appcovid.universitarios.maestros.*;
import edu.uaz.ingsoft.appcovid.universitarios.alumnos.*;
import edu.uaz.ingsoft.appcovid.utils.*;

public class PruebaAbstract {
	public static void main(String[] args) {
		Universitario[] universitarios = {
			// new Universitario("Aldo"), 
			new Maestro("Carolina", 10000f),
			new Maestro("Jorge",20000f),
			new Alumno("Miriam"),
			new Alumno("Patrick"),
		};
		for (Universitario posic: universitarios) {
			if (posic == universitarios[2] || universitarios[3]){
				posic.llenarCalificaciones();
			}
			System.out.println(posic);
			posic.realizarTutoria();
			posic.getNota();
		}
	}
}