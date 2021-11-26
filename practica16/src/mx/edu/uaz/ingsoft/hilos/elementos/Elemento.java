package mx.edu.uaz.ingsoft.hilos.elementos;
import javax.swing.JLabel;
public class Elemento extends Thread {
	private char c;
	private JLabel etiqueta;

	public Elemento(JLabel etiqueta, char c ){
		this.c = c;
		this.etiqueta = etiqueta;
	}

	public void run(){
		String out = "";
		etiqueta.setText(""+c);
		//todos los primitivos, si se le antesuma un String vacio ""
		//el primitivo se convierte automáticamente a String
		for (int i = 0; i < 30 ; i++) {
			out += c;
			etiqueta.setText(out);
			try{
                Thread.sleep(500);
			} catch (InterruptedException e) {
            // ignore it
            }
		}
		out += " Finalizado";
		etiqueta.setText(out);
	}


}