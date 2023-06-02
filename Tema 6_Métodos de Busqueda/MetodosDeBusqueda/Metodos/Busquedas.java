package Metodos;

import EntradaSalida.Tools;

public class Busquedas implements BusquedasTDA {
		private int memoria[];
		private byte tope;
		
		public int[] getMemoria() {
			return memoria;
		}

		public void inserDirecta() {
		    for (int i = 1; i <= tope; i++) {
		        int key = memoria[i];
		        int j = i - 1;
		        while (j >= 0 && memoria[j] > key) {
		            memoria[j + 1] = memoria[j];
		            j--;
		        }
		        memoria[j + 1] = key;
		    }
		}
		
		public void agregarDato(int dato) {
			if (espacioArray()) {
				tope++;
				memoria[tope]=dato;
			}
			else
				Tools.imprimirErrorMSJE("Memoria llena");
		}
		
		public Busquedas(int n) {
			memoria = new int[n];
			tope = -1;
		}
		
		private int generaRandom (int min, int max) {
			return (int)((max - min + 1) * Math.random()+ min);
			}
		
		public boolean arrayVacio() {
			return (tope==-1);
		}

		@Override
		public boolean espacioArray() {
			return (tope<memoria.length-1);
		}

		@Override
		public void vaciarArray() {
			new Busquedas(0);
			tope = -1;
		}

		@Override
		public void almacenaAleatorios() {
			for (int i = 0; i < memoria.length; i++) {
	            memoria[i] = generaRandom(10, 99);
	        }
	        tope = (byte) (memoria.length - 1);
		}

		@Override
		public String impresionDatos() {
			StringBuilder imp = new StringBuilder();
	        for (int i = 0; i <= tope; i++) {
	            imp.append(memoria[i]);
	            if (i < tope) {
	                imp.append(", ");
	            }
	        }
	        return imp.toString();
	    }
		
		// Busquedas Ordenadas
		
		    // Búsqueda binaria
		    public int busquedaBinaria(int[] memoria, int elemento) {
		        return busquedaBinariaRecursiva(memoria, elemento, 0, memoria.length - 1);
		    }

		    // Búsqueda de interpolación
		    public int busquedaInterpolacion(int[] arreglo, int elemento) {
		        int inicio = 0;
		        int fin = arreglo.length - 1;

		        while (inicio <= fin && elemento >= arreglo[inicio] && elemento <= arreglo[fin]) {
		            int posicion = calcularPosicionInterpolacion(arreglo, elemento, inicio, fin);

		            if (arreglo[posicion] == elemento) {
		                return posicion;
		            } else if (arreglo[posicion] < elemento) {
		                inicio = posicion + 1;
		            } else {
		                fin = posicion - 1;
		            }
		        }

		        return -1; // Elemento no encontrado
		    }

		    // Búsqueda exponencial
		    public int busquedaExponencial(int[] arreglo, int elemento) {
		        if (arreglo.length == 0) {
		            return -1; // Elemento no encontrado en un arreglo vacío
		        }

		        if (arreglo[0] == elemento) {
		            return 0;
		        }

		        int tamaño = arreglo.length;
		        int i = 1;

		        while (i < tamaño && arreglo[i] <= elemento) {
		            i *= 2;
		        }

		        return busquedaBinariaRecursiva(arreglo, elemento, i / 2, Math.min(i, tamaño - 1));
		    }

		    // Búsqueda de Fibonacci
		    public int busquedaFibonacci(int[] arreglo, int elemento) {
		        int fib2 = 0; // (n-2)-th número de Fibonacci
		        int fib1 = 1; // (n-1)-th número de Fibonacci
		        int fibM = fib2 + fib1; // n-th número de Fibonacci

		        while (fibM < arreglo.length) {
		            fib2 = fib1;
		            fib1 = fibM;
		            fibM = fib2 + fib1;
		        }

		        int inicio = -1;

		        while (fibM > 1) {
		            int posicion = Math.min(inicio + fib2, arreglo.length - 1);

		            if (arreglo[posicion] < elemento) {
		                fibM = fib1;
		                fib1 = fib2;
		                fib2 = fibM - fib1;
		                inicio = posicion;
		            } else if (arreglo[posicion] > elemento) {
		                fibM = fib2;
		                fib1 = fib1 - fib2;
		                fib2 = fibM - fib1;
		            } else {
		                return posicion;
		            }
		        }

		        if (fib1 == 1 && arreglo.length > 1 && arreglo[inicio + 1] == elemento) {
		            return inicio + 1;
		        }

		        return -1; // Elemento no encontrado
		    }

