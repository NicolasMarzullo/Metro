package tests;

import java.io.FileNotFoundException;

import org.junit.Test;

import grafo.Grafo;
import metro.Metro;

public class metroTests {
	
	@Test
	public void testCasoEnunciado() {
		//Out esperado: 2
		
		try {
			Grafo grafo = Metro.cargarEntrada("tests/lotes/in/01_CasoEnunciado.in");
			Metro.escribirSalida("tests/lotes/out/01_CasoEnunciado.out", grafo.resolverPrim());
		} catch (FileNotFoundException e) {
			System.out.println("ERROR en la lectura del archivo");
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCasoNingunPuente() {
		try {
			Grafo grafo = Metro.cargarEntrada("tests/lotes/in/02_CasoNingunPuente.in");
			Metro.escribirSalida("tests/lotes/out/02_CasoNingunPuente.out", grafo.resolverPrim());
		} catch (FileNotFoundException e) {
			System.out.println("ERROR en la lectura del archivo");
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCasoFatigaSinPuentes() {
		try {
			Grafo grafo = Metro.cargarEntrada("tests/lotes/in/03_CasoFatigaSinPuentes.in");
			Metro.escribirSalida("tests/lotes/out/03_CasoFatigaSinPuentes.out", grafo.resolverPrim());
		} catch (FileNotFoundException e) {
			System.out.println("ERROR en la lectura del archivo");
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCasoFatigaSolo5Tuneles() {
		try {
			Grafo grafo = Metro.cargarEntrada("tests/lotes/in/04_CasoFatigaSolo5Tuneles.in");
			Metro.escribirSalida("tests/lotes/out/04_CasoFatigaSolo5Tuneles.out", grafo.resolverPrim());
		} catch (FileNotFoundException e) {
			System.out.println("ERROR en la lectura del archivo");
			e.printStackTrace();
		}
	}


}
