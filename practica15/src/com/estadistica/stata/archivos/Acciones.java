package com.estadistica.stata.archivos;
import java.util.ArrayList;
import java.io.File;


public class Acciones{
	private static ArrayList<Municipio> municipios;

	public static boolean esArchivo(String s){
		File file = new File(s);
		if(file.isFile()){
			return true;			
		}
		return false;
	}

	public static void procesar(String s){
		municipios = new ArrayList<Municipio>();
	// 	String line;
	// 	line = buf;
	}
}