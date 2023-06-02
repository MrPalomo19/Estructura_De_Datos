package Arboles;

import EntradaSalida.Tools;

public class ArbolBin<T> {
    private Nodito<T> raiz;

    public ArbolBin() {
        raiz = null;
    }

    public Nodito<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodito<T> raiz) {
        this.raiz = raiz;
    }

    public boolean arbolVacio() {
        return raiz == null;
    }

    public void vaciarArbol() {
        raiz = null;
    }

    public void insertarArbol(T info) {
        Nodito<T> p = new Nodito<T>(info);
        if (arbolVacio()) {
            raiz = p;
        } else {
            Nodito<T> padre = buscaPadre(raiz, p);
            if (p.getInfo().hashCode() >= padre.getInfo().hashCode()) {
                padre.setDer(p);
            } else {
                padre.setIzq(p);
            }
        }
    }

    public Nodito<T> buscaPadre(Nodito<T> actual, Nodito<T> p) {
        Nodito<T> padre = null;
        while (actual != null) {
            padre = actual;
            if (p.getInfo().hashCode() >= padre.getInfo().hashCode()) {
                actual = padre.getDer();
            } else {
                actual = padre.getIzq();
            }
        }
        return padre;
    }

    public String preorden(Nodito<T> r) {
        if (r != null) {
            return r.getInfo() + "-" + preorden(r.getIzq()) + "-" + preorden(r.getDer());
        } else {
            return " ";
        }
    }
    
    public String inOrden(Nodito<T> r) {
        if (r != null) {
            return inOrden(r.getIzq()) + "-" + r.getInfo() + "-" + inOrden(r.getDer());
        } else {
            return " ";
        }
    }
    
    public String inOrden2(Nodito<T> r) {
        StringBuilder resultado = new StringBuilder();
        inOrdenRec(r, resultado);
        return resultado.toString();
    }

    private void inOrdenRec(Nodito<T> nodo, StringBuilder resultado) {
        if (nodo != null) {
            inOrdenRec(nodo.getDer(), resultado);
            resultado.append(nodo.getInfo()).append("-");
            inOrdenRec(nodo.getIzq(), resultado);
        }
    }
    
    public String postOrden(Nodito<T> r) {
        if (r != null) {
            return postOrden(r.getIzq()) + "-" + postOrden(r.getDer()) + "-" + r.getInfo();
        } else {
            return " ";
        }
    }


    public Nodito<T> buscarDato(T dato) {
        return buscarDatoRec(dato, raiz);
    }

    public Nodito<T> buscarDatoRec(T dato, Nodito<T> r) {
        if (r == null || dato.equals(r.getInfo())) {
            return r;
        } else if (dato.hashCode() >= r.getInfo().hashCode()) {
            return buscarDatoRec(dato, r.getDer());
        } else {
            return buscarDatoRec(dato, r.getIzq());
        }
    }

    public void imprimirNodosTerminales() {
        StringBuilder mensaje = new StringBuilder();
        nodosTerminalesX(raiz, mensaje);
        Tools.imprimirMSJE(mensaje.toString());
    }

    private void nodosTerminalesX(Nodito<T> nodo, StringBuilder mensaje) {
        if (nodo == null) {
            return;
        }
        if (nodo.getIzq() == null && nodo.getDer() == null) {
            mensaje.append("Dato: ").append(nodo.getInfo()).append("\n");
        }
        nodosTerminalesX(nodo.getIzq(), mensaje);
        nodosTerminalesX(nodo.getDer(), mensaje);
    }

    public void imprimirNodosInteriores() {
        StringBuilder mensaje = new StringBuilder();
        nodosInterioresX(raiz, mensaje);
        Tools.imprimirMSJE(mensaje.toString());
    }

    private void nodosInterioresX(Nodito<T> nodo, StringBuilder mensaje) {
        if (nodo == null || (nodo.getIzq() == null && nodo.getDer() == null)) {
            return;
        }
        if (nodo != raiz) {
            mensaje.append("Dato: ").append(nodo.getInfo()).append("\n");
        }
        nodosInterioresX(nodo.getIzq(), mensaje);
        nodosInterioresX(nodo.getDer(), mensaje);
    }

    public int altura() {
        return obtenerAltura(raiz);
    }

    private int obtenerAltura(Nodito<T> nodo) {
        if (nodo == null) {
            return 0;
        }

        int alturaIzq = obtenerAltura(nodo.getIzq());
        int alturaDer = obtenerAltura(nodo.getDer());

        return Math.max(alturaIzq, alturaDer) + 1;
    }
    
    public int grado() {
        return gradoRec(raiz);
    }

    private int gradoRec(Nodito<T> nodo) {
        if (nodo == null) {
            return 0;
        }
        int gradoIzq = gradoRec(nodo.getIzq());
        int gradoDer = gradoRec(nodo.getDer());
        int gradoMaximo = Math.max(gradoIzq, gradoDer);
        if (nodo.getIzq() != null && nodo.getDer() != null) {
            gradoMaximo = Math.max(gradoMaximo, 2);
        } else if (nodo.getIzq() != null || nodo.getDer() != null) {
            gradoMaximo = Math.max(gradoMaximo, 1); 
        }
        return gradoMaximo;
    }

    public void verArbol() {
        StringBuilder sb = new StringBuilder();
        dibujarNodo(getRaiz(), sb, "", true);
        Tools.imprimirMSJE("Arbol Binario"+sb.toString());
    }

    private void dibujarNodo(Nodito<T> nodo, StringBuilder sb, String prefijo, boolean esIzquierdo) {
        if (nodo != null) {
            sb.append(prefijo).append(esIzquierdo ? "├── " : "└── ").append(nodo.getInfo().toString()).append("\n");
            dibujarNodo(nodo.getDer(), sb, prefijo + (esIzquierdo ? "│   " : "    "), false);
            dibujarNodo(nodo.getIzq(), sb, prefijo + (esIzquierdo ? "│   " : "    "), true);
        }
    }
}
