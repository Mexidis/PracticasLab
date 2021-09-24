//hora de inicio 7.05
package mx.com.softgame.poo1game.pruebas;
import  mx.com.softgame.poo1game.personajes.*;

public class PruebaPersonaje{
	public static void main(String[] args) {
		Personaje per01 = new Personaje("Fernando");
		Personaje per02 = new Personaje("Miriam");
		Personaje per03 = new Personaje("Christian");
		Personaje per04 = new Personaje("Valeria");

		int n = 0;
		int m = 0;

		while(n>=m){
			n = (int)(Math.random()*100);
			m = (int)(Math.random()*100);
		}
		outfor:
		for(int i = n; i<=m; i++){
			int ed = (int)(Math.random()*250);
			if(per01.setEdad(ed)){
				System.out.println(per01.getDetalle()+" se modifico la edad");
			} else{
				System.out.println(per01.getDetalle()+" sin modificacion en edad a "+ed);
			}
			ed = (int)(Math.random()*250);
			if(per02.setEdad(ed)){
				System.out.println(per02.getDetalle()+" se modifico la edad");
			} else{
				System.out.println(per02.getDetalle()+" sin modificacion en edad a "+ed);
			}	
			ed = (int)(Math.random()*250);
			if(per03.setEdad(ed)){
				System.out.println(per03.getDetalle()+" se modifico la edad");
			} else{
				System.out.println(per03.getDetalle()+" sin modificacion en edad a "+ed);
			}

			ed = (int)(Math.random()*150);
			do{
				ed = (int)(Math.random()*150);
				if (ed == 150){
					System.out.println("***Bingo 150***");
					// outfor
					continue outfor;
				} 
			} while (!per04.setEdad(ed));
			System.out.println(per04.getDetalle());
		}
    }
}
//hora de finalizacion: 10.48