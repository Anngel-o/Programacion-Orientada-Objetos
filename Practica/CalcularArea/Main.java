package Practica.CalcularArea;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Cuadrilatero cuadrilatero;
        float lado1, lado2;

        lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digita el valor del lado 1: "));
        lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digita el valor del lado 2: "));

        if (lado1 == lado2) {
            cuadrilatero = new Cuadrilatero(lado1);
        }
        else {
            cuadrilatero = new Cuadrilatero(lado1, lado2);
        }

        cuadrilatero.getArea();
        cuadrilatero.getPerimetro();
    }
}
