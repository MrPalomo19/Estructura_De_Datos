package estructurasNoLineales;

import EntradaSalida.Tools;
import Arboles.ArbolBin;

public class Menu {
// metodo que de la figura del arbol, nodos interiores, hijos, buscar
	public static void main(String[] args) {
		ArbolBin  <Integer> arb = new ArbolBin <Integer>();
		String op;
		do {
			op=Tools.menuArboles("Insertar,Recorrido,Buscar,Hojas,Grado,Altura,Salir");
			switch(op) {
			
			case "INSERTAR": 
			arb.insertarArbol(Tools.leerInt("Dato:"));break;
			
			case "RECORRIDO": Tools.imprimirMSJE("InPreorden: "+arb.preorden(arb.getRaiz())
			+"\nInOrden: "+arb.inOrden(arb.getRaiz())
			+"\nInOrden2: "+arb.inOrden2(arb.getRaiz())
			+"\nPostOrden: "+arb.postOrden(arb.getRaiz()));break;
			
			case "BUSCAR" : if(arb.arbolVacio()) Tools.imprimirMSJE("Lista Vacia");
			else {
			int dato=Tools.leerInt("Ingresa el dato:");
			if(arb.buscarDato(dato)==null) {
				Tools.imprimirMSJE("Dato no encontrado");
			} else
				Tools.imprimirMSJE("Dato encontrado: "+dato);
			}break;
			
			case "HOJAS" : if(arb.arbolVacio()) Tools.imprimirMSJE("Lista Vacia");
			else {
			arb.imprimirNodosTerminales();
			}break;
			
			case "INTERIORES" : if(arb.arbolVacio()) Tools.imprimirMSJE("Lista Vacia");
			else {
			arb.imprimirNodosInteriores(); 
			}break;
			
			case "GRADO" : if(arb.arbolVacio()) Tools.imprimirMSJE("Lista Vacia");
			else {
			Tools.imprimirMSJE("Grado: "+arb.grado()); 
			}break;
			
			case "ALTURA" : if(arb.arbolVacio()) Tools.imprimirMSJE("Lista Vacia");
			else {
			Tools.imprimirMSJE("Altura: "+arb.altura());
			}break;
			
			case "VER" : if(arb.arbolVacio()) Tools.imprimirMSJE("Lista Vacia");
			else {
			arb.verArbol(); 
			}break;
			}
		} while(!op.equals("SALIR"));
	}
}
