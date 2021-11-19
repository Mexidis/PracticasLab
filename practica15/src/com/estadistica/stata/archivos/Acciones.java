package com.estadistica.stata.archivos;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


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
		File file = new File(s);
		municipios = new ArrayList<Municipio>(file);
		try{
			BufferedReader input = new BufferedReader(new FileReader()); 
			String s;
			s = input.readLine();
			while (s != null){
				System.out.println(s);
				s = input.readLine();
			}
			input.close();
		} catch (FileNotFoundException e1){
			System.err.println("File not found: "+file);
		} catch (IOException e2){
			e2.printStackTrace();
		}
	}
}