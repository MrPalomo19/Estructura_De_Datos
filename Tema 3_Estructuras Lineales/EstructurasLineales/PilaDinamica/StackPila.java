package PilaDinamica;

import java.util.Stack;

import EntradaSalida.Tools;
import PilaEstatica.PilaA;
import javax.swing.*;
import java.util.Stack;
import java.util.EmptyStackException;

public class StackPila {

	public static void StackPila() {
		
		Stack <Integer> pila = new Stack();
		int dato;
		String op="";
		do {
			op=Tools.seleccionBotonPilasD("Insertar Pila, Elimina Pila, Mostrar Cima, Libera, SALIR");
			switch(op) {	
			case "Insertar Pila": dato=Tools.leerInt("Dato a insertar");
			pila.push(dato);
			Tools.imprimirMSJE("Dato en la pila: "+pila);break;
			case "Elimina Pila": try {
				Tools.imprimirMSJE("Dato de la cima de la pila antes de eliminar es "+pila.peek());
				pila.pop();
				Tools.imprimirMSJE("La pila ahora tiene "+pila+ " ");
			} catch(EmptyStackException e) {
				Tools.imprimirErrorMSJE("Pila vacia");
			}break;
			case "Mostrar Cima": if(pila.isEmpty())Tools.imprimirErrorMSJE("Pila vacia");
			else
				Tools.imprimirMSJE("Dato de la cima de la pila: ==>"+pila.peek()+"\n"+pila.toString());break;
			case "Libera": if(pila.isEmpty())Tools.imprimirErrorMSJE("Pila vacia");
			else {
				pila=null;
				pila=new Stack();
			}
			break;
			}
		} while(!op.equals("SALIR"));
	}	
}
