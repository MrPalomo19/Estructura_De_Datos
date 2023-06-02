package ClasePadre;

public class Electrodomesticos {
	 public static int folio = 100;
	  protected String tipo;
	  protected String marca;
	  protected double potencia;
	  
	  public Electrodomesticos() {
	  }
	  
	    public Electrodomesticos(String tipo, String marca, double potencia) {
	        this.tipo = tipo;
	        this.marca = marca;
	        this.potencia = potencia;
	        folio++;
	    }
	    
	    public String getTipo() {
	        return tipo;
	    }
	    
	    public void setTipo(String tipo) {
	        this.tipo = tipo;
	    }
	    
	    public String getMarca() {
	        return marca;
	    }
	    
	    public void setMarca(String marca) {
	        this.marca = marca;
	    }
	    
	    public double getPotencia() {
	        return potencia;
	    }
	    
	    public void setPotencia(double potencia) {
	        this.potencia = potencia;
	    }
	    
	    public static int getFolio() {
	        return folio;
	    }
	    
	    public double calcularConsumo(int horas) {
	        return horas * getPotencia();
	    }
	    
	    public double calcularCosteConsumo(int horas, double costeHora) {
	        return horas * getPotencia() * costeHora;
	    }

    public String toString() {
        return "Electrodomesticos [ Folio= " + folio 
        		+ ", Tipo= " + tipo 
        		+ ", Marca= " + getMarca() 
        		+ ", Potencia= " + getPotencia() + " kW/h";
    }
}