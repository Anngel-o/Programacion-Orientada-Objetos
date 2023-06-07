package Avanzado.Genericos.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class App {
    public void listarUpperBounded(List<? extends Persona> lista){
        // <?> hace referencia a herencia e implementaciones de Object, también puede representarse <? extends Object>
        //Sólo acepta tipos de datos que sean sub clases de Persona
        for (Persona persona : lista) {
            //if (alumno instanceof Alumno) {
                System.out.println(((Persona)persona).getNombre());//Casteo
            //} else if(alumno instanceof Profesor) {
                //System.out.println(((Profesor)alumno).getNombre());
            //} 
        }
    }

    public void listarLowerrBounded(List<? super Alumno> lista){
        //Se entra en un contexto inferior, por eso su nombre; sólo se aceptan clases que sean super clases de Alumno, es decir las clases mayores de Alumno
        for (Object alumno : lista) {
            System.out.println(((Alumno)alumno).getNombre());//Casteo
        }
    }

    public void listarUnBounded(List<?> lista){
        //No se indica el tipo de dato
        for (Object alumno : lista) {
            System.out.println(((Alumno)alumno).getNombre());//Casteo
        }
    }
    public static void main(String[] args) {
        App app = new App();

        Persona profesor1 = new Profesor("Profesor 1");
        Persona alumno1 = new Alumno("Alumno 2");
        Alumno alumno2 = new Alumno("Alumno 3");
        Profesor profesor2 = new Profesor("Profesor 2");

        List<Persona> lista = new ArrayList<>();
        lista.add(alumno1);
        lista.add(alumno2);
        lista.add(profesor1);
        lista.add(profesor2);

        app.listarUpperBounded(lista);
    }
}
