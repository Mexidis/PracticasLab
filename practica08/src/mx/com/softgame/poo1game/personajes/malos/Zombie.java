package mx.com.softgame.poo1game.personajes.malos;
import mx.com.softgame.poo1game.personajes.Personaje;

public class Zombie extends Personaje{
	private boolean ataque;

	public Zombie(String nombre, int vida, boolean ataque){
		super(nombre, vida);
		this.ataque = ataque;
	}
	public Zombie(String nombre, boolean ataque){
		this(nombre, 3, ataque);
	}
	public Zombie(String nombre){
		this(nombre, 3, false);
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
	public boolean getAtaque(){
		return ataque;
	}

}