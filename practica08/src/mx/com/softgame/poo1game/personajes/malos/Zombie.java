package mx.com.softgame.poo1game.personajes.malos;
import mx.com.softgame.poo1game.personajes.Personaje;

public class Zombie extends Personaje{
	private boolean ataque;

	public Zombie(String nombre, int vida, boolean ataque){
		super(nombre, vida);
		this.ataque = ataque;
	}
	public Zombie(String nombre, boolean ataque){
		super(nombre);
	}
	public Zombie(String nombre){
		super(nombre);
		this.ataque = false;
	}
	public String obtenerDetalle(){
		return super.getDetalle() + " " + ataque;
	}
	public void decVida(){
		if(ataque == false){
			super.decVida(3);
			return;
		}
		super.decVida(2);
	}
	public void decVida(int dec){
		if(ataque == false){
			super.decVida(dec*3);
			return;
		}
		super.decVida(dec*2);
	}

}