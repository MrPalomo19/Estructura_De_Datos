package EstruCola;

public interface ColaTDA <T>{

	public boolean isEmptyCola(); //Regresa true si la pila está vacia.
	public void pushCola(T dato); //Inserta el dato en el tope de la pila.
	public T popCola(); //Elimina el elemento que está en el tope de la pila.
	public T peekCola(); //Regresa el elemento que está en el tope, sin quitarlo.
	
}
