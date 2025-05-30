package edu.uaz.ingsoft.appcovid.cursos;
public class Materia implements Comparable<Materia> {
	private final String clase;
	private int semestre;
	private char grupo;

	public Materia(String clase){
		this.clase = clase;
		semestre = 1;
		grupo = 'A';
	}

	public String getClase(){
		return clase;
	}

	public int getSemestre(){
		return semestre;
	}

	public char getGrupo(){
		return grupo;
	}

	public void setSemestre(int sem){
		if (sem >= 1 && sem <= 16) {
			semestre = sem;
		}
	}

	public void setGrupo(char group){
		if (Character.isAlphabetic(group)) {
			grupo = group;
		}
	}

	public int compareTo(Materia m){
		if (clase.compareTo(m.clase) != 0){
			return clase.compareTo(m.clase);
		}
		if ((m.semestre - semestre) != 0){
			return m.semestre - semestre;
		}
		// if ((int)(m.grupo) == (int)(grupo)){
		// 	return (int)(grupo) - (int)(m.grupo);
		// }
		return (int)(m.grupo) - (int)(grupo);
	}
	public String toString(){
		return "{"+clase +"\t"+ semestre +"\t"+ grupo+"}";
	}
}