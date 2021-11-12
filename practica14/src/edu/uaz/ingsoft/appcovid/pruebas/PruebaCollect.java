package edu.uaz.ingsoft.appcovid.pruebas;
import edu.uaz.ingsoft.appcovid.cursos.Materia;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Collections;
public class PruebaCollect {
	public static void main(String[] args) {

		LinkedList <Materia> lista = new ArrayList <Materia> ();
		lista.add(new Materia("Programacion"));
		lista.add(new Materia("Algoritmos"));
		lista.add(new Materia("S. Operativos")); 
		lista.add(new Materia("Algoritmos"));
		lista.add(new Materia("Programacion"));

		TreeSet<Materia> tree1 = new TreeSet<Materia>();
		tree1.add(new Materia("Programacion"));
		tree1.add(new Materia("Algoritmos"));
		tree1.add(new Materia("S. Operativos")); 
		tree1.add(new Materia("Algoritmos"));
		tree1.add(new Materia("Programacion"));
		
		TreeSet<Materia> tree2 = new TreeSet<Materia>(new CmpSem());
		tree2.add(new Materia("Programacion"));
		tree2.add(new Materia("Algoritmos"));
		tree2.add(new Materia("S. Operativos")); 
		tree2.add(new Materia("Algoritmos"));
		tree2.add(new Materia("Programacion"));
	}
}
