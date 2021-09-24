//hora de inicio 7:05 AM
package mx.com.softgame.poo1game.personajes;
public class Personaje{

	//atributos
	private String nombre;
	private int edad;

	public Personaje(String nombre){
		this.nombre = nombre;
	}

	//metodos (llevan tipo de dato y puede ser 
	// cualquier otro nombre)
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
		return "Personaje "+nombre+"\t con edad "+edad;
	}	
	
}

//Hora de finalización 13.15



