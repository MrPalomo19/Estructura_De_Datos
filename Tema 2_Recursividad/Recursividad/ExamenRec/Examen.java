package ExamenRec;

import java.util.Scanner;

import EntradaSalida.Tools;

public class Examen {
	
	
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int A = input.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int B = input.nextInt();
        
        int resultado = multiplicacionRusa(A, B);
        System.out.println("El resultado de la multiplicación es: " + resultado);
	}
	

	public static String Repetidos() {
		
		
		
		return null;
	}
	
	public static String disaurim(int num, byte i) {
		int suma = 0;
		
		if(num!=0) {
			suma+=((num%10)^i);
		 disaurim(num/10,(byte) (i+1));
		}
		return ""+suma;	
	}
	
	
	public static void imprimeArrayRec(int a[],int i) {
		String cad="";
    	
    	if(i<a.length) {
    		cad+=i+"["+a[i]+"]\n";
    		imprimeArrayRec(a,i+1);
    	}
    	
    	Tools.imprimirMSJE("Datos de arreglo\n"+cad);
	}
	
	public static String imprimeArrayRec2(int a[],int i) {
    	if(i<a.length) {
    		return i+"["+a[i]+"]\n"+imprimeArrayRec2(a,i+1);
    	}
    	return"";
	}
	
	
	public static int multiplicacionRusa(int A, int B) {
	    if (A == 1) {
	        return B;
	    } else if (A % 2 == 1) {
	        return B + multiplicacionRusa(A-1, B*2);
	    } else {
	        return multiplicacionRusa(A/2, B*2);
	    }
	}
}


