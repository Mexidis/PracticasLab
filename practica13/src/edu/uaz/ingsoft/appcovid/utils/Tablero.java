package edu.uaz.ingsoft.appcovid.utils;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;

public class Tablero{
	private static int poss = -1;
	public static final int MAX = 5;
	private static Universitario[] personas = new Universitario[MAX];

	private Tablero(){}

	public static Universitario[] getPersonas(){
		return personas;
	}
//metodo que muestra el estado del tablero, si contiene algo y 
//en que posicion esta ese algo
	public static void mostrar(){
		System.out.println("\n* El tablero contiene *");
		for (Universitario individual : personas) {
			if(individual == null){
				System.out.println("-");
			} else{
				System.out.println(individual);
			}
		}
		System.out.print("* * * * * *");
	}

//metodo que inserte un Universitario en la proxima
// posicion y de no ser posible se queda en la misma
// posicion y muestra el mensaje
	public static void insertar(Universitario u)
		throws TableroException{
		poss += 1;
		if(poss > -1 && poss < MAX  && personas[poss] == null){
			personas[poss] = u;
		} else{
			poss -= 1;
			throw new TableroException(" Imposible insertar en "
				, poss);
		}
	}
//metodo que inserta un Universitario en la posicion
// que el usuario quiera e igual que en el anterior
// muestra el mensaje pero no se mueve de posicion
	public static void insertar(Universitario u, int idx)
		throws TableroException{
		if(idx > -1 && idx < MAX && personas[idx] == null){
			personas[idx] = u;
		} else{
			throw new TableroException(" Imposible insertar en "
				, idx);
		}
	}

	public static void borrar()
		throws TableroException{
		if(poss > -1 && poss < MAX){
			personas[poss] = null;
			poss -= 1;
		} else{
			throw new TableroException(" Imposible borrar en "
				, poss);
		}
	}

	public static void borrar(int idx)
		throws TableroException{
		if(idx > -1 && idx < MAX && personas[idx] != null){
			personas[idx] = null;
		} else{
			throw new TableroException(" Imposible borrar en "
				, idx);
		}
	}
}