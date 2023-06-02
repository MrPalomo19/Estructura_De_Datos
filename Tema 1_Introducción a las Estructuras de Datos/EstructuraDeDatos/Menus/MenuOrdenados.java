package Menus;

import EntradaSalida.Tools;
import Metodos.DatosOrdenados;

public class MenuOrdenados {

public static void main(String[] args) {
		
		DatosOrdenados oper = new DatosOrdenados((byte) 10);
		String sel="";
		do {
			sel=Tools.menuOrd("");
			switch(sel) {
			case  "Agregar Datos":oper.agregarOrdenado();break;
			
			case "Imprimir":
				if(oper.validaEspacio())Tools.imprimirMSJE("Array vacio");
			else
				oper.imprimirArray();break;
				
			case "Buscar": if (oper.validaEspacio()) {
			    Tools.imprimirMSJE("Lista Vacía");
			} else {
			    int dato = Tools.leerInt("Buscar: ");
			    byte posicion = oper.busSecuencialOrdenada(dato);
			    if (posicion < 0) {
			        Tools.imprimirMSJE("No existe");
			    } else {
			        Tools.imprimirMSJE("Posición: " + posicion);
			    }
			}
			break;
			
			case "Eliminar": if (oper.validaEspacio()) {
			    Tools.imprimirMSJE("Lista Vacía");
			} else {
			    int dato = Tools.leerInt("Eliminar: ");
			    byte posicion = oper.busSecuencialOrdenada(dato);
			    if (posicion < 0) {
			        Tools.imprimirMSJE("No existe");
			    } else {
			    	oper.eliminarDato(posicion);
			        Tools.imprimirMSJE("Posición: " + posicion);
			    }
			}
			break; 
				
			case "Modificar":if (oper.validaEspacio()) 
				Tools.imprimirErrorMSJE("Array vacio");
			else {
				  byte pos = oper.busSecuencialOrdenada(Tools.leerInt("Dato:"));
			if (pos>=0) {
					oper.modificarDato(pos);
				Tools.imprimirMSJE("Dato modificado:" +pos);
				}else
					Tools.imprimirErrorMSJE("Dato no encontrado");}
			 break;
			 
			case "Salir":Tools.imprimirMSJE("Gracias, termina programa");break;
			}
		} while(!sel.equalsIgnoreCase("Salir"));
	}
}

