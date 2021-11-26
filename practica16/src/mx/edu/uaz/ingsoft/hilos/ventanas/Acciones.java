package mx.edu.uaz.ingsoft.hilos.ventanas;
import mx.edu.uaz.ingsoft.hilos.elementos.*;
public class Acciones{
	private Ventana v;

	public Acciones(Ventana v){
		this.v = v;
	}

	public void iniciar(){
		Elemento e1 = new Elemento(v.getEtiqueta1(), 'A');
		Elemento e2 = new Elemento(v.getEtiqueta2(), 'S');
	}


}
