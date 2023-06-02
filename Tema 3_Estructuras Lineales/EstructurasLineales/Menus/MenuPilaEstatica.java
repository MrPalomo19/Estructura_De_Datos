package Menus;

import EntradaSalida.Tools;
import PilaEstatica.PilaA;

public class MenuPilaEstatica {

	public static void operacionesPilaEstatica() {
		PilaA <Integer> pila = new PilaA((byte) 10);
		String op="";
		do {
			op=Tools.seleccionBotonPilas("PUSH, POP, PEEK, FREE, SALIR");
			switch(op) {
			case "PUSH": pila.pushPila(Tools.leerInt("Dato:"));
			Tools.imprimirMSJE("Datos de la pila:\n"+pila.toString());break;
			case "POP": if (pila.isEmptyPila())Tools.imprimirErrorMSJE("Pila vacia");
			else
				Tools.imprimirMSJE("Dato eliminado de la cima de la pila:" +pila.popPila()+"\n"+pila.toString());break;
			case "PEEK": if(pila.isEmptyPila())Tools.imprimirErrorMSJE("Pila vacia");
			else
				Tools.imprimirMSJE("Dato de la cima de la pila: ==>"+pila.peekPila()+"\n"+pila.toString());break;
			case "FREE": if(pila.isEmptyPila())Tools.imprimirErrorMSJE("Pila vacia");
			else {
				pila = new PilaA((byte)10);
			}
			break;
			}
		} while(!op.equals("SALIR"));
	}
}