package Metodos;

import javax.swing.JOptionPane;

public class Operacion {
    //Atributos
    int n1, n2;
    int suma, resta, multi, div;

    //Métodos
    public void leerNumeros() {
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita el primer número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita el primer número"));
    }
    public void sumar() {
        suma = n1 + n2;
    }
    public void restar() {
        resta = n1 - n2;
    }
    public void multiplicar() {
        multi = n1 * n2;
    }
    public void dividir() {
        div = n1/n2;
    }
    public void mostrarResultados() {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multi);
        System.out.println("La división es: " + div);
    }

}

