package edu.uaz.ingsoft.appcovid.pruebas;
import edu.uaz.ingsoft.appcovid.universitarios.*;
import edu.uaz.ingsoft.appcovid.universitarios.maestros.*;
import edu.uaz.ingsoft.appcovid.universitarios.alumnos.*;
import edu.uaz.ingsoft.appcovid.utils.*;

public class PruebaAbstract {
	public static void main(String[] args) {
		Maestro m1 = new Maestro("Carolina", 10000f);
		Maestro m2 = new Maestro("Jorge",20000f);
		Alumno a1 = new Alumno("Miriam");
		Alumno a2 = new Alumno("Patrick");
		Universitario[] universitarios = {
			m1, m2, a1, a2
			// new Maestro("Carolina", 10000f),
			// new Maestro("Jorge",20000f),
			// new Alumno("Miriam"),
			// new Alumno("Patrick"),
		};
		for (Universitario posic: universitarios) {
			if (posic == a1){
				//System.out.println(posic);
				a1.llenarCalificaciones();			
			} else if (posic == a2) {
				//System.out.println(posic);
				a2.llenarCalificaciones();
			}
			System.out.println(posic);
			posic.getNota();
			posic.realizarTutoria();
		}
	}
}
