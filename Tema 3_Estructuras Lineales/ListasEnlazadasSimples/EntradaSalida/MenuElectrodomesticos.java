package EntradaSalida;

import javax.swing.JOptionPane;

import ClaseHija.Lavadora;
import ClasePadre.Electrodomesticos;

public class MenuElectrodomesticos <T> {
	public static void main(String[] args) {
		listasElectro();
	}
	
	public static void listasElectro() {
		DatosDesordenados <Lavadora> obj = new DatosDesordenados <Lavadora>();
		String op;
	do {
		op=Tools.BotonElectro("Frente,Final,Buscar,Eliminar,Modificar,Imprimir,Salir");
		switch(op) {
		
		
	case "FRENTE": obj.inserFrente(Datos());
		Tools.imprimirMSJE("Datos: \n"+obj.imprimeLista());break;
		
		
	case "FINAL": obj.inserFinal(Datos());
		Tools.imprimirMSJE("Datos: \n"+obj.imprimeLista());break;
		
		
	case "BUSCAR" : if (obj.ListaVacia()) Tools.imprimirMSJE("Lista Vacia"); 
        else {
        	int folio = Tools.leerInt("Ingresa el folio que desees buscar: ");
            Nodo aux = obj.busSecLista(folio);
            if (aux == null) {
                Tools.imprimirMSJE("No existe");
            } else 
            	Tools.imprimirMSJE("Datos Encontrados: \n" + aux.getInfo().toString());
            }break;
		
            
	case "ELIMINAR" : if(obj.ListaVacia()) Tools.imprimirMSJE("Lista Vacia");
		else {
			int folio = Tools.leerInt("Ingresa el folio que desees eliminar:");
			Nodo aux = (Nodo) obj.busSecLista(folio);
			if (aux==null) {
				Tools.imprimirMSJE("No existe");
			} else
				obj.eliminaLista(aux);
			}break;
			
			
	case "MODIFICAR" : if (obj.ListaVacia()) {
            Tools.imprimirMSJE("Lista Vacia");
        } else {
            int folio = Tools.leerInt("Ingrese el número de folio a modificar:");
            Nodo aux = obj.busSecLista(folio);
            if (aux == null) {
                Tools.imprimirMSJE("El número de folio no existe");
            } else {
                String actualizar = Tools.Actualizacion("Marca,Potencia,Precio");
                switch (actualizar) {
                    case "MARCA":
                        String nuevaMarca = Tools.Marcas();
                        ((Lavadora) aux.getInfo()).setMarca(nuevaMarca);
                        Tools.imprimirMSJE("La marca se modifico");
                        break;
                    case "POTENCIA":
                        double nuevaPotencia = Tools.leerDoublet("Nueva potencia:");
                        ((Lavadora) aux.getInfo()).setPotencia(nuevaPotencia);
                        Tools.imprimirMSJE("La potencia se modifico");
                        break;
                    case "PRECIO":
                        double nuevoPrecio = Tools.leerDoublet("Nuevo precio:");
                        ((Lavadora) aux.getInfo()).setPrecio(nuevoPrecio);
                        Tools.imprimirMSJE("El tipo se modifico");
                        break;
                }
                Tools.imprimirMSJE("Datos Actualizados: \n" + obj.imprimeLista());
            	 }
             }break;
        
        
	case "IMPRIMIR" : Tools.imprimirMSJE(obj.imprimeLista());break;
		
		}	
	} while(!op.equals("SALIR"));
}
	
	public static Lavadora Datos() {
		Lavadora obj = new Lavadora ();
		System.out.println(""+Electrodomesticos.folio);
		String tipo = Tools.leerString("Ingrese el tipo de electrodomestico:"); obj.setTipo(tipo);
		String marca = Tools.Marcas(); obj.setMarca(marca);
		double potencia = Tools.leerDoublet("Potencia:"); obj.setPotencia(potencia);
		double	precio = Tools.leerDoublet("Precio:"); obj.setPrecio(precio);
		int agua = JOptionPane.showConfirmDialog(null, "¿Ocupas agua caliente?", "Lectura", JOptionPane.YES_NO_OPTION);
		int horas = Tools.leerInt("Horas de uso:");obj.setHoras(horas);
		double costeHora = Tools.leerDoublet("Costo por hora: $"); obj.setCosteHora(costeHora);
		if (agua == 1) {
			obj.setAguaCaliente(false);
		} else if (agua == 0) {
			obj.setAguaCaliente(true);
		}
   return obj;
	}
}
