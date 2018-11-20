package grafo;

public class Arista implements Comparable<Arista> {

	private int nodoDestino;
	private int peso;

	public Arista(int nodoDestino, int peso) {
		this.nodoDestino = nodoDestino;
		this.peso = peso;
	}

	@Override
	public int compareTo(Arista otra) {
		return this.peso - otra.peso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nodoDestino;
		result = prime * result + peso;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arista other = (Arista) obj;
		if (nodoDestino != other.nodoDestino)
			return false;
		if (peso != other.peso)
			return false;
		return true;
	}

	public int getNodoDestino() {
		return nodoDestino +1;
	}

	public int getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return "Arista [nodoDestino=" + nodoDestino + ", peso=" + peso + "]";
	}
	
	
}
