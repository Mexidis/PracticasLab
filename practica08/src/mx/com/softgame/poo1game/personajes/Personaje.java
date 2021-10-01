//hora de inicio: 7:34 AM
//Hora de finalización:  
package mx.com.softgame.poo1game.personajes;
public class Personaje{

	private String nombre;
	private int vida;

	public Personaje(String nombre, int vida){
		this.nombre = nombre;
		vida = 3;
	}
	public Personaje(String nombre){
		this.nombre = nombre;
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
	public int getVida(){
		return vida;
	}
	public boolean setVida(int vida){
		if (!(vida > 0 && vida <100)){
			return false;
		}
			else{
				this.vida = vida;
				return true;
			}
	}
	public String getDetalle() {
		return nombre+"\t"+vida;
	}	
	
}




