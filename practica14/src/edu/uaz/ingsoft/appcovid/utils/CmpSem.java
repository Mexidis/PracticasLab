package edu.uaz.ingsoft.appcovid.utils;
import java.util.Comparator;
import edu.uaz.ingsoft.appcovid.cursos.Materia;
public class CmpSem implements Comparator<Materia> {
	public int compare(Materia m1, Materia m2){
		return m1.getSemestre()-m2.getSemestre();
	}
}