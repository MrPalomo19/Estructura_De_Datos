package Menus;

import EntradaSalida.Tools;
import EstruCola.ColaB;

public class MenuColaB {
	
	public static void main(String[] args) {
		menuColasB();
	}

	public static void menuColasB() {
		ColaB <String> Cola = new ColaB();
		String op="";
		do {
			op=Tools.seleccionBotonPilas("PUSH, POP, PEEK, FREE, SALIR");
			switch(op) {
			case "PUSH": Cola.pushCola(Tools.leerString("Dato:"));
			Tools.imprimirMSJE("Datos de la pila:\n"+Cola.toString());break;
			case "POP": if (Cola.isEmptyCola())Tools.imprimirErrorMSJE("Pila vacia");
			else
				Tools.imprimirMSJE("Dato eliminado de la cima de la pila:" +Cola.popCola()+"\n"+Cola.toString());break;
			case "PEEK": if(Cola.isEmptyCola())Tools.imprimirErrorMSJE("Pila vacia");
			else
				Tools.imprimirMSJE("Dato de la cima de la pila: ==>"+Cola.peekCola()+"\n"+Cola.toString());break;
			case "FREE": if(Cola.isEmptyCola())Tools.imprimirErrorMSJE("Pila vacia");
			else {
				Cola.vaciar();
			}
			break;
			}
		} while(!op.equals("SALIR"));
	}
	
}
