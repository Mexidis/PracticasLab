public class Materia  {
	private final String clase;
	private int semestre;
	private char grupo;

	public Materia(String clase, int semestre, char grupo){
		this.clase = clase;
		this.semestre = 1;
		this.grupo = 'A';
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
		if (sem <= 1 && sem >= 16) {
			semestre = sem;
		}
	}
}