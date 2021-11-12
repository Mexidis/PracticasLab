package edu.uaz.ingsoft.appcovid.utils;
import java.util.Comparator;
import edu.uaz.ingsoft.appcovid.cursos.Materia;
public class CmpGrupo implements Comparator<Materia> {
	public int compare(Materia m1, Materia m2){
		return (int)m1.getGrupo()-(int)m2.getSemestre();
	}
}