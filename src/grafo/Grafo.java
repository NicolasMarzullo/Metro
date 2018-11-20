package grafo;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Grafo {
	private int cantDeIslas;
	private ListaDeAdyacencia listaDeAristas;

	public Grafo(int cantDeIslas) {
		this.cantDeIslas = cantDeIslas;
		this.listaDeAristas = new ListaDeAdyacencia(cantDeIslas);
	}

	public void setUnionIsla(int islaOrigen, int islaDestino, int peso) {
		// Se lo paso decrementado para que lo ponga en la posicion correcta
		this.listaDeAristas.setUnion(islaOrigen - 1, islaDestino - 1, peso);
	}

	public int resolverPrim() {
		int cantDePuentesUsados = 0;
		PriorityQueue<Arista> colaDeAritas = new PriorityQueue<>();
		List<Integer> islasRecorridas = new LinkedList<>();
		int islaActual = 2; // Considero 1 la primer isla, es arbitraria la selección del mismo
		Arista aristaActual;

		// Busco aristas del nodo actual
		islasRecorridas.add(islaActual);

		while (islasRecorridas.size() != this.cantDeIslas) {
			for (Arista a : this.listaDeAristas.getAristasDeIsla(islaActual)) {
				colaDeAritas.add(a);
			}

			aristaActual = colaDeAritas.poll();
			while (islasRecorridas.contains(aristaActual.getNodoDestino())) {
				aristaActual = colaDeAritas.poll();

			}

			if (aristaActual.getPeso() == 1) {
				cantDePuentesUsados++;
			}

			islaActual = aristaActual.getNodoDestino();
			islasRecorridas.add(islaActual);

		}

		return cantDePuentesUsados;
	}
}
