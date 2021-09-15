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
		
	/*	Personaje alumno = new Personaje("Kal El");
		alumno.saludar();
		System.out.println("Nombre: "+alumno.getNombre()+" Edad: "+alumno.getEdad());
		System.out.println("Modificando el nombre "+alumno.getNombre());
		alumno.setNombre("Michael Jordan");
		alumno.saludar();
		if(!alumno.setEdad(30)){
			System.out.println("Edad sin cambios");
		}
		System.out.println("Nombre: "+alumno.getNombre()+" Edad: "+alumno.getEdad());
		System.out.println("Modificando edad en 130");
		if(!alumno.setEdad(130)){
			System.out.println("Edad sin cambio");
		}
	
		System.out.println("Nombre: "+alumno.getNombre()+" Edad: "+alumno.getEdad());
		*/
    }
}
//hora de finalizacion: 11.57