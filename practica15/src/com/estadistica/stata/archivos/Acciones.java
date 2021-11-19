package src.com.estadistica.stata.archivos;
import java.util.ArrayList;
import java.io.File;


public class Acciones{
	private static ArrayList<Municipio> municipios;

	public boolean esArchivo(String s){
		File file = new File(s);
		if(file.exists() && file.isDirectory()){
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