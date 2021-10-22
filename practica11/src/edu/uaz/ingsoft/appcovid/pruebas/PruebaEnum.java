package edu.uaz.ingsoft.appcovid.pruebas;
import edu.uaz.ingsoft.appcovid.universitarios.*;
import edu.uaz.ingsoft.appcovid.universitarios.maestros.*;
import edu.uaz.ingsoft.appcovid.universitarios.alumnos.*;
import edu.uaz.ingsoft.appcovid.utils.*;
public class PruebaEnum{
	public static void main(String[] args) {
		Alumno a = new Alumno("Patrick");
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println(a);

			private Calificacion getCalifAleatoria(){
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
					a.setCalificacion(c, indice);
					System.out.println(a);
				}
			}
		}
	}

}