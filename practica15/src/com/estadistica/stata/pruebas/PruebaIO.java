package com.estadistica.stata.pruebas;
import com.estadistica.stata.archivos.*;
import java.io.FileReader;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class PruebaIO {
	public static void main(String[] args) {
		File home = new File(System.getProperty("user.home"));
		if (home.isFile()) {
			System.out.println("No se puede continuar");
			System.exit(-1);
		}
		String path = home.getAbsolutePath()+
			System.getProperty("file.separator");
		String[] contenido = home.list();
		for (String posisActual : contenido) {
			File file = new File(path+posisActual);
			if (file.isFile() && posisActual.equals("datos.info")) {
				Acciones.procesar(path+posisActual);
			}
		}
		ArrayList<Municipio> municipios = Acciones.getMunicipios();
		System.out.println(municipios);
		Scanner sc = new Scanner(System.in);
		String archivoOut;
		System.out.println("Introduzca el nombre del archivo: ");
		archivoOut = sc.nextLine();
		archivoOut = path+archivoOut;
		char c = Acciones.getCharAleat();
		System.out.println("Los municipios que inician con "+
			c+" se guardaran en: "+ archivoOut);
		Acciones.guardarDatos(archivoOut, c);
	}
}
