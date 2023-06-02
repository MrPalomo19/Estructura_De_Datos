package PilaDinamica;

import java.util.ArrayList;
import PilaEstatica.PilaTDA;

public class PilaC<T> implements PilaTDA<T> {
	private ArrayList pila;
	int tope;

	public PilaC() {
		pila = new ArrayList();
		tope=-1;
	}
	
	public int Size() {
		return pila.size();
	}
	
	public boolean isEmptyPila() {
		return pila.isEmpty();
	}
	
	public void vaciar() {
		pila.clear();
	}
	
	public void pushPila(Object dato) {
		pila.add(dato);
		tope++;
	}
	
	public T popPila() {
		T dato=(T) pila.get(tope);
		pila.remove(tope);
		tope--;
		return dato;
	}
	
	public T peekPila() {
		return (T)pila.get(tope);
	}
	
	public String toString() {
		return toString(tope);
	}
	
	private String toString(int i) {
		return (i>=0)?"tope ===>"+i+"["+pila.get(i)+"]\n"+toString(i-1):"";
	}
	
}
