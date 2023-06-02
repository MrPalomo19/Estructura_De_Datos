package Arboles;

public class Nodito <T> {
	private T info;
	Nodito <T> izq;
	Nodito <T> der;
	
	public Nodito (T dato) {
		this.info=dato;
		this.izq=null;
		this.der=null;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public Nodito <T> getIzq() {
		return izq;
	}

	public void setIzq(Nodito <T> izq) {
		this.izq = izq;
	}

	public Nodito <T> getDer() {
		return der;
	}

	public void setDer(Nodito <T> der) {
		this.der = der;
	}
}
