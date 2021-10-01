//hora de inicio: 7:34 AM
//Hora de finalización:  
package mx.com.softgame.poo1game.personajes;
public class Personaje{

	private String nombre;
	private int vida;

	public Personaje(String nombre, int vida){
		this.nombre = nombre;
		this.vida = vida;
	}
	public Personaje(String nombre){
		this.nombre = nombre;
		this.vida = 3;
	}
	public void decVida(){
		if (this.vida > 0) {
			this.vida -= 1;
		}
	}
	public void decVida(int dec){
		if (this.vida - dec > 0) {
			this.vida = this.vida - dec;
		}
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
	public String getDetalle() {
		return nombre+"\t"+vida;
	}	
	
}




