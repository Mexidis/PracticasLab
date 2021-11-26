package mx.edu.uaz.ingsoft.hilos.ventanas;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame{
	private Acciones acc;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem miIniciarHilos;
	private JMenuItem miSalir;
	private JLabel etiquetaNorte;
	private JLabel etiquetaSur;

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
		JLabel etiquetaNorte = new JLabel();
		//" ".add(etiquetaNorte);
		JLabel etiquetaSur = new JLabel();
		//" ".add(etiquetaSur);
	}

	public void mostrarVentana(){
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(menuBar);
		add(mnArchivo);
		add(miIniciarHilos);
		add(miSalir);
		add(etiquetaNorte, BorderLayout.NORTH);
		add(etiquetaSur, BorderLayout.SOUTH);
		setSize(800,200);
		pack();
		setVisible(true);
	}
		
	public JLabel getEtiqueta1(){
		return etiquetaNorte;
	}
	public JLabel getEtiqueta2(){
		return etiquetaSur;
	}	

}