package EstruCola;

import EntradaSalida.Tools;

public class ColaA <T >implements ColaTDA <T> { // Memoria Estatica
	
	private T cola[];
	private byte u;
	
	public ColaA(byte max) {
		cola = (T[])(new Object[max]);
		u=-1;
	}
	
	public boolean isEmptyCola() {
		return (u==-1);
	}
	
	public boolean isSpaceCola() {
		return (u<cola.length-1);
	}
	
	public void pushCola(T dato) {
		if(isSpaceCola()) {
			u++;
			cola[u]=dato;
		}
		else {
			Tools.imprimirErrorMSJE("Cola llena");
		}
	}
	
	public void recorrePosicion() {
		for(int j=0; j<u;j++) {
			cola[j]=cola[j+1];
		}
	}
	
	public T popCola() {
		T dato=cola[0];
			recorrePosicion();
		u--;
		return dato;
	}
	
	public T peekCola() {
		return cola[0];
	}
	
	public void freeCola() {
		cola=null;
		u=-1;
	}
	
	public String toString() {
		return toString(u);
	}
	
	private String toString(int i) {
		return (i<=u)?"===>"+i+"["+cola[i]+"]\n"+toString(i+1):"";
	}
	
}
