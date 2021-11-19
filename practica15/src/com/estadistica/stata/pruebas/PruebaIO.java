package com.estadistica.stata.pruebas;
import com.estadistica.stata.archivos.*;
import java.io.File;

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
		// for (Municipio entidadActual : municipios) {
		// 	if (entidadActual.isFile() && entidadActual == "datos.info") {
		// 		Acciones.procesar(path+entidadActual);
		// 	}
		// }
		municipios = Acciones.getMunicipios();
	}
}
