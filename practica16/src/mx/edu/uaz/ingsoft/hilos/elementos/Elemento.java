package mx.edu.uaz.ingsoft.hilos.elementos;
import javax.swing.JLabel;
public class Elemento extends Thread {
	private char c;
	private JLabel etiqueta;

	public Elemento(char c, JLabel etiqueta){
		this.c = c;
		this.etiqueta = etiqueta;
	}

	// public char getChar(){
	// 	return c;
	// }
	// public JLabel getEtiqueta(){
	// 	return etiqueta;
	// }

	public void run(){
		// pendiente c = 'X'
		//JLabel out = c;
		for (int i = 0; i < 30 ; i++) {
			//pendiente
			try{
                Thread.sleep(500);
			} catch (InterruptedException e) {
            // ignore it
            }
		}
        JLabel etiqueta = new JLabel("Finalizado");
	}


}