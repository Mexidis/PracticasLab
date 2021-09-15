//hora de inicio 9.10
package mx.com.softgame.pruebas;
import  mx.com.softgame.personajes.Personaje;

public class PruebaPersonaje{
	public static void main(String[] args) {
		Personaje per01 = new Personaje("Aline");
		per01.setEdad(200);
		per01.getDetalle();
		Personaje per02 = new Personaje("Valeria");
		per02.setEdad(10);
		per02.getDetalle();
		Personaje per03 = new Personaje("Federico");
		per03.setEdad(1);
		per03.getDetalle();
		Personaje per04 = new Personaje("Mayela");
		per04.setEdad(-10);
		per04.getDetalle();
		Personaje per05 = new Personaje("Edwin");
		per05.setEdad(500);
		per05.getDetalle();

		Personaje per06=per05;
		Personaje per07=per04;
		Personaje per08=per03;
		Personaje per09=per02;
		Personaje per10=per01;

		per06.setNombre("Patrick Alberto Camilo");
		per08.setNombre("Hanna");
		per10.setNombre("Jorge Abraham");

		int nuevaEdad_1 = (int)(Math.random()*1001);
		int nuevaEdad_2 = (int)(Math.random()*1001);
		per07.setEdad(nuevaEdad_1);
		per09.setEdad(nuevaEdad_2);

		per01.getDetalle();
		per02.getDetalle();
		per03.getDetalle();
		per04.getDetalle();
		per05.getDetalle();
    }
}
//hora de finalizacion: 13.15