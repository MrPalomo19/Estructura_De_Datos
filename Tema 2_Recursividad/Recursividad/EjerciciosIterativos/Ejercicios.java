package EjerciciosIterativos;

import EntradaSalida.Tools;

public class Ejercicios {
	
	public static void main(String[] args) {
		int vec[][]=new int [2][2];
		llenarMatriz(vec);
		verMatriz(vec);
	}
	
	//while
	
	public static String tablaMultiplicar(int num) {
		byte j=1;// valor inicial
		String cad ="";
		while(j<=10) {// condicion true
			cad+=num+" * "+j+" = "+(num*j)+"\n";
			j++;// incremento
		}
		return cad;
	}
	
	public static byte ordenarMayor() {
		byte j=1,dato,mayor = 0;
		
		while(j<=15) {
			dato=Tools.leerByte("Escribe un dato");
			if(dato>mayor) {
				mayor=dato;
				j++;
			}
		}
		return mayor;	
	}
	
	public static double calcularfactorial() {
	    double dato,j=0,fac=1;
	    dato=Tools.leerDouble("Escribe un numero");
	    
	    if(dato==0 || dato==1) {
	    	return 1;
	    }
	    else{fac=1;
	    	while(j<=dato) {
	    		fac*=j;
	    		j++;
	    	}	
	    	}
		return fac;
	}
	
	//DoWhile
	
	public static String tablaMultiplicarDo(int num) {
		String cad = "";
		byte j=1;
		do {
			cad+=num+" * "+j+" = "+(num*j)+"\n";
		}while(j<=10);
		
		return cad;
	}
	
	public static byte ordenarMayorDo() {
		byte j=1,dato,mayor = 0;
		do {
			dato=Tools.leerByte("Escribe un dato");
			if(dato>mayor) {
				mayor=dato;
		}}while(j<=15);
		
		return mayor;	
	}
	
	public static double calcularfactorialDo() {
	    double dato,j=0,fac=1;
	    dato=Tools.leerDouble("Escribe un numero");
	    
	    if(dato==0 || dato==1) {
	    	return 1;
	    }
	    else{fac=1;
	    	do{
	    	fac*=j;
    		j++;
	    	}while(j<= dato); }
		return fac;
	}
	
	//for
	
	public static String tablaMultiplicarFor(int num) {
		byte j;
		String cad = "";
		
		for(j=1;j<=10;j++) 
		{
			cad+=num+" * "+j+" = "+(num*j)+"\n";
		}
		return cad;
	}
	
	public static byte ordenarMayorFor() {
		byte j,dato,mayor = 0;
		
		for(j=1;j<=15;j++) {
			dato=Tools.leerByte("Escribe un dato");
			if(dato>mayor) {
				mayor=dato;
			}
		}
		return mayor;	
	}
	
	public static double calcularfactorialFor() {
	    double dato,j,fac=1;
	    dato=Tools.leerDouble("Escribe un numero");
	    
	    if(dato==0 || dato==1) {
	    	return 1;
	    }
	    else{
	    	fac=1;
	    	for(j=0;j<=dato;j++) {
	    		fac*=j;
	    	}}
		return fac;
	}
	
	public static int sumaDivisores(int dato)
	{
		int k=1, suma=0;
		do {
			if (dato % k==0) suma+=k;
			k++;
		}while(k<dato);
		
	    return suma;
	}

	public static String numPares()
	{  String cad="";
		byte k=2;
		do {
			cad+=k+"\n";
			k+=2;
		
		}while(k<=20);
		return cad;
	}

	public static String ctaDigitos(int dato)
	{
	 byte c=0;
	  do{
	     dato/=100;
	    c++;
	  }while(dato!=0);
	 return "Numeros: "+c;
	}
	
	public static String rectangulo(int base, int altura) {
		String cad="";
		int j=1,i=1;
		while(j>base || i>altura) {
			if(altura<j) {
				cad+="'-'\n";
			j++;
			}
			else {
				if(base<i) {
					cad+="'-'";
					i++;
				}
			}
		}
		
		return cad;
		
	}
	
	public static double calcularfactorial15() {
	    double dato,j;
	    double fac=1;
	    dato=Tools.leerDouble("Escribe un numero");
	    
	    if(dato==0 || dato==1) {
	    	return 1;
	    }
	    else{
	    	fac=1;
	    	for(j=0;j<=dato;j++) {
	    		fac*=j;
	    	}}
		return fac;
	}
	
	//Metodo de ordenamineto buebuja
	
	public static void burbuja(int a[]) {
		int j,i,aux;
		
		for(i=0;i<a.length-1;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					aux=a[i];
					a[i]=a[j];
					a[j]=aux;
				}
			}
		}
	}
	
	public static void imprimeArray(int a[]) {
		String cad="";
    	
    	for(int i=0;i<a.length;i++) {
    		cad+=i+"["+a[i]+"]\n";
    	}
    	Tools.imprimirMSJE("Datos de arreglo\n"+cad);
	}
	
	public static void llenarMatriz(int tabla[][]) {
		int i,j;
		for(i=0;i<tabla.length;i++) {
			for(j=0;j<tabla[0].length;j++) {
				tabla[i][j]=Tools.leerInt("inserte pos: ["+i+"]");
			}
		}
	}
	
	public static void llenarLetras(char tabla[][]) {
		int i,j;
		char car ='A';
		for(i=0;i<tabla.length;i++) {
			for(j=0;j<tabla[0].length;j++) {
				tabla[i][j]=car;
				car++;
			}
		}
	}
	
	public static void verMatriz(int tabla[][]) {
		int i,j;
		String ca="";
		for(i=0;i<tabla.length;i++) {
			for(j=0;j<tabla[0].length;j++) {
				ca+="["+tabla[i][j]+"]"+"";
			}
			ca+="\n";
		}
		Tools.imprimirMSJE("Array\n"+ca);
	}
	
	

}
//(tablaMultiplicar)diseñar un metodo de clase que lea un valor entero que retorne la tabla de multiplicar
//(ordenarMayor)Diseñar un metodo de clase que lea 15 valores enteros e imprima el mayor
//(calcularFactorial)Diseñar unmetodo de clase que reciba commo parametro un valor entero y retorne su correspondiente valor factorial