package mx.com.softgame.poo1game.personajes.buenos;
import mx.com.softgame.poo1game.personajes.Personaje;
public class Planta extends Personaje{
	private char escudo;

	public Planta(String nombre, int vida, char escudo){
		super(nombre, vida);
		this.escudo = escudo;
	}
	public Planta(String nombre, char escudo){
		this(nombre, 3, escudo);
	}
	public Planta(String nombre, int vida){
		this(nombre, vida, 'A');
	}
	public Planta(String nombre){
		this(nombre, 3, 'A');
	}

	public char getEscudo(){
		return escudo;
	}

	public String getDetail(){
		return super.getDetalle() + " " + escudo;
	}

	public void decVida(){
		if(escudo == 'A'){
			super.decVida(2);
			return;
		}
		super.decVida();
	}
	public void decVida(int dec){
		if(escudo == 'A'){
			super.decVida(dec*2);
			return;
		}
		super.decVida(dec);
	}
}