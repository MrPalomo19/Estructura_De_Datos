package Metodos;

import EntradaSalida.Tools;

public class DatosDesordenados {

	private int datos[];
	private byte J;
	
	public DatosDesordenados(int tan) {
		datos = new int[tan];
		J=-1;
	}
	
	public boolean validaEspacio () {
		return (J==-1);
	}
	
	public void agregarDatos() {
		if(J<datos.length-1) {
			datos[J+1]=Tools.leerInt("Escribe un valor: ");
			J++;
		}
		else
			Tools.imprimirErrorMSJE("Array lleno");
	}
	
	public void imprimirArray() {
			String cad="";
			for(int i=0;i<=J;i++) {
				cad+="["+i+"]"+datos[i]+"\n";
			}
			Tools.imprimirMSJE("Datos del array " +"\n" +cad);
		}
	
	public byte busquedaSecuencial() {
	    int dato = Tools.leerInt("Buscar: ");
	    byte i = 0;
	    while (i <= J && dato != datos[i])
	        i++;

	    if (i > J) {
	        Tools.imprimirErrorMSJE("Dato no encontrado");
	        return -1;
	    } else {
	        Tools.imprimirMSJE("Posición: " + i);
	    }
	    return i;
	}

	public void Modificar() {
	    if (validaEspacio())
	        Tools.imprimirErrorMSJE("Array vacio");
	    else {
	        byte pos = busquedaSecuencial();
	        if (pos != -1) {
	            int Nuevodat = Tools.leerInt("Ingrese el nuevo dato: ");
	            datos[pos] = Nuevodat;
	            imprimirArray();
	        } else {
	            Tools.imprimirErrorMSJE("Dato no encontrado");
	        }
	    }
	}

	public void eliminarDato(byte pos) {
	    if (pos >= 0 && pos <= J) {
	        for (int K = pos; K < J; K++) {
	            datos[K] = datos[K + 1];
	        }
	        J--;
	    } else {
	        Tools.imprimirErrorMSJE("Posición inválida");
	    }
	}

	
	public String decimalBinario(int valor) {
		String bin="";
		while(valor!=0) {
			bin = valor%2+bin;
			valor%=2;
		}
		return bin;
		}
}

