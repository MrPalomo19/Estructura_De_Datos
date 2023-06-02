package MemoriaEstatica;

import java.util.Arrays;

import EntradaSalida.Tools;

public class memoriaEstatica implements MemoriaTDA {
	private int memoria[];
	private byte tope;
	
	public void agregarDato(int dato) {
		if (espacioArray()) {
			tope++;
			memoria[tope]=dato;
		}
		else
			Tools.imprimirErrorMSJE("Memoria llena");
	}
	
	public memoriaEstatica(int n) {
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
		new memoriaEstatica(0);
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

	@Override // Modificado
	public void burbujaSeñal() {
	    for (int i = 0; i < tope; i++) {
	        for (int j = 0; j < tope - i; j++) {
	            if (memoria[j] > memoria[j + 1]) {
	            	CodRep(j, j + 1);	
	            }
	        }
	    }
	}

	@Override // Modificado
	public void dobleBurbuja() {
	    boolean intercambio;
	    for (int i = 0; i < tope; i++) {
	        intercambio = false;
	        for (int j = 0; j < tope - i; j++) {
	            if (memoria[j] > memoria[j + 1]) {
	            	CodRep(j, j + 1);
	                intercambio = true;
	            }
	        }
	        if (!intercambio) {
	            break;
	        }
	    }
	}

	@Override
	public void shellIncreDecre() {
	    int n = tope + 1;
	    int brecha = n / 2;
	    while (brecha > 0) {
	        for (int i = brecha; i < n; i++) {
	            int temp = memoria[i];
	            int j = i;
	            while (j >= brecha && memoria[j - brecha] > temp) {
	                memoria[j] = memoria[j - brecha];
	                j -= brecha;
	            }
	            memoria[j] = temp;
	        }
	        brecha /= 2;
	    }
	}

	@Override // Modificado
	public void seleDirecta() {
	    for (int i = 0; i < tope; i++) {
	        int minIndex = i;
	        for (int j = i + 1; j <= tope; j++) {
	            if (memoria[j] < memoria[minIndex]) {
	                minIndex = j;
	            }
	        }
	        CodRep(i, minIndex);
	    }
	}

	@Override
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

	@Override
	public void binaria() {
	    for (int i = 1; i <= tope; i++) {
	        int key = memoria[i];
	        int left = 0;
	        int right = i - 1;
	        while (left <= right) {
	            int mid = (left + right) / 2;
	            if (key < memoria[mid]) {
	                right = mid - 1;
	            } else {
	                left = mid + 1;
	            }
	        }
	        for (int j = i - 1; j >= left; j--) {
	            memoria[j + 1] = memoria[j];
	        }
	        memoria[left] = key;
	    }
	}

	@Override //Modificado
	public void heapSort() {
	    for (int i = tope / 2; i >= 0; i--) {
	        heapify(tope + 1, i);
	    }
	    for (int i = tope; i > 0; i--) {
	    	CodRep(0, i);
	        heapify(i, 0);
	    }
	}
	// Modificado
	private void heapify(int n, int i) {
	    int largest = i;
	    int left = 2 * i + 1;
	    int right = 2 * i + 2;

	    if (left < n && memoria[left] > memoria[largest]) {
	        largest = left;
	    }

	    if (right < n && memoria[right] > memoria[largest]) {
	        largest = right;
	    }

	    if (largest != i) {
	    	CodRep(i, largest);
	        heapify(n, largest);
	    }
	}

	@Override 
	public void quicksortRecursivo() {
	    quicksort(0, tope);
	}

	private void quicksort(int low, int high) {
	    if (low < high) {
	        int pi = partition(low, high);
	        quicksort(low, pi - 1);
	        quicksort(pi + 1, high);
	    }
	}
	// Modificado
	private int partition(int low, int high) {
	    int pivot = memoria[high];
	    int i = low - 1;
	    for (int j = low; j <= high - 1; j++) {
	        if (memoria[j] < pivot) {
	            i++;
	            CodRep(i, j);
	        }
	    }
	    CodRep(i + 1, high);
	    return i + 1;
	}

	@Override
	public void radix() {
	    int max = getMax();
	    int min = getMin();

	    for (int exp = 1; (max - min) / exp > 0; exp *= 10) {
	        countSort(exp, min);
	    }
	}

	private void countSort(int exp, int min) {
	    int n = tope + 1;
	    int[] output = new int[n];
	    int[] count = new int[10];
	    Arrays.fill(count, 0);

	    for (int i = 0; i < n; i++) {
	        count[((memoria[i] - min) / exp) % 10]++;
	    }

	    for (int i = 1; i < 10; i++) {
	        count[i] += count[i - 1];
	    }

	    for (int i = n - 1; i >= 0; i--) {
	        output[count[((memoria[i] - min) / exp) % 10] - 1] = memoria[i];
	        count[((memoria[i] - min) / exp) % 10]--;
	    }

	    for (int i = 0; i < n; i++) {
	        memoria[i] = output[i];
	    }
	}

	private int getMax() {
	    int max = memoria[0];
	    for (int i = 1; i <= tope; i++) {
	        if (memoria[i] > max) {
	            max = memoria[i];
	        }
	    }
	    return max;
	}

	private int getMin() {
	    int min = memoria[0];
	    for (int i = 1; i <= tope; i++) {
	        if (memoria[i] < min) {
	            min = memoria[i];
	        }
	    }
	    return min;
	}

	@Override
	public void intercalacion() {
	    int n = tope + 1;
	    int[] auxiliar = new int[n];
	    intercalacionRecursiva(0, n - 1, auxiliar);
	}

	private void intercalacionRecursiva(int izq, int der, int[] auxiliar) {
	    if (izq < der) {
	        int medio = (izq + der) / 2;
	        intercalacionRecursiva(izq, medio, auxiliar);
	        intercalacionRecursiva(medio + 1, der, auxiliar);
	        merge(izq, medio, der, auxiliar);
	    }
	}

	private void merge(int izq, int medio, int der, int[] auxiliar) {
	    for (int i = izq; i <= der; i++) {
	        auxiliar[i] = memoria[i];
	    }

	    int i = izq;
	    int j = medio + 1;
	    int k = izq;

	    while (i <= medio && j <= der) {
	        if (auxiliar[i] <= auxiliar[j]) {
	            memoria[k] = auxiliar[i];
	            i++;
	        } else {
	            memoria[k] = auxiliar[j];
	            j++;
	        }
	        k++;
	    }

	    while (i <= medio) {
	        memoria[k] = auxiliar[i];
	        i++;
	        k++;
	    }
	}

	@Override
	public void mezclaDirecta() {
	    int n = tope + 1;
	    int[] auxiliar = new int[n];
	    mezclaDirectaRecursiva(0, n - 1, auxiliar);
	}

	private void mezclaDirectaRecursiva(int izq, int der, int[] auxiliar) {
	    if (izq < der) {
	        int medio = (izq + der) / 2;
	        mezclaDirectaRecursiva(izq, medio, auxiliar);
	        mezclaDirectaRecursiva(medio + 1, der, auxiliar);
	        mergeSort(izq, medio, der, auxiliar);
	    }
	}

	private void mergeSort(int izq, int medio, int der, int[] auxiliar) {
	    int n1 = medio - izq + 1;
	    int n2 = der - medio;
	    int[] izquierda = new int[n1];
	    int[] derecha = new int[n2];
	    for (int i = 0; i < n1; i++) {
	        izquierda[i] = memoria[izq + i];
	    }
	    for (int j = 0; j < n2; j++) {
	        derecha[j] = memoria[medio + 1 + j];
	    }
	    int i = 0;
	    int j = 0;
	    int k = izq;
	    while (i < n1 && j < n2) {
	        if (izquierda[i] <= derecha[j]) {
	            memoria[k] = izquierda[i];
	            i++;
	        } else {
	            memoria[k] = derecha[j];
	            j++;
	        }
	        k++;
	    }
	    while (i < n1) {
	        memoria[k] = izquierda[i];
	        i++;
	        k++;
	    }
	    while (j < n2) {
	        memoria[k] = derecha[j];
	        j++;
	        k++;
	    }
	}

	private void CodRep(int i, int j) {
	    int temp = memoria[i];
	    memoria[i] = memoria[j];
	    memoria[j] = temp;
	}

}