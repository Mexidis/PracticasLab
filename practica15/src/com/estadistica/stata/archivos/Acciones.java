package src.com.estadistica.stata;
import java.io.ArrayList;

public class Acciones{
	private static ArrayList<Municipio> municipios = new ArrayList();

	public boolean esArchivo(String s){
		
		if(s.exists() && s.isDirectory()){
			return true;			
		}
		return false;
	}

	// public void procesar(String s){
	// 	municipios = new ArrayList<Municipio>();
	// 	String line;
	// 	line = buf
	// }
}