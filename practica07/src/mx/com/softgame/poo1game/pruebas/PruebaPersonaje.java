//hora de inicio 7.05
package mx.com.softgame.poo1game.pruebas;
import  mx.com.softgame.poo1game.personajes.*;

public class PruebaPersonaje{
	public static void main(String[] args) {
		Personaje per01 = new Personaje("Fernando");
		Personaje per02 = new Personaje("Miriam");
		Personaje per03 = new Personaje("Christian");
		Personaje per04 = new Personaje("Valeria");
		Personaje per05 = new Personaje("Edwin");

		int n = 0;
		int m = 0;

		while(n>=m){
			n = (int)(Math.random()*100);
			m = (int)(Math.random()*100);
		}
		for(int i = n; i<=m; i++){
			int ed_1 = (int)(Math.random()*251);
			int ed_2 = (int)(Math.random()*251);
			int ed_3 = (int)(Math.random()*251);

			if(!per01.setEdad(ed_1)){
				System.out.println(per01.getNombre()+" "+per01.getEdad()+" se modifico la edad");
			} else{
				System.out.println(per01.getDetalle()+" sin modificacion en edad a "+per01.getEdad());
			}
			if(!per02.setEdad(ed_2)){
				System.out.println(per02.getNombre()+" "+per02.getEdad()+" se modifico la edad");
			} else{
				System.out.println(per02.getDetalle()+" sin modificacion en edad a "+per02.getEdad());
			}	
			if(!per03.setEdad(ed_3)){
				System.out.println(per03.getNombre()+" "+per03.getEdad()+" se modifico la edad");
			} else{
				System.out.println(per03.getDetalle()+" sin modificacion en edad a "+per03.getEdad());
			}

		}
    }
}
//hora de finalizacion: 