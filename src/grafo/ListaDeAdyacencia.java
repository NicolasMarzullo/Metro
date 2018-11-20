package grafo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaDeAdyacencia {

	private List<List<Arista>> adyacencia;

	public ListaDeAdyacencia(int cantDeIslas) {
		
		this.adyacencia = new ArrayList<>();
		
		for (int i = 0; i < cantDeIslas; i++) {
			adyacencia.add(new LinkedList<>());
		}
	}
	
	public void setUnion(int islaOrigen, int islaDestino, int peso) {
		
		if(islaOrigen == islaDestino) {
			return;
		}
		
		//la cargo doble porque es no dirigido
		this.adyacencia.get(islaOrigen).add(new Arista(islaDestino, peso));
		this.adyacencia.get(islaDestino).add(new Arista(islaOrigen, peso ));
	}
	
	public List<Arista> getAristasDeIsla(int isla) {
		return this.adyacencia.get(isla-1);
	}

}
