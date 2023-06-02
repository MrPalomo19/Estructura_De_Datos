package PilaDinamica;

public class Nodo <T> {
	
	public T info;
	public Nodo <T> sig;
	
	public Nodo(T info) {
		this.info=info;
		this.sig=null;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public Nodo <T> getSig() {
		return sig;
	}

	public void setSig(Nodo <T >sig) {
		this.sig = sig;
	}

	
	
}
