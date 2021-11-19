package src.com.estadistica.stata;

public class Municipio{
	private short id;
	private String name;
	private int population;

	public Municipio(short id, String name, int population){
		this.id = id;
		this.name = name;
		this.population = population;
	}

	public short getId(){
		return getId;
	}
	public String getName(){
		return name;
	}
	public int getPopulation(){
		return population;
	}

	public String toString(){
		return "{"+id+"\t"+name+"\t"+population+"}"
	}
}