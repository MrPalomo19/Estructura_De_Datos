package EntradaSalida;

import javax.swing.JOptionPane;

public class Tools {
	
public static  byte leerByte(String msje) {
		
	    byte num=0;
		boolean r=true;
		do{
		try{
		num=(Byte.parseByte(JOptionPane.showInputDialog(null,msje,"Lectura",JOptionPane.QUESTION_MESSAGE)));
		r=false;
		}catch (NumberFormatException e){
		Tools.imprimirErrorMSJE("Error Ingrese valor valido, no deje campos vacios");
		}
		}while(r);
		return num;
		}
		
		public static short leerShort(String msje) {
			
			short num=0;
			boolean r=true;
			do{
			try{
			num=(Short.parseShort(JOptionPane.showInputDialog(null,msje,"Lectura",JOptionPane.QUESTION_MESSAGE)));
			r=false;
			}catch (NumberFormatException e){
			Tools.imprimirErrorMSJE("ErrorIngrese valor valido, no deje campos vacios use numeros enteros");
			}
			}while(r);
			return num;
		
		}
		
		public static int leerInt(String msje) {
	
			int num=0;
			boolean r=true;
			do{
			try{
			num=(Integer.parseInt(JOptionPane.showInputDialog(null,msje,"Entrada de datos",JOptionPane.INFORMATION_MESSAGE)));
			r=false;
			}catch (NumberFormatException e){
			Tools.imprimirErrorMSJE("Error Ingrese valor valido, no deje campos vacios use numeros enteros");
			}
			}while(r);
			return num;
		}

		public static Long leerLong(String msje) {
			
			long num=0;
			boolean r=true;
			do{
			try{
			num=(Long.parseLong(JOptionPane.showInputDialog(null,msje,"Lectura",JOptionPane.QUESTION_MESSAGE)));
			r=false;
			}catch (NumberFormatException e){
			Tools.imprimirErrorMSJE("ErrorIngrese valor valido, no deje campos vacios");
			}
			}while(r);
			return num;
			
		}
		
		public static Float leerFloat(String msje) {
			
			float num=0;
			boolean r=true;
			do{
			try{
			num=(Float.parseFloat(JOptionPane.showInputDialog(null,msje,"Lectura",JOptionPane.QUESTION_MESSAGE)));
			r=false;
			}catch (NumberFormatException e){
			Tools.imprimirErrorMSJE("ErrorIngrese valor valido, no deje campos vacios");
			}
			}while(r);
			return num;
				
		}
		
		public static  double leerDouble(String msje){ 
			
			double num=0;
			boolean r=true;
			do{
			try{
			num=Double.parseDouble(JOptionPane.showInputDialog(null,msje,"Lectura",JOptionPane.QUESTION_MESSAGE));
			r=false;
			}catch (NumberFormatException e){
			Tools.imprimirErrorMSJE("ErrorIngrese valor valido, no deje campos vacios");
			}
			}while(r);
			return num;
			
		}

		public static char leerChar(String msje) {
			
			char num=0;
			boolean r=true;
			do{
			try{
			num=(JOptionPane.showInputDialog(null,msje,"Lectura",JOptionPane.QUESTION_MESSAGE).charAt(0));
			r=false;
			}catch (NumberFormatException e){
			Tools.imprimirErrorMSJE("ErrorIngrese valor valido, no deje campos vacios");
			}
			}while(r);
			return num;
			
		}
		
		public  static  String leerString(String msje){ 
			
			String num ="";
			boolean r=true;
			do{
			try{
			num=JOptionPane.showInputDialog(null,"Entrada de datos",msje,JOptionPane.QUESTION_MESSAGE);
			r=false;
			}catch (NumberFormatException e){
			Tools.imprimirErrorMSJE("ErrorIngrese valor valido, no deje campos vacios");
			}
			}while(r);
			return num;
			
		}
	
