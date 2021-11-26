package mx.edu.uaz.ingsoft.hilos.ventanas;

public class Acciones{
	private Ventana v;

	public Ventana(Ventana v){
		this.v = v;
	}

	public void iniciar(){
		Elemento e1 = new Elemento(v.getEtiqueta1(), 'X');
		Elemento e2 = new Elemento(v.getEtiqueta2(), 'X');
	}


}
