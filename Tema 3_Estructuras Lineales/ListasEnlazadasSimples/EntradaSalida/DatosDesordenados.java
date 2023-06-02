package EntradaSalida;

public class DatosDesordenados <T> {

	private Nodo<T> inicio;
	private Nodo<T> f;
	
	public DatosDesordenados() {
		inicio = null;
	}

	public boolean ListaVacia() {
		return inicio == null;
	}

	public void inserFrente(T dato) {
		Nodo<T> p = new Nodo<T>(dato);
		if(ListaVacia()) {
			inicio=p;f=p;
			}
		else {
			p.sig=inicio;
			inicio=p;
		}
	}
	
	public String imprimeLista() {
		String cad="";
		for(Nodo <T> j=inicio;j!=null;j=j.sig) {
			cad+=j.info+"--->\n";
		}
		return cad;
	}
	
	public void inserFinal(T dato) {
		Nodo<T> p = new Nodo<T>(dato);
		if(ListaVacia()) inicio=p;
		else {
			f.sig=p;
		}
		f=p;
	}
	
	public void eliminaLista(Nodo<T> pos) {
		if(pos==inicio) {
			inicio = inicio.sig;
		}
		else {
			Nodo <T> antes = dirAntes(pos);
			if (pos==f) {
				f = antes;antes.sig=null;
			}
			else
				antes.sig = pos.sig;
		}
		pos = null;
	}
	
	public Nodo <T> dirAntes(Nodo <T> pos) {
		Nodo <T> a=inicio;
		while(a.getSig()!=pos) {
			a=a.getSig();
		}
		return a;
	}
	
	public void modificar(Nodo aux) {
        aux.setInfo(Tools.leerInt("Ingrese nuevo dato: "));
    }
	
	public Nodo <T> busSecLista(int dato) {
		Nodo <T> i=inicio;
		int a = (int) i.getFolio();
		while(i!=null && a!=dato)
			i=i.sig;
			a = (int) i.getFolio();
		return i;
	}
}
