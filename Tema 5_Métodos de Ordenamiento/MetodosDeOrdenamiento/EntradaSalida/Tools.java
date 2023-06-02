package EntradaSalida;

import javax.swing.JOptionPane;

public class Tools {
	
		// Leer Byte
		public static  byte leerByte(String msje) {
			byte num=0;
			boolean r=true;
			do{
				try{
					num=(Byte.parseByte(JOptionPane.showInputDialog(null,msje,"Lectura",JOptionPane.QUESTION_MESSAGE)));
					r=false;
				}catch (NumberFormatException e){
					Tools.imprimirErrorMSJE("Error, Ingrese valor valido, no deje campos vacios");
				}
			}while(r);
			return num;
		}
		
		// Leer Short
		public static short leerShort(String msje) {
			short num=0;
			boolean r=true;
			do{
				try{
					num=(Short.parseShort(JOptionPane.showInputDialog(null,msje,"Lectura",JOptionPane.QUESTION_MESSAGE)));
					r=false;
				}catch (NumberFormatException e){
					Tools.imprimirErrorMSJE("Error, Ingrese valor valido, no deje campos vacios use numeros enteros");
			}
			}while(r);
			return num;
		}
		
		// Leer Int
		public static int leerInt(String msje) {
			int num=0;
			boolean r=true;
			do{
				try{
					num=(Integer.parseInt(JOptionPane.showInputDialog(null,msje,"Lectura",JOptionPane.QUESTION_MESSAGE)));
					r=false;
				}catch (NumberFormatException e){
					Tools.imprimirErrorMSJE("Error, Ingrese valor valido, no deje campos vacios use numeros enteros");
			}
			}while(r);
			return num;
		}
		
		// Leer Long
		public static Long leerLong(String msje) {
			long num=0;
			boolean r=true;
			do{
				try{
					num=(Long.parseLong(JOptionPane.showInputDialog(null,msje,"Lectura",JOptionPane.QUESTION_MESSAGE)));
					r=false;
				}catch (NumberFormatException e){
					Tools.imprimirErrorMSJE("Error, Ingrese valor valido, no deje campos vacios");
			}
			}while(r);
			return num;
		}
		
		// Leer Float
		public static Float leerFloat(String msje) {
			float num=0;
			boolean r=true;
			do{
				try{
					num=(Float.parseFloat(JOptionPane.showInputDialog(null,msje,"Lectura",JOptionPane.QUESTION_MESSAGE)));
					r=false;
				}catch (NumberFormatException e){
					Tools.imprimirErrorMSJE("Error, Ingrese valor valido, no deje campos vacios");
			}
			}while(r);
			return num;
		}
		
		//  Leer Double
		public static  double leerDouble(String msje){ 
			double num=0;
			boolean r=true;
			do{
				try{
					num=Double.parseDouble(JOptionPane.showInputDialog(null,msje,"Lectura",JOptionPane.QUESTION_MESSAGE));
					r=false;
				}catch (NumberFormatException e){
					Tools.imprimirErrorMSJE("Error, Ingrese valor valido, no deje campos vacios");
			}
			}while(r);
			return num;
		}
		
		// Leer Char
		public static char leerChar(String msje) {
			char num=0;
			boolean r=true;
			do{
				try{
					num=(JOptionPane.showInputDialog(null,msje,"Lectura",JOptionPane.QUESTION_MESSAGE).charAt(0));
					r=false;
				}catch (NumberFormatException e){
					Tools.imprimirErrorMSJE("Error, Ingrese valor valido, no deje campos vacios");
			}
			}while(r);
			return num;
		}
		
		// Leer String
		public  static  String leerString(String msje){ 
			String num ="";
			boolean r=true;
			do{
				try{
					num=JOptionPane.showInputDialog(null,msje,"Lectura"+ "",JOptionPane.QUESTION_MESSAGE);
					r=false;
				}catch (NumberFormatException e){
					Tools.imprimirErrorMSJE("Error, Ingrese valor valido, no deje campos vacios");
			}
			}while(r);
			return num;
			
		}
		
		// Impresion de Mensaje
		public static void imprimirMSJE(String Msje) {
			JOptionPane.showMessageDialog(null, Msje,"Salida",JOptionPane.QUESTION_MESSAGE);
		}
		
		// Impresion de Mensaje Error
	    public static void imprimirErrorMSJE(String Msje) {
			JOptionPane.showMessageDialog(null, Msje,"Salida",JOptionPane.ERROR_MESSAGE);
		}
	   
	    // Menu Botones
	    public static String Botones(String menu) {
		   try {
		   String opcion[]= {"","","","","","",""};
		   int n;
		   n = JOptionPane.showOptionDialog(null,"SELECCIONA DANDO CLICK","M E N U", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);
		   return (opcion[n]);
		   } catch (Exception e) {
			   System.exit(0);
		   } return null;
	   }
	   
	    // Menu Deslizable
	    public static String Deslizable() {
		   try {
		   String valores[]= {"","","","","","","","","",""};
		   return (String)JOptionPane.showInputDialog(null,"Tipo","Selecciona el tipo de modelo: ",JOptionPane.QUESTION_MESSAGE,null, valores,valores[0]);
		   } catch (Exception e) {
		   System.exit(0);
		   } return null;
	  }
	    
	 // Menu Botones Memorias
	    public static String BotonesMemoria(String menu) {
		   try {
		   String opcion[]= {"AGREGAR","GENERAR ALEATORIOS","IMPRIMIR","BURBUJA SEÑAL","DOBLE BURBUJA","INCRE DECRE","SELECCION DIRECTA","INSER DIRECTA","BINARIA","HEAP SORT","QUICK SORT","RADIX","INTERCALACION"};
		   int n;
		   n = JOptionPane.showOptionDialog(null,"SELECCIONA DANDO CLICK","M E N U", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);
		   return (opcion[n]);
		   } catch (Exception e) {
			   System.exit(0);
		   } return null;
	   }
	 // Menu delizable Memorias   
	    public static String DeslizableMemoria() {
			   try {
			   String valores[]= {"AGREGAR","GENERAR ALEATORIOS","IMPRIMIR","VACIAR","BURBUJA SEÑAL","DOBLE BURBUJA","INCREMENTO DECREMENTO","SELECCION DIRECTA","INSERCIÓN DIRECTA","BINARIA","HEAP SORT","QUICK SORT","RADIX","INTERCALACION","SALIR"};
			   return (String)JOptionPane.showInputDialog(null,"SELECCIONA DANDO CLICK","M E N U",JOptionPane.QUESTION_MESSAGE,null, valores,valores[0]);
			   } catch (Exception e) {
			   System.exit(0);
			   } return null;
		  }
}


