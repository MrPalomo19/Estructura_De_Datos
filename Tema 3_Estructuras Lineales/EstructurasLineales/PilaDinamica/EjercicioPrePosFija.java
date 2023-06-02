package PilaDinamica;

import java.util.Stack;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import EntradaSalida.Tools;

public class EjercicioPrePosFija {
   
	public static void main(String[] args) {
        String infij = Tools.leerString("Ingrese una expresión:");
        String posfij = "";
        Stack<Character> stack = new Stack<Character>();
        int longi = infij.length();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Carácter");
        modelo.addColumn("Estado actual");
        modelo.addColumn("Expresión posfija");
        for (int i = 0; i < longi; i++) {
            char caracter = infij.charAt(i);
            String estado = "";
            for (Character c : stack) {
                estado += c;
            }
            if (caracter == '(') {
                stack.push(caracter);
            } else if (Character.isLetterOrDigit(caracter)) {
                posfij += caracter;
            } else if (caracter == ')') {
                while (!stack.empty() && stack.peek() != '(') {
                    posfij += stack.pop();
                }
                if (!stack.empty()) {
                	stack.pop();
                }
            } else {
                while (!stack.empty() && jerarquia(stack.peek()) >= jerarquia(caracter)) {
                    posfij += stack.pop();
                }
                stack.push(caracter);
            }
            modelo.addRow(new Object[] {caracter, estado, posfij});
        }
        while (!stack.empty()) {
            posfij += stack.pop();
        }
        modelo.addRow(new Object[] {"", "", posfij});
        JTable tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);
        JOptionPane.showMessageDialog(null, scroll, "Tabla de Estados", JOptionPane.PLAIN_MESSAGE);
    }

    public static int jerarquia(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else if (c == '*' || c == '/' || c == '%') {
            return 2;
        } else if (c == '^') {
            return 3;
        } else {
            return -1;
        }
    }
}
