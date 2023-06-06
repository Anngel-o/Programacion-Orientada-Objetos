package Avanzado.InstanceOf;

import java.util.ArrayList;
import java.util.List;

public class App {

    private List canasta = new ArrayList();
    private void verificarFruta(Object obj) {
        if (obj instanceof Fruta) {
            canasta.add(obj);
            System.out.println("Fruta agregada " + ((Fruta)obj).getNombre());
        } else {
            System.out.println("No es una fruta");
        }
    }
    public static void main(String[] args) {
        String texto = new String("Hola");

        //Comprobar si un valor es una instancia de algún tipo de objeto
        if (texto instanceof String) {
            System.out.println("Es un string");
        }

        Alumno alumno = new Alumno("Anngel");
        if (alumno instanceof Persona) {
            System.out.println(alumno.getNombre() + " es una persona");
        }

        //Se tiene una canasta donde solo se permite introducir frutas
        System.out.println("Ingrese una fruta a la canasta: ");
        List canasta = new ArrayList();
        Manzana manzana1 = new Manzana("Roja");
        Manzana manzana2 = new Manzana("Verde");
        Naranja naranja = new Naranja("Naranja");
        Galleta galleta = new Galleta("Chocolate");

        canasta.add(manzana1);
        canasta.add(manzana2);
        canasta.add(naranja);
        canasta.add(galleta);

        App app = new App();
        app.verificarFruta(manzana1);
        app.verificarFruta(manzana2);
        app.verificarFruta(naranja);
        app.verificarFruta(galleta);
    }
}
