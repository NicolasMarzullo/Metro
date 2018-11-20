package metro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import grafo.Grafo;

public class Metro {

	public static Grafo cargarEntrada(String path) throws FileNotFoundException {

		Scanner sc = new Scanner(new File(path));
		int cantDeIslas, cantDeTuneles, cantDePuentes;

		cantDeIslas = sc.nextInt();
		cantDeTuneles = sc.nextInt();
		cantDePuentes = sc.nextInt();

		Grafo grafoMetro = new Grafo(cantDeIslas);
		
		for (int i = 0; i < cantDeTuneles; i++) {
			grafoMetro.setUnionIsla(sc.nextInt(), sc.nextInt(), 0);
		}
		
		for (int i = 0; i < cantDePuentes; i++) {
			grafoMetro.setUnionIsla(sc.nextInt(), sc.nextInt(), 1);
		}


		sc.close();
		
		return grafoMetro;
	}

	
	public static void escribirSalida(String path, int cantDePuentesUsados) throws FileNotFoundException {
		PrintWriter pw =  new PrintWriter(new File(path));
		pw.println(cantDePuentesUsados);
		pw.close();
	}
}
