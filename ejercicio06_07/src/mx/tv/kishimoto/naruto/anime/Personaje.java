//hora de inicio 8:03 AM
package mx.tv.kishimoto.naruto.anime;

public class Personaje{

	//atributos
	private String nombre;
	private int poder;
	
	//constructores

	public Personaje(String nombre, int poder){
		this.nombre = nombre;
		this.poder = poder;
		if(poder > 500){
			this.poder = 500;
			return;
		}
		if (poder < 0) {
			this.poder = 0;
			return;
		}
		this.poder = poder;
	}

	//metodos 

	public void setPoder(int poder){
		int resultado = this.poder + poder;
		if(resultado > 500){
			this.poder = 500;
			return;
		}
		if(resultado < 0){
			this.poder = 0;
			return;
		}
		this.poder = resultado;
	}

	public String getDatos(){
		return nombre+"\t"+poder;
	}

	public void setNombre(String nombre){
		if (nombre.length() > 3 && nombre.length() < 20){
			this.nombre = nombre;
		}	
	}
	public String getNombre(){
		return nombre;
	}	
}

//Hora de finalización 10.41 



