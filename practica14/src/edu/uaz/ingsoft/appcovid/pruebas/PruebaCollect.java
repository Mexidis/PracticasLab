package edu.uaz.ingsoft.appcovid.pruebas;
import edu.uaz.ingsoft.appcovid.cursos.Materia;
import edu.uaz.ingsoft.appcovid.utils.CmpSem;
import edu.uaz.ingsoft.appcovid.utils.CmpGrupo;
import edu.uaz.ingsoft.appcovid.utils.Tablero;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Collections;
public class PruebaCollect {
	public static void main(String[] args) {

		LinkedList <Materia> lista = new LinkedList <Materia> ();
		lista.add(new Materia("Programacion"));
		lista.add(new Materia("Algoritmos"));
		lista.add(new Materia("S. Operativos")); 
		lista.add(new Materia("Algoritmos"));
		lista.add(new Materia("Programacion"));

		TreeSet<Materia> tree1 = new TreeSet<Materia>();
		TreeSet<Materia> tree2 = new TreeSet<Materia>(new CmpSem());

		for (Materia m : lista) {
			System.out.println(m);
			int sem;
			sem = Tablero.getAleatorio(30);
			m.setSemestre(sem);
			char gpo;
			gpo = (char)(Tablero.getAleatorio(40)+65);
			m.setGrupo(gpo);
			tree1.add(m);
			tree2.add(m);
		}
		System.out.println("-------------------------");

		for (Materia m : tree1) {
			System.out.println(m);
		}
		System.out.println("-------------------------");

		for (Materia m : tree2) {
			System.out.println(m);
		}
		System.out.println("-------------------------");

		Collections.sort(lista, new CmpGrupo());
		for (Materia m : lista) {
			System.out.println(m);
		}
		System.out.println("-------------------------");
		
	}
}
