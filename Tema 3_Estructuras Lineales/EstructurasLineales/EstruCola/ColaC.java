package EstruCola;

import java.util.ArrayList;

public class ColaC <T> implements ColaTDA <T>{ // ArrayList

	private ArrayList cola;
	byte u;
	
	public ColaC() {
		cola = new ArrayList();
		u=0;
	}
	
	public int Size() {
		return cola.size()-1;
	}
	
	@Override
	public boolean isEmptyCola() {
		return cola.isEmpty();
	}

	public void vaciar() {
		cola.clear();
	}
	
	public void pushCola(Object dato) {
		cola.add(dato);
		u++;
	}

	public T popCola() {
		T dato=(T) cola.get(0);
		cola.remove(0);
		u--;
		return dato;
	}

	public T peekCola() {
		return (T)cola.get(0);
	}
	
	public String toString() {
		return toString(0);
	}
	
	private String toString(int i) {
		return (i<u)?""+i+"["+cola.get(i)+"] ===>"+toString(i+1):"";
	}
	
}
