package edu.uaz.ingsoft.appcovid.universitarios.utils;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;

public class Tablero{
	private static int poss = -1;
	public static final int MAX = 10;
	private static Universitario[] personas = new Universitario[MAX];

	private Tablero(){

	}

	public static void mostrar(){
		System.out.println("* El tablero contiene *");
		for (Universitario individual : personas) {
			if(individual == null){
				System.out.println("-");
			} else{
				System.out.println(individual);
			}
		}
		System.out.print("* * * * * *");
	}

	public static void insertar(Universitario u){
		poss += 1;
		if(poss > -1 && poss < MAX){
			personas[poss] = u;
		} else{
			System.out.println("Imposible insertar en "+ poss);
		}
	}

	public static void insertar(Universitario u, int idx){
		if(idx > -1 && idx < MAX){
			personas[idx] = u;
		} else{
			System.out.println("Imposible insertar en "+ idx);
		}
	}

	public static void borrar(){
		if(poss > -1 && poss < MAX){
			personas[poss] = null;
		} else{
			System.out.println("Imposible borrar en "+ poss);
		}
		poss -= 1;
	}

	public static void borrar(int idx){
		if(idx > -1 && idx < MAX){
			personas[idx] = null;
		} else{
			System.out.println("Imposible borrar en "+ idx);
		}
	}


}