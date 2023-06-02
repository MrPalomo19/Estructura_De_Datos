package MenuBusquedas;

import EntradaSalida.Tools;
import Metodos.Busquedas;

public class Menu {
	
	public static void main(String[] args) {
		Busquedas busq = new Busquedas(10);
		String op;
	do {
		op=Tools.BotonesBusquedas("GENERAR ORDENADO,BUSQUEDAS ORDENADAS,GENERAR ALEATORIO,BUSQUEDAS DESORDENADAS,IMPRIMIR,VACIAR,SALIR");
		switch(op) {
		
		case "GENERAR ORDENADO" : if(busq.espacioArray()) {
			busq.almacenaAleatorios();
			busq.inserDirecta();
            Tools.imprimirMSJE("Datos: " + busq.impresionDatos());
        } else {
            Tools.imprimirErrorMSJE("Memoria llena");
        }break;
        
		
		case "BUSQUEDAS ORDENADAS" :
			String op1 = Tools.BusqOrd();
            switch (op1) {
            
            case "BINARIA" : if (busq.arrayVacio()) {
                Tools.imprimirMSJE("Lista Vacia");
            } else {
                int buscar = busq.busquedaBinaria(busq.getMemoria(), Tools.leerInt("Dato a buscar: "));
                if (buscar == -1) {
                    Tools.imprimirMSJE("Dato no encontrado");
                } else {
                    int valorEncontrado = busq.getMemoria()[buscar];
                    Tools.imprimirMSJE("Posición: " + buscar + ", Valor: " + valorEncontrado);
                }
            } break;
            
            	
            case "INTERPOLACION" : if (busq.arrayVacio()) {
                Tools.imprimirMSJE("Lista Vacia");
            } else {
                int buscar = busq.busquedaInterpolacion(busq.getMemoria(), Tools.leerInt("Dato a buscar: "));
                if (buscar == -1) {
                    Tools.imprimirMSJE("Dato no encontrado");
                } else {
                    int valorEncontrado = busq.getMemoria()[buscar];
                    Tools.imprimirMSJE("Posición: " + buscar + ", Valor: " + valorEncontrado);
                }
            } break;
            
            	
            case "EXPONENCIAL" : if (busq.arrayVacio()) {
                Tools.imprimirMSJE("Lista Vacia");
            } else {
                int buscar = busq.busquedaExponencial(busq.getMemoria(), Tools.leerInt("Dato a buscar: "));
                if (buscar == -1) {
                    Tools.imprimirMSJE("Dato no encontrado");
                } else {
                    int valorEncontrado = busq.getMemoria()[buscar];
                    Tools.imprimirMSJE("Posición: " + buscar + ", Valor: " + valorEncontrado);
                }
            } break;
            
            	
            case "FIBONACCI" : if (busq.arrayVacio()) {
                Tools.imprimirMSJE("Lista Vacia");
            } else {
                int buscar = busq.busquedaFibonacci(busq.getMemoria(), Tools.leerInt("Dato a buscar: "));
                if (buscar == -1) {
                    Tools.imprimirMSJE("Dato no encontrado");
                } else {
                    int valorEncontrado = busq.getMemoria()[buscar];
                    Tools.imprimirMSJE("Posición: " + buscar + ", Valor: " + valorEncontrado);
                }
            } break;
            
            case "SALTAR BUSQUEDA" : if (busq.arrayVacio()) {
                Tools.imprimirMSJE("Lista Vacia");
            } else {
                int buscar = busq.saltoBusqueda(busq.getMemoria(), Tools.leerInt("Dato a buscar: "));
                if (buscar == -1) {
                    Tools.imprimirMSJE("Dato no encontrado");
                } else {
                    int valorEncontrado = busq.getMemoria()[buscar];
                    Tools.imprimirMSJE("Posición: " + buscar + ", Valor: " + valorEncontrado);
                }
            } break;
            } break;
            
            
		case "GENERAR ALEATORIO" : if(busq.espacioArray()) {
            busq.almacenaAleatorios();
            Tools.imprimirMSJE("Datos: " + busq.impresionDatos());
        } else {
            Tools.imprimirErrorMSJE("Memoria llena");
        } break;
            
			
		case "BUSQUEDAS DESORDENADAS" : 
			String op2 = Tools.BusqDes();
            switch (op2) {
            
            case "SECUENCIAL" : if (busq.arrayVacio()) {
                Tools.imprimirMSJE("Lista Vacia");
            } else {
                int buscar = busq.busquedaSecuencial(busq.getMemoria(), Tools.leerInt("Dato a buscar: "));
                if (buscar == -1) {
                    Tools.imprimirMSJE("Dato no encontrado");
                } else {
                    int valorEncontrado = busq.getMemoria()[buscar];
                    Tools.imprimirMSJE("Posición: " + buscar + ", Valor: " + valorEncontrado);
                }
            } break;
            
            	
            case "KNUTH MORRIS PRATT":
                	String patron = Tools.leerString("Ingresa el texto"); // ababcababcabc
                    String datoBuscar = Tools.leerString("Patrón a buscar: "); //abcabc
                    boolean encontrado = busq.busquedaKMP(patron, datoBuscar);
                    if (encontrado) {
                    	Tools.imprimirMSJE("El patrón se encontró en el texto.");
                    } else {
                        Tools.imprimirErrorMSJE("El patrón no se encontró en el texto.");
                    }
                break;
            
            } break;
            
            
		case "IMPRIMIR" : if (busq.arrayVacio()) {
            Tools.imprimirErrorMSJE("Memoria Vacia");
        } else {
            Tools.imprimirMSJE("Datos: " + busq.impresionDatos());
        } break;
		
        
		case "VACIAR" : if (busq.arrayVacio()) {
            Tools.imprimirErrorMSJE("La memoria ya está vacia");
        } else {
        	busq.vaciarArray();
        } break;
		
		}	
	} while(!op.equals("SALIR"));
	}
}
