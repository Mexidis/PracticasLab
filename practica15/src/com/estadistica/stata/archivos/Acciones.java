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
		municipios = new ArrayList<Municipio>();
		try{
			BufferedReader input = new BufferedReader(new FileReader(file)); 
			String line;
			line = input.readLine();
			while (line != null){
				String[] arrayLine = line.split(";", 3);
				short posicion_1 = Short.parseShort(arrayLine[0]);
				String posicion_2 = arrayLine[1];
				int posicion_3 = Integer.parseInt(arrayLine[2]);
				municipios.add(new Municipio(posicion_1, posicion_2, posicion_3));
				line = input.readLine();
			}
			input.close();
		} catch (FileNotFoundException e1){
			System.err.println("File not found: "+file);
		} catch (IOException e2){
			e2.printStackTrace();
		}
	}

	public static char getCharAleat(){
		char charRandom = (char)((Math.random()*40)+65);
		return charRandom;
	}

	public static void guardarDatos(String s, char c){
		if (municipios == null){
			return;
		}
		int totalPopulation = 0;
		File file = new File(s);
		municipios = new ArrayList<Municipio>();
		try{
			InputStreamReader isr = new InputStreamReader (System)
			
		} catch (FileNotFoundException e1){
			System.err.println("File not found: "+file);
		} catch (IOException e2){
			e2.printStackTrace();
		}
	}
}