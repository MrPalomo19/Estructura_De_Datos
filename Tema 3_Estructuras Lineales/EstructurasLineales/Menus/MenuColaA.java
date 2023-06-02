package Menus;

import EntradaSalida.Tools;
import EstruCola.ColaA;
import PilaEstatica.PilaA;

public class MenuColaA {

	public static void menuColas() {
		ColaA <String> Cola = new ColaA((byte)10);
		String op="";
		do {
			op=Tools.seleccionBotonPilas("PUSH, POP, PEEK, FREE, SALIR");
			switch(op) {
			case "PUSH": Cola.pushCola(Tools.leerString("Ingresa nombre:"));
			Tools.imprimirMSJE("Datos de la pila:\n"+Cola.toString());break;
			case "POP": if (Cola.isEmptyCola())Tools.imprimirErrorMSJE("Pila vacia");
			else
				Tools.imprimirMSJE("Dato eliminado de la cima de la pila:" +Cola.popCola()+"\n"+Cola.toString());break;
			case "PEEK": if(Cola.isEmptyCola())Tools.imprimirErrorMSJE("Pila vacia");
			else
				Tools.imprimirMSJE("Dato de la cima de la pila: ==>"+Cola.peekCola()+"\n"+Cola.toString());break;
			case "FREE": if(Cola.isEmptyCola())Tools.imprimirErrorMSJE("Pila vacia");
			else {
				Cola.freeCola();
			}
			break;
			}
		} while(!op.equals("SALIR"));
	}
	
}
