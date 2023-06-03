package BuscarVehiculo;

import java.util.Scanner;

public class Main {
    // Construir un programa que dada una serie de vehículos caracterizados por su marca, modelo y precio, imprima las propiedades del vehiculo más barato. Para ello, se deberán leer por teclado las características de cada vehículo y crear una clase que represente a cada uno de ellos.
    public static int indiceVehiculoBarato(Vehiculo vehiculos[]) {
        double precio;
        int indice = 0;

        precio = vehiculos[0].getPrecio();
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i].getPrecio() < precio) {
                precio = vehiculos[i].getPrecio();
                indice = i;
            }
        }
        return indice;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String marca, modelo;
        double precio;
        int numVehiculos, indiceVehiculoBarato;

        System.out.print("Digita la cantidad de vehículos: ");
        numVehiculos = scanner.nextInt();

        Vehiculo vehiculos[] = new Vehiculo[numVehiculos];
        for (int i = 0; i < vehiculos.length; i++) {
            scanner.nextLine();
            System.out.println("Digite los datos del vehículo: ");
            System.out.print("Marca: ");
            marca = scanner.next();
            System.out.print("Modelo: ");
            modelo = scanner.next();
            System.out.print("Precio: ");
            precio = scanner.nextDouble();

            vehiculos[i] = new Vehiculo(marca, modelo, precio);
        }
        indiceVehiculoBarato = indiceVehiculoBarato(vehiculos);
        System.out.println("El vehículo más barato es: " + vehiculos[indiceVehiculoBarato].toString());
    }
}
