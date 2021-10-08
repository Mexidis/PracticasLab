package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.buenos.*;
import mx.com.softgame.poo1game.personajes.malos.*;
import mx.com.softgame.poo1game.personajes.*;

public class PruebaHerencia{
	public static void main(String[] args) {		
		Personaje per01 = new Personaje("Miguel", 99);
		Personaje per02 = new Personaje("Sarahi");
		Planta plan01 = new Planta("Angel", 10, 'B');
		Planta plan02 = new Planta("Giovana", 50);
		Planta plan03 = new Planta("Antonio", 'C');
		Planta plan04 = new Planta("Valeria");
		Zombie zom01 = new Zombie("Alan", 80, false);
		Zombie zom02 = new Zombie("Mayela", true);
		Zombie zom03 = new Zombie("Carlos");

		Personaje[] personajes = {
			per01, per02, plan01, plan02, plan03,
			plan04, zom01, zom02, zom03
		};
		for(Personaje locos : personajes ){
			int crackear = (int)(Math.random()*10);
			locos.decVida(crackear);
			System.out.println(locos.getDetalle());
			if(locos instanceof Planta){
				Planta plan = (Planta)locos;
				
				System.out.println("Soy planta "+ plan.getEscudo());
			}
			if(locos instanceof Zombie){
				Zombie zombo = (Zombie)locos;
				System.out.println("Soy Zombie "+ zombo.getAtaque());
			}

			System.out.println(locos.getDetalle());
		}
	}
}