		    // Método auxiliar para realizar una búsqueda binaria recursiva en un rango específico del arreglo
		    private int busquedaBinariaRecursiva(int[] arreglo, int elemento, int inicio, int fin) {
		        if (inicio > fin) {
		            return -1; // Elemento no encontrado
		        }

		        int medio = inicio + (fin - inicio) / 2;

		        if (arreglo[medio] == elemento) {
		            return medio;
		        } else if (arreglo[medio] < elemento) {
		            return busquedaBinariaRecursiva(arreglo, elemento, medio + 1, fin);
		        } else {
		            return busquedaBinariaRecursiva(arreglo, elemento, inicio, medio - 1);
		        }
		    }

		    // Método auxiliar para calcular la posición en la búsqueda de interpolación
		    private int calcularPosicionInterpolacion(int[] arreglo, int elemento, int inicio, int fin) {
		        if (inicio == fin) {
		            return inicio;
		        }

		        return inicio + ((elemento - arreglo[inicio]) * (fin - inicio)) / (arreglo[fin] - arreglo[inicio]);
		    }
		    
		    public int saltoBusqueda(int[] arreglo, int elemento) {
		        int paso = (int) Math.floor(Math.sqrt(arreglo.length));
		        int previo = 0;

		        while (arreglo[Math.min(paso, arreglo.length) - 1] < elemento) {
		            previo = paso;
		            paso += (int) Math.floor(Math.sqrt(arreglo.length));
		            if (previo >= arreglo.length) {
		                return -1; // No se encontró el elemento en el arreglo
		            }
		        }

		        while (arreglo[previo] < elemento) {
		            previo++;
		            if (previo == Math.min(paso, arreglo.length)) {
		                return -1; // No se encontró el elemento en el arreglo
		            }
		        }

		        if (arreglo[previo] == elemento) {
		            return previo; // Se encontró el elemento en la posición previo
		        }

		        return -1; // No se encontró el elemento en el arreglo
		    }

	// Busquedas Desordenadas
		    
		    public int busquedaSecuencial(int[] arreglo, int elemento) {
		        for (int i = 0; i < arreglo.length; i++) {
		            if (arreglo[i] == elemento) {
		                return i; // Se encontró el elemento en la posición i
		            }
		        }
		        return -1; // No se encontró el elemento en el arreglo
		    }

		    public boolean busquedaKMP(String texto, String patron) {
		        int[] lps = calcularLPS(patron);
		        int i = 0; // Índice para el texto
		        int j = 0; // Índice para el patrón

		        while (i < texto.length()) {
		            if (texto.charAt(i) == patron.charAt(j)) {
		                i++;
		                j++;
		                if (j == patron.length()) {
		                    return true; // Se encontró el patrón en el texto
		                }
		            } else {
		                if (j != 0) {
		                    j = lps[j - 1];
		                } else {
		                    i++;
		                }
		            }
		        }
		        return false; // No se encontró el patrón en el texto
		    }

		    private int[] calcularLPS(String patron) {
		        int[] lps = new int[patron.length()];
		        int len = 0; // Longitud del prefijo más largo que también es sufijo
		        int i = 1;

		        while (i < patron.length()) {
		            if (patron.charAt(i) == patron.charAt(len)) {
		                len++;
		                lps[i] = len;
		                i++;
		            } else {
		                if (len != 0) {
		                    len = lps[len - 1];
		                } else {
		                    lps[i] = 0;
		                    i++;
		                }
		            }
		        }
		        return lps;
		    }
}