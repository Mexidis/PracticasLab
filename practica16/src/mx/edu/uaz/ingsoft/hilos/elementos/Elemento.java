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
		JLabel out = etiqueta;
		for (int i = 0; i < 30 ; i++) {
			String letraDeLaEtiqueta = String.valueOf(c);
			etiqueta.setText(letraDeLaEtiqueta);
			//pendiente
			try{
                Thread.sleep(500);
			} catch (InterruptedException e) {
            // ignore it
            }
		}
        //etiqueta "Finalizado" 
	}


}