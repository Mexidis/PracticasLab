//hora de inicio 8:03 AM
package mx.tv.kishimoto.naruto.pruebas;
import mx.tv.kishimoto.naruto.anime.*;

public class Escena{
	public static void main(String[] args) {
		Personaje naruto = new Personaje("Naruto", 1000);
		Personaje sasuke = new Personaje("Sasuke", -10);
		Personaje sakura = new Personaje("Sakura", 300);

		System.out.println("---");
		System.out.println(naruto.getDatos());
		System.out.println(sasuke.getDatos());
		System.out.println(sakura.getDatos());
		System.out.println("---");

		Personaje usumaki = naruto;
		System.out.println(usumaki.getDatos());
		System.out.println("---");

		int n = (int)(Math.random()*1001);
		while (n > 500){
			System.out.println(n);
			n = (int)(Math.random()*1001);
		}

	}
}