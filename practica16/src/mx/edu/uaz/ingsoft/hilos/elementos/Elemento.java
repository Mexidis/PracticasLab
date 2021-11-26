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
		String out;
		String letraDeLaEtiqueta = String.valueOf(c);
		out.setText(letraDeLaEtiqueta);
		for (int i = 0; i < 30 ; i++) {
			
			//pendiente
			try{
                Thread.sleep(500);
			} catch (InterruptedException e) {
            // ignore it
            }
		}
        //out = etiqueta "Finalizado" 
	}


}