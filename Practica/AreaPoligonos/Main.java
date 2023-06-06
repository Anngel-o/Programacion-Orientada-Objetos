package AreaPoligonos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Hacer un programa para calcular el área de polígonos (triángulos y rectángulos), el programa debe ser capaz de almacenar en un array N triángulos y rectángulos, al final mostrar el área y los datos de cada uno.

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();

    public static void llenarPoligono() {
        int op;
        char res;
        do {
            do {
                System.out.println("Digite el polígono que desea: ");
                System.out.println("1. Triángulo");
                System.out.println("2. Rectángulo");
                System.out.println("3. Salir");
                System.out.println("Opción: ");
                op = scanner.nextInt();    
            } while (op < 1 || op > 3);

            switch (op) {
                case 1: //Llenar triángulo
                    llenarTriangulo();
                    break;
                case 2: //Llenar rectángulo
                    llenarRectangulo();
                    break;
                default:
                    break;
            }
            System.out.println("Deseas introducir otro polígono? ");
            res = scanner.next().charAt(0);
            System.out.println();
        
        } while (res == 's' || res == 'S');
    }

    public static void llenarTriangulo() {
        double lado1, lado2, lado3;
        
        System.out.print("Digite el lado 1 del triángulo: ");
        lado1 = scanner.nextDouble();
        System.out.print("Digite el lado 2 del triángulo: ");
        lado2 = scanner.nextDouble();
        System.out.print("Digite el lado 3 del triángulo: ");
        lado3 = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        poligonos.add(triangulo);
    }

    public static void llenarRectangulo() {
        double base, altura;
        
        System.out.print("Digite el base del rectángulo: ");
        base = scanner.nextDouble();
        System.out.print("Digite el altura del rectángulo: ");
        altura = scanner.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(base, altura);
        poligonos.add(rectangulo);
    }

    public static void mostrarPoligonos(){
        for (Poligono poligono : poligonos) {
            System.out.println(poligono.toString());
        }
    }
    public static void main(String[] args) {
        llenarPoligono();
        mostrarPoligonos();
    }
}
