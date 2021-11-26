package mx.edu.uaz.ingsoft.hilos.elementos;

public class Elemento extends Thread {
	char c;
	JLabel etiqueta;

	public Elemento(char c, JLabel etiqueta){
		this.c = c;
		this.etiqueta = etiqueta;
	}

	public void run(){
		JLabel out = etiqueta;
	}
}