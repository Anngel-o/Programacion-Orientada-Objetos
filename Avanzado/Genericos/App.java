package Avanzado.Genericos;

import java.util.List;
import java.util.ArrayList;

public class App{
    public static void main(String[] args) {
        //Type safety <TipoDeDato> es una protección al tipo de dato aceptado en una lista de datos
        // Clase<String> clase = new Clase<String>("Angel");
        // clase.mostrarTipo();
        // Integer in = Integer(clase);
        //Casteo es "transformar" una objeto a otro tipo de dato para poder manipularlo como un objeto con otro tipo de dato

        Clase<String, Integer, String> clase = new Clase<>("String1", 45, "String2");
        clase.mostrarTipo();
        System.out.println();

        List<Clase<String, Integer, String>> lista = new ArrayList<>();// A partir de las versiones 1.7 en adelante, es opcional repetir dentro de los diamantes <> el tipo de dato y sus estereotipos
        //List<Clase<String, Integer, String>> lista2 = new ArrayList<Clase<String, Integer, String>>();
        lista.add(new Clase<>("String1", 45, "String2"));

        for (Clase<String,Integer,String> clase1 : lista) {
            clase1.mostrarTipo();
        }
    }
}
