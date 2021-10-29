package edu.uaz.ingsoft.appcovid.pruebas;
import edu.uaz.ingsoft.appcovid.universitarios.*;
import edu.uaz.ingsoft.appcovid.universitarios.maestros.*;
import edu.uaz.ingsoft.appcovid.universitarios.alumnos.*;

public class Prueba{
	public static void main(String[] args) {
		Universitario[] personas = {
			new Universitario("Valeria"); 
			new Maestro("Federico", 5f);
			new Alumno("Hanna",80);
			new Universitario("Valeria");
			new Maestro("Federico", 1000f);
			new Alumno("Hanna", 5);
		};

		int i = 0;
		while(i<personas.length){
			for(Universitario uni : personas){
				if(personas[i] == uni){
					System.out.println("**** "+ personas[i] +" es identico a "+ 
						uni +", son el mismo objeto ****");	
					continue;
				} 
				if(personas[i].equals(uni)){
					System.out.println("**"+ personas[i] +" es igual a "+ 
						uni +", son diferentes objetos **");
					continue;
				} else{
					System.out.println(personas[i] +" != "+ uni);
				}
			}
			i++;
		}
	}
}