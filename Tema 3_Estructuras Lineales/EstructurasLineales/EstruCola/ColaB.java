package EstruCola;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ColaB <T> implements ColaTDA <T>{ // LinkedList
	
	private Queue cola;
	
	public ColaB() {
		cola = new LinkedList();
	}
	
	public int Size() {
		return cola.size();
	}
	
	public boolean isEmptyCola() {
		return (cola.isEmpty());
	}

	public T peekCola() {
		return (T) (cola.element());
	}
	
	public void vaciar() {
		cola.clear();
	}

	public void pushCola(T dato) {
		cola.add(dato);
	}

	public T popCola() {
		T dato;
		dato=(T) cola.element();
		cola.remove();
		return dato;
	}
	
	public String toString() {
		String cad="";
		byte j=0;
		for(Iterator i = cola.iterator();i.hasNext();) {
			cad+="["+i.next()+"] "+j;
			j++;
		}
		return cad;
	}
	
}
