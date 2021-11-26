package mx.edu.uaz.ingsoft.hilos.ventanas;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame{
	private Acciones acc;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem miIniciarHilos;
	private JMenuItem miSalir;

	public Ventana(){
		acc = new Acciones(this);
		setJMenuBar(menuBar);
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		miIniciarHilos = new JMenuItem("Iniciar Hilos");
		mnArchivo.add(miIniciarHilos);
		miIniciarHilos.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				acc.iniciar();
			}
		});
		miSalir = new JMenuItem("Salir");
		mnArchivo.add(miSalir);
		miSalir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
			}
		});
	}

	public JLabel getEtiqueta1(){
		return etiquetaNorte;
	}
	public JLabel getEtiqueta1(){
		return etiquetaSur;
	}	

}