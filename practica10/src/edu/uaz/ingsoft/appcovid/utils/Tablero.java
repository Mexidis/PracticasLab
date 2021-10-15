package edu.uaz.ingsoft.appcovid.universitarios.utils;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;

public class Tablero{
	private static int poss = -1;
	public static final int MAX = 5;
	private static Universitario[] personas = new Universitario[MAX];

	private Tablero(){

	}

	public static void mostrar(){
		System.out.println("* El tablero contiene *");
		for (Universitario individual : personas) {
			if(personas.length < 0 || personas.length > MAX){
				System.out.println("-");
			} else{
				System.out.println(personas);
			}
		}
		System.out.print("* * * * * *");
	}

	public static void insertar(Universitario u){
		if(unos == null && (unos.length > poss &&){

		}
	}
}