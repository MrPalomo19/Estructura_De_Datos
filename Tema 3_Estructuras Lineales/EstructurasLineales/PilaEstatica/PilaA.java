package PilaEstatica;

import EntradaSalida.Tools;

public class PilaA <T> implements PilaTDA<T> {
	private T pila[];
	private byte tope;
	
	public PilaA(int max) {
		pila=(T[])(new Object[max]);
		tope=-1;
	}
	
	public boolean isEmptyPila() {
		return(tope==-1);
	}
	
	public boolean isSpace() {
		return(tope<pila.length-1);
	}
	
	public void pushPila(T dato) {
		if (isSpace()) {
			tope++;
			pila[tope]=dato;
		}
		else
			Tools.imprimirErrorMSJE("PILA LLENA..!");
	}
	
	public T popPila() {
		T dato = pila[tope];
		tope--;
		return dato;
	}
	
	public T peekPila() {
		return pila[tope];
	}
	
	public String toString() {
		return toString(tope);
	}
	
	private String toString(int i) {
		return (i>=0)?"tope===>"+i+"["+pila[i]+"]\n"+toString(i-1):"";
	}
}
