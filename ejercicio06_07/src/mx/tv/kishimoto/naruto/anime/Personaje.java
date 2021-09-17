//hora de inicio 8:03 AM
package mx.tv.kishimoto.naruto.anime;

public class Personaje{

	//atributos
	private String nombre;
	//(int)(Math.random()*501)
	private int poder = 0 | 500;
	private int edad;

	//constructores

	public Personaje(String nombre, int poder){
		this.nombre = nombre;
		this.poder = poder;
	}

	//metodos 

	public void setPoder(int num){
		num = num + poder;
	}

	public void getDatos(){
		System.out.println("\t"+nombre+"\t"+poder);
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
	public void getDetalle() {
		System.out.println("Personaje "+nombre+"\t con edad "+edad);
	}	
	
}

//Hora de finalización 



