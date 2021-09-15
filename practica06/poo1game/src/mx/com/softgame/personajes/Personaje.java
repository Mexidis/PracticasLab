//hora de inicio 9:10 AM
package mx.com.softgame.personajes;
public class Personaje{

	//atributos
	private String nombre;
	private int edad;

	//constructores (no lleva tipo de dato 
	// y tiene el nombre de la clase)
	public Personaje(String nombre){
		//"this" es para el atributo
		this.nombre = nombre;
		//sin "this" es para la var. local (dentro del )
		edad = 0;
	}

	//metodos (llevan tipo de dato y puede ser 
	// cualquier otro nombre)
	public void setNombre(String nombre){
		if (setNombre(nombre)>3 && setNombre(nombre)<20){
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
	
}

//Hora de finalización 9.51



