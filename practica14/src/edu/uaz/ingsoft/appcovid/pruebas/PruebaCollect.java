package edu.uaz.ingsoft.appcovid.pruebas;
import edu.uaz.ingsoft.appcovid.universitarios.*;
import edu.uaz.ingsoft.appcovid.universitarios.maestros.*;
import edu.uaz.ingsoft.appcovid.universitarios.alumnos.*;
import edu.uaz.ingsoft.appcovid.utils.*;
import java.util.LinkedList;
import java.util.TreeSet;
public class PruebaCollect {
	Materia m1 = new Materia("Programacion");
	Materia m2 = new Materia("Algoritmos");
	Materia m3 = new Materia("S. Operativos");
	Materia m4 = new Materia("Algoritmos");
	Materia m5 = new Materia("Programacion");

	LinkedList <Materia> lista = new ArrayList <Materia> ();
	lista.add(m1);
	lista.add(m2); 
	lista.add(m3);
	lista.add(m4);
	lista.add(m5); 

	TreeSet<Materia> ts = new TreeSet<Materia>();
