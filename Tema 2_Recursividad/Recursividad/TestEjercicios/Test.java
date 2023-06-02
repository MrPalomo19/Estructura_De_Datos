package TestEjercicios;

import EjerciciosIterativos.Ejercicios;
import EntradaSalida.Tools;

public class Test {

	public static void main(String[] args) {
		
		
		String menu ="";
		  
		Ejercicios oper=new Ejercicios();
		
		String sel="";
		do {
		sel=Tools.seleccionBoton7(menu);
		switch(sel){
		case "Tabla de Mul":Ejercicios.tablaMultiplicar(Tools.leerInt("Escribe un numero"));break;     
		case "Numero mayor":Ejercicios.ordenarMayor()  ;break;
		case "Factorial": Ejercicios.calcularfactorial(); break;
		case "Cuenta Dig": Tools.imprimirMSJE( Ejercicios.ctaDigitos(Tools.leerInt("Escribe un numero"))); break;
		case "Rectangulo": Tools.imprimirMSJE(Ejercicios.rectangulo(Tools.leerInt("Escribe la base"), Tools.leerInt("Escribe ls sltura")));
		case "Salir": Tools.imprimirMSJE("Fin del programa");;
		}//switch
		}while(!sel.equalsIgnoreCase("Salir"));
		}

	

}
