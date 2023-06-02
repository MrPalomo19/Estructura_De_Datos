package Metodos;

import EntradaSalida.Tools;

public class DatosOrdenados {

	private int ordenados[];
	public byte p;
	
	public DatosOrdenados(int tam) {
		ordenados = new int[tam];
		p=-1;
	}
	
	public boolean validaEspacio () {
		return (p==-1);
	}
	
	public void imprimirArray() 
		{
			String cad="";
			for(int i=0;i<=p;i++) {
				cad+="["+i+"]"+ordenados[i]+"\n";
			}
			Tools.imprimirMSJE("Datos del array"+"\n"+cad);
		}
	
	public byte busSecuencialOrdenada(int dato) {
		byte i=0;
		while (i<=p && ordenados[i]<dato)
			i++;
		return (byte) ((i>p || ordenados[i]>dato)?-i:i);
		
	}
	
	public void eliminarDato(byte pos) {
		for(int K=pos;K<p;K++) {
			ordenados[K]=ordenados[K+1];
		}
		p--;
	}
	
	public void recorrePosicion(int pos) {
		for(int j=p+1; j>pos;j--) {
			ordenados[j]=ordenados[j-1];
		}
	}
	
	public void agregarOrdenado() {
		int dato=Tools.leerInt("Escribe un entero: ");
		if(validaEspacio()) {
			ordenados[p+1]=dato;
			p++;
		} else {
			int pos=busSecuencialOrdenada(dato);
			if(pos>0)Tools.imprimirMSJE("Ya existe el dato");
			else {
				pos*=-1;
				recorrePosicion(pos);ordenados[pos]=dato;
				p++;
			}
		}
	}

	public void modificarDato(byte pos) {
		int dato;
		if (pos==0) {
			do {
				dato=Tools.leerInt("Modificar: <:" +ordenados[pos+1]); }
		while (dato>ordenados[pos+1]); 
			ordenados[pos]=dato;	
		}
		else {
			if (pos==p) {
				do {
					dato=Tools.leerInt("Modificar >:" +ordenados[pos-1]); }
			while (dato<ordenados[pos-1]); 
				ordenados[pos]=dato;
			}
			else {
				if (pos>=1 || pos<=p-1) {
					do {
						dato=Tools.leerInt("Modificar: >:" +ordenados[pos-1]+" y <:" +ordenados[pos+1]); }
				while (dato>ordenados[pos+1] || dato<ordenados[pos-1]); 
					ordenados[pos]=dato;	
				}
			
			}
		}
	}
}
