package MenuEstatico;

import javax.swing.*;
import EntradaSalida.Tools;
import MemoriaEstatica.memoriaEstatica;
import java.awt.*;
import java.awt.event.*;

public class InterfazGrafica {
    private JFrame frame;
    private JComboBox<String> comboBox;
    private JButton button;
    private JLabel label;
    
    public InterfazGrafica() {
        // Crear la ventana principal
        frame = new JFrame("Menú Métodos Ordenamiento");
        frame.setLayout(new BorderLayout());
        
        // Crear el panel para contener los elementos de la interfaz
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        // Crear la etiqueta
        label = new JLabel("Elija una opción:");
        panel.add(label);
        
        // Crear el menú desplegable
        String[] opciones = {"AGREGAR","GENERAR ALEATORIOS","IMPRIMIR",
                "VACIAR","BURBUJA SEÑAL","DOBLE BURBUJA","INCREMENTO DECREMENTO",
                "SELECCION DIRECTA","INSERCIÓN DIRECTA","BINARIA","HEAP SORT","QUICK SORT",
                "RADIX","INTERCALACION","MEZCLA DIRECTA"};
        comboBox = new JComboBox<>(opciones);
        panel.add(comboBox);
        
        // Crear el botón
        button = new JButton("Ejecutar");
        panel.add(button);
        
        // Agregar el ActionListener al botón
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener la opción seleccionada del menú desplegable
                String opcion = (String) comboBox.getSelectedItem();
                
                // Ejecutar la función correspondiente a la opción seleccionada
                if (opcion.equals("AGREGAR")) {
                    agregar();
                } else if (opcion.equals("GENERAR ALEATORIOS")) {
                    generarAleatorios();
                } else if (opcion.equals("IMPRIMIR")) {
                    imprimir();
                } else if (opcion.equals("VACIAR")) {
                    vaciar();
                } else if (opcion.equals("BURBUJA SEÑAL")) {
                    burbuSeñal();
                } else if (opcion.equals("DOBLE BURBUJA")) {
                    dobleBurbu();
                } else if (opcion.equals("INCREMENTO DECREMENTO")) {
                    increDecre();
                } else if (opcion.equals("SELECCION DIRECTA")) {
                    seleDirect();
                } else if (opcion.equals("INSERCIÓN DIRECTA")) {
                    inserDirect();
                } else if (opcion.equals("BINARIA")) {
                    bin();
                } else if (opcion.equals("HEAP SORT")) {
                    heap();
                } else if (opcion.equals("QUICK SORT")) {
                    quick();
                } else if (opcion.equals("RADIX")) {
                    rad();
                } else if (opcion.equals("INTERCALACION")) {
                    interCala();
                } else if (opcion.equals("MEZCLA DIRECTA")) {
                    mezcla();
                }
            }
        });
        
        // Agregar el panel a la ventana principal
        frame.add(panel, BorderLayout.CENTER);
        
        // Configurar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 225);
        frame.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        frame.setVisible(true);
    }
    
    memoriaEstatica obj = new memoriaEstatica(10);
    
    // Funciones de ejemplo
    public void agregar() {
        if(obj.espacioArray()) {
            obj.agregarDato(Tools.leerInt("Ingrese un valor:"));
            Tools.imprimirMSJE("Datos: " + obj.impresionDatos());
        } else {
            Tools.imprimirErrorMSJE("Memoria llena");
        }
    }
    
    public void generarAleatorios() {
        if(obj.espacioArray()) {
            obj.almacenaAleatorios();
            Tools.imprimirMSJE("Datos: " + obj.impresionDatos());
        } else {
            Tools.imprimirErrorMSJE("Memoria llena");
        }
    }
    
    public void imprimir() {
        if (obj.arrayVacio()) {
            Tools.imprimirErrorMSJE("Memoria Vacia");
        } else {
            Tools.imprimirMSJE("Datos: " + obj.impresionDatos());
        }
    }
    
    public void vaciar() {
        if (obj.arrayVacio()) {
            Tools.imprimirErrorMSJE("La memoria ya está vacia");
        } else {
            obj.vaciarArray();
            Tools.imprimirMSJE("Se vació la memoria");
        }
    }
    
    // 1
    public void burbuSeñal() {
        if(obj.arrayVacio()) {
            Tools.imprimirErrorMSJE("Memoria Vacia");
        } else {
            obj.burbujaSeñal();
            Tools.imprimirMSJE("Datos: " + obj.impresionDatos());
        }
    }
    
    // 2
    public void dobleBurbu() {
        if(obj.arrayVacio()) {
            Tools.imprimirErrorMSJE("Memoria Vacia");
        } else {
            obj.dobleBurbuja();
            Tools.imprimirMSJE("Datos: " + obj.impresionDatos());
        }
    }
    
    // 3
    public void increDecre() {
        if(obj.arrayVacio()) {
            Tools.imprimirErrorMSJE("Memoria Vacia");
        } else {
            obj.shellIncreDecre();
            Tools.imprimirMSJE("Datos: " + obj.impresionDatos());
        }
    }
    
    // 4
    public void seleDirect() {
        if(obj.arrayVacio()) {
            Tools.imprimirErrorMSJE("Memoria Vacia");
        } else {
            obj.seleDirecta();
            Tools.imprimirMSJE("Datos: " + obj.impresionDatos());
        }
    }
    
    // 5
    public void inserDirect() {
        if(obj.arrayVacio()) {
            Tools.imprimirErrorMSJE("Memoria Vacia");
        } else {
            obj.inserDirecta();
            Tools.imprimirMSJE("Datos: " + obj.impresionDatos());
        }
    }
    
    // 6
    public void bin() {
        if(obj.arrayVacio()) {
            Tools.imprimirErrorMSJE("Memoria Vacia");
        } else {
            obj.binaria();
            Tools.imprimirMSJE("Datos: " + obj.impresionDatos());
        }
    }
    
    // 7
    public void heap() {
        if(obj.arrayVacio()) {
            Tools.imprimirErrorMSJE("Memoria Vacia");
        } else {
            obj.heapSort();
            Tools.imprimirMSJE("Datos: " + obj.impresionDatos());
        }
    }
    
    // 8
    public void quick() {
        if(obj.arrayVacio()) {
            Tools.imprimirErrorMSJE("Memoria Vacia");
        } else {
            obj.quicksortRecursivo();
            Tools.imprimirMSJE("Datos: " + obj.impresionDatos());
        }
    }
    
    // 9
    public void rad() {
        if(obj.arrayVacio()) {
            Tools.imprimirErrorMSJE("Memoria Vacia");
        } else {
            obj.radix();
            Tools.imprimirMSJE("Datos: " + obj.impresionDatos());
        }
    }
    
    // 10
    public void interCala() {
        if(obj.arrayVacio()) {
            Tools.imprimirErrorMSJE("Memoria Vacia");
        } else {
            obj.intercalacion();
            Tools.imprimirMSJE("Datos: " + obj.impresionDatos());
        }
    }
    
    // 11
    public void mezcla() {
        if(obj.arrayVacio()) {
            Tools.imprimirErrorMSJE("Memoria Vacia");
        } else {
            obj.mezclaDirecta();
            Tools.imprimirMSJE("Datos: " + obj.impresionDatos());
        }
    }
    public static void main(String[] args) {
        // Establecer el aspecto visual de la interfaz
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Crear una instancia de la clase MenuDesplegable
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica();
            }
        });
    }
}