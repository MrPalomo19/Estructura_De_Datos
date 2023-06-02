package Menus;

import EntradaSalida.Tools;
import PilaDinamica.PilaC;

public class MenuArrayList {

	public static void operacionesArrayList() {
		PilaC <Integer> pila = new PilaC();
		String op="";
		do {
			op=Tools.seleccionBotonPilas("PUSH, POP, PEEK, FREE, SALIR");
			switch(op) {
			case "PUSH": pila.pushPila(Tools.leerInt("Escribe un valor entero:"));
			Tools.imprimirMSJE("Datos de la pila:\n"+pila.toString());break;
			case "POP": if (pila.isEmptyPila())Tools.imprimirErrorMSJE("Pila vacia");
			else
				Tools.imprimirMSJE("Dato eliminado de la cima de la pila:" +pila.popPila()+"\n"+pila.toString());break;
			case "PEEK": if(pila.isEmptyPila())Tools.imprimirErrorMSJE("Pila vacia");
			else
				Tools.imprimirMSJE("Dato de la cima de la pila: ==>"+pila.peekPila()+"\n"+pila.toString());break;
			case "FREE": if(pila.isEmptyPila())Tools.imprimirErrorMSJE("Pila vacia");
			else {
				pila.vaciar();
			}
			break;
			}
		} while(!op.equals("SALIR"));
	}
	
}