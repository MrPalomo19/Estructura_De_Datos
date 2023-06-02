package Menus;

import EntradaSalida.Tools;
import Metodos.DatosDesordenados;

public class MenuDesordenado {

	public static void main(String[] args) {
		
		DatosDesordenados oper = new DatosDesordenados(15);
		String sel="";
		do {
			sel=Tools.menuDesord("");
		switch(sel) {
			case  "Agregar Datos":oper.agregarDatos();break;
			
			case "Imprimir":
				if(oper.validaEspacio())Tools.imprimirMSJE("Array vacio");
			else
				oper.imprimirArray();
				break;
				
			case "Buscar":if (oper.validaEspacio()) Tools.imprimirMSJE("Array vacio"); 
	        else {
	            oper.busquedaSecuencial();
	            }break;
	            
			case "Eliminar":if(oper.validaEspacio())Tools.imprimirErrorMSJE("Array vacio");
			else {
				byte pos=oper.busquedaSecuencial();
				if (pos!=-1)
					oper.eliminarDato(pos);
			} break;
			
			case "Modificar":if (oper.validaEspacio()) Tools.imprimirMSJE("Array vacio"); 
	        else {
	            oper.Modificar();
	            }break;
			
			case "Salir":Tools.imprimirMSJE("Gracias, termina programa");break;
			}
		} while(!sel.equalsIgnoreCase("Salir"));
	}
	}
