package ParametrosArgumentos;

//import javax.swing.JOptionPane;

public class Operacion {
    // Atributos
    int suma, resta, multi, div; //variables globales

    // Métodos

    public void sumar(int n1, int n2) { //variables locales
        suma = n1 + n2;
    }

    public void restar(int n1, int n2) {
        resta = n1 - n2;
    }

    public void multiplicar(int n1, int n2) {
        multi = n1 * n2;
    }

    public void dividir(int n1, int n2) {
        div = n1 / n2;
    }

    public void mostrarResultados() {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multi);
        System.out.println("La división es: " + div);
    }

}
