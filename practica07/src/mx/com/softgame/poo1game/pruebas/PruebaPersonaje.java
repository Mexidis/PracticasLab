//hora de inicio 7.05
package mx.com.softgame.poo1game.pruebas;
import  mx.com.softgame.poo1game.personajes.Personaje;

public class PruebaPersonaje{
	public static void main(String[] args) {
		Personaje per01 = new Personaje("Fernando");
		per01.setEdad(200);
		System.out.println(per01.getDetalle());
		Personaje per02 = new Personaje("Miriam");
		per02.setEdad(10);
		System.out.println(per02.getDetalle());
		Personaje per03 = new Personaje("Christian");
		per03.setEdad(1);
		System.out.println(per03.getDetalle());
		Personaje per04 = new Personaje("Valeria");
		per04.setEdad(-10);
		System.out.println(per04.getDetalle());
		Personaje per05 = new Personaje("Edwin");
		per05.setEdad(500);
		System.out.println(per05.getDetalle());
		
    }
}
//hora de finalizacion: 13.15