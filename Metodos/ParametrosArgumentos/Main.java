package ParametrosArgumentos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int n1, n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita el primer número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita el primer número"));

        Operacion op = new Operacion();

        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);
        op.mostrarResultados();
    }
}
