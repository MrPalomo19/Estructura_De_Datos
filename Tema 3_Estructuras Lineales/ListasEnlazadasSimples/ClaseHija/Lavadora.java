package ClaseHija;

import ClasePadre.Electrodomesticos;

public class Lavadora extends Electrodomesticos {
	 private double precio;
	 private boolean aguaCaliente;
	 private int horas;
	 private double costeHora;
	 
	 public Lavadora() {
		 super();
		 folio++;
	 }
	    
	    public Lavadora(String marca, double potencia) {
	        super("Lavadora",marca, potencia);
	        this.aguaCaliente = false;
	    }
	    
	    public Lavadora(String marca, double precio, double potencia, boolean aguaCaliente) {
	        super("Lavadora",marca, potencia);
	        this.precio = precio;
	        this.aguaCaliente = aguaCaliente;
	      
	    }
	    
	    public void setPrecio(double precio) {
	        this.precio = precio;
	    }
	    
	    public double getPrecio() {
	        return precio;
	    }
	    
	    public void setAguaCaliente(boolean aguaCaliente) {
	        this.aguaCaliente = aguaCaliente;
	    }
	    
	    public boolean isAguaCaliente() {
	        return aguaCaliente;
	    }
	    
	    public int getHoras() {
			return horas;
		}
	    
	    public void setHoras(int horas) {
	        this.horas = horas;
	    }
	    
	    public double getCosteHora() {
	    	return costeHora;
	    }
	    
	    public void setCosteHora(double costeHora) {
	        this.costeHora = costeHora;
	    }
	    
		@Override
	    public String toString() {
	        return super.toString() + 
	        		", Precio= $" + precio + 
	        		", Agua Caliente= " + aguaCaliente+ 
	        		", Consumo= " + calcularConsumo(horas) +
	        		", Costo del consumo= $"+ calcularCosteConsumo(horas, costeHora) + "]";
	    }
	    
	    @Override
	    public double calcularConsumo(int horas) {
	        if (aguaCaliente) {
	        	return horas * (getPotencia() + getPotencia() * 0.20);
	        } else {
	        	return horas * getPotencia();
	        }
	    }
}