		public static void imprimirMSJE(String Msje) {
			
			JOptionPane.showMessageDialog(null, Msje,"Salida",JOptionPane.QUESTION_MESSAGE);
		}
		
	   public static void imprimirErrorMSJE(String Msje) {
			
			JOptionPane.showMessageDialog(null, Msje,"Salida",JOptionPane.ERROR_MESSAGE);
		}
	   
	   public static float retiarDinero (float saldoRet, float saldIni, float sal) {
		   sal=saldIni-saldoRet;
		   return sal;
	   }
	   
	   public static String tPlaneta() {
		   String valores[]= {"Gaseoso","Terrestre","Enano"};
		   return (String)JOptionPane.showInputDialog(null,"Selecciona","El tipo de planeta es: ",JOptionPane.QUESTION_MESSAGE,null, valores,valores[0]);
	   }
	   
	   public static String tipoNovela() {
			String opcion[] = {"Histórica", "Romántica" ,"Policíaca", "Realista", "Ciencia Ficción", "Aventuras"};
			int n;
			n = JOptionPane.showOptionDialog(null, "Elige una opción: ", "Tipo de Novela", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);
			return(opcion[n]);
	    }
	   
	   public static String menuLibro() {
			String opcion[] = {"Libro Texto","Libro Texto Uni", "Novela" ,"Imprimir Novela", "Imprimir","Salir"};
			int n;
			n = JOptionPane.showOptionDialog(null, "Elige una opción: ", "Tipo de Novela", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);
			return(opcion[n]);
	    }
	   
	   public static String seleccionBoton1(String menu) {
		   String opcion[]= {"Insertar dato","Imprimir","Buscar","Eliminar","Modificar","SALIR"};
		   int n;
		   n = JOptionPane.showOptionDialog(null,"SELECCIONA DANDO CLICK","M E N U", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);
		   return (opcion[n]);
	   }
	   
	   public static String seleccionBoton2(String menu) {
		   String opcion[]= {"ENTRENADOR","FUTBOLISTA","MASAJISTA","IMPRIMIR","IMPRIMIRFUT","SALIR"};
		   int n;
		   n = JOptionPane.showOptionDialog(null,"SELECCIONA DANDO CLICK","M E N U", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);
		   return (opcion[n]);
	   }
	   
	   public static String seleccionBoton3(String menu) {
		   String opcion[]= {"Triangulo","Cuadrado","Rombo","Imprimir Figuras","SALIR"};
		   int n;
		   n = JOptionPane.showOptionDialog(null,"SELECCIONA DANDO CLICK","M E N U", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);
		   return (opcion[n]);
	   }
	  
	   public static String seleccionBoton4(String menu) {
		   String opcion[]= {"Insertar dato","Buscar dato","Ordenar datos","Ver datos","SALIR"};
		   int n;
		   n = JOptionPane.showOptionDialog(null,"SELECCIONA DANDO CLICK","M E N U", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);
		   return (opcion[n]);
	   }
	  
	   public static String seleccionBoton5(String menu) {
		   String opcion[]= {"Insertar dato","Ordenar datos","Ver datos","SALIR"};
		   int n;
		   n = JOptionPane.showOptionDialog(null,"Selecciona una opcion dando click","MENU", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);
		   return (opcion[n]);
	   }
	   
	   public static String seleccionBoton6(String menu) {
		   String opcion[]= {"Insertar datos","Acelerar","Frenar","Revoluciones","SALIR"};
		   int n;
		   n = JOptionPane.showOptionDialog(null,"SELECCIONA DANDO CLICK","M E N U", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);
		   return (opcion[n]);
	   }
	   
	   public static String seleccionBoton7(String menu) {
		   String opcion[]= {"Tabla de Mul","Numero mayor","Factorial","Cuenta Dig","Rectangulo","Salir"};
		   int n;
		   n = JOptionPane.showOptionDialog(null,"SELECCIONA DANDO CLICK","M E N U", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);
		   return (opcion[n]);
	   }

}
