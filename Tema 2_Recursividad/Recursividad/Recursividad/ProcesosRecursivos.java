package Recursividad;

import EntradaSalida.Tools;

public class ProcesosRecursivos {

	public static void main(String[] args) {
		int vec[][]=new int [2][2];
		
		llenarMatriz(vec);
		verMatriz(vec);
		
		//Tools.imprimirMSJE(imprimeArrayRec2(vec, 0)); 
		
		//Tools.imprimirMSJE("Suma: 30");
		
		//Tools.imprimirMSJE(ctaDigitos(Tools.leerInt("Escribe un dato: "), (byte) 0)); 
	}
		
		public static void funcionRecursiva(int j,int n) {
			if(j<=n) {
				System.out.print(j);
				funcionRecursiva(j+1,n);
			}
	    }
		
	public static String funcionRecursivaString(int j,int n) {
				if(j<=n) {
					return j+"\n"+funcionRecursivaString(j+1,n);
				}
				else {
					return "";
				}
	}
	
	public static int numMayorRecursivo(byte j, int mayor) {
		if(j<=5) {
			int dato=Tools.leerInt("Dato: ");
			if(dato>mayor) {
				mayor=dato;
				return numMayorRecursivo((byte) (j+1),mayor);
			}
		}
		return mayor;	
	}
	
	public static String tablaMultiRecursivo(byte j, int num) {
		String cad ="";
		if(j<=10) {
			return cad+=num+" * "+j+" = "+(num*j)+"\n"+tablaMultiRecursivo((byte) (j+1),num);
		}
		return "";
	}
	
	public static double numFactRecursivo(byte j, byte fac,int dato) {
		
		if(dato==0 || dato==1) {
	    	return 1;
	    }
	    
		if(j<=dato) {
			return numFactRecursivo((byte) (j+1),(byte)(fac*=j),dato);
		}
		return fac;
	}
	
	public static int sumaDivisoresRecursivo(int dato,int k,int suma) {
		
		
		if(k<dato) {
			if ((dato % k)==0) { 
			suma+=k;
			return sumaDivisoresRecursivo(dato, k+1,suma);
		    }
		}
		return suma;
	}
	
	public static String numPares(int k) {
		String cad="";
		
		if(k%2!=0) {
		k+=1;}
		if(k<=22) {
			return cad+=k+"\n"+numPares(k+=2);
		}
		return "";	
	}
	
	public static String ctaDigitos(int dato,byte c) {
		
		if(dato!=0)
		{
			return ctaDigitos(dato/=10, (byte) (c+1));
		}
		
		return "Datos: "+c;
	}
	
	public static String tablaMultiplicar(byte j, int num) {
		if(j<=10) {
			return num+"*"+j+"="+(num*j)+"\n";
		}
		return "";
	}
	
	public static void del1al10Inverso(byte j, byte n) {
		if(j<n) {
			return;
		}else {
			del1al10Inverso(j, n);
			System.out.print("  ");
			
		}
	}
	
	public static void del1al10(int j, int i) {
	int h=j;
	if(h<i) {
		return;
		
	}
		
	}
	
	public static void imprimeArray(int a[]) {
		String cad="";
    	
    	for(int i=0;i<a.length;i++) {
    		cad+=i+"["+a[i]+"]\n";
    	}
    	Tools.imprimirMSJE("Datos de arreglo\n"+cad);
	}

	
	public static void ordenaBurbujai(int a[],int i) {
		if(i<a.length-1) {
			ordenaBurbujaj(a,i,i+1);
			ordenaBurbujai(a,i+1);
		}
	}

	public static void ordenaBurbujaj(int a[] , int i, int j) {
		int aux=0;
		if(j<a.length) {
			if(a[i]>a[j]) {
				aux=a[i];
				a[i]=a[j];
				a[j]=aux;
			}
			ordenaBurbujaj(a, i, j+1);
		}
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
	
	
	public static String cubos(int n) {
		String cad="";
		int cubo;
		if(n>=20) {
			cubo=(int) Math.pow(n, 3);
			cad+="El cubo de "+n+" es "+cubo;
			cubos(n+2);
		}
		
		return cad;
	}
	
	
	public static void imprimeArrayC(int n) {
		String cad="";
    	
    	if(n<20) {
    		cad+=n+"["+cad+"]\n";
    		imprimeArrayC(n+2);
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
	
	public static void verMatrizRecursivo(int tabla[][]) {
		int i=0;
		String ca="";
		if(i<tabla.length) {
			ca+="\n";
			verMatrizRecursivo(tabla);
		}
		Tools.imprimirMSJE("Array\n"+ca);
	}
	
	public static String verMatrizRecursivo2(int tabla[][]) {
		int i = 0,j=0;
		String ca="";
		if(j<tabla.length) {
			ca+="["+tabla[i][j]+"]"+"";
		}
		return "";
	}
	
	public static void Piramide(int N) {
		int j=34;
    	if (N<1) {
			return;
		} 
    	else {
    		triangulodescendente(N);
    		System.out.print("\n");
    		Piramide(N-1);
    	}
    }
    public static void triangulodescendente(int N) {
    	int B=N;
    	if(B<1) 
    		return;
    		System.out.print(N);
    		
    		triangulodescendente(N-1);
    	
    }
	
}
