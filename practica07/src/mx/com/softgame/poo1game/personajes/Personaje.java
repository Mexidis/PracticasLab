//hora de inicio 7:05 AM
package mx.com.softgame.poo1game.personajes;
public class Personaje{

	private String nombre;
	private int edad;

	public Personaje(String nombre){
		this.nombre = nombre;
		edad = 0;
	}
	public void setNombre(String nombre){
		if (nombre.length() > 3 && nombre.length() < 20){
			this.nombre = nombre;
		}	
	}
	public String getNombre(){
		return nombre;
	}
	public void saludar(){
		System.out.println("Hola Alumno de POO "+nombre);
	}
	public int getEdad(){
		return edad;
	}
	public boolean setEdad(int edad){
		if (!(edad > 0 && edad <120)){
			return false;
		}
			else{
				this.edad = edad;
				return true;
			}
	}
	public String getDetalle() {
		return nombre+" "+edad;
	}	
	
}

//Hora de finalización 10.48



