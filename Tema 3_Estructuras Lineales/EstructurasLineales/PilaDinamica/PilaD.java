package PilaDinamica;

import PilaEstatica.PilaTDA;

public class PilaD <T> implements PilaTDA<T>{
	
	private Nodo <T> pila;
	
	public PilaD() {
		pila=null;
	}
	
	public boolean isEmptyPila() {
		return (pila==null);
	}

	public void pushPila(T dato) {
		Nodo <T> tope = new Nodo <T>(dato);
		if(isEmptyPila()) pila = tope;
		else {
			tope.sig = pila;
			pila = tope;
		}
	}

	public T popPila() {
		Nodo <T> tope = pila;
		T dato = (T) pila.getInfo();
		pila = pila.getSig();
		tope = null;
		return dato;
	}

	public T peekPila() {
		return (T) (pila.getInfo());
	}

	public String toString() {
		Nodo tope = pila;
		return toString(tope);
	}
	
	private String toString (Nodo i) {
		return (i!=null)?"tope ===>"+"["+i.getInfo()+"]\n"+toString(i.getSig()):"";
	}
	
}
