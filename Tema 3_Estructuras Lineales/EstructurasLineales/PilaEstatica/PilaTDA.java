package PilaEstatica;

public interface PilaTDA <T>{

	//El interface obliga que implementen los métodos que agreguemos 
	
	public boolean isEmptyPila(); //Regresa true si la pila está vacia.
	public void pushPila(T dato); //Inserta el dato en el tope de la pila.
	public T popPila(); //Elimina el elemento que está en el tope de la pila.
	public T peekPila(); //Regresa el elemento que está en el tope, sin quitarlo.
	
}
