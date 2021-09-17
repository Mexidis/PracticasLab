//hora de inicio 8:02 AM
package mx.tv.kishimoto.naruto.anime;
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
	public void getDetalle() {
		System.out.println("Personaje "+nombre+"\t con edad "+edad);
	}	
	
}

//Hora de finalización 



