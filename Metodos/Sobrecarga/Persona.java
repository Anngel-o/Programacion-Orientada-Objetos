package Sobrecarga;

public class Persona {
    //Atributos
    int edad;
    String nombre;
    String dni;

    //Métodos
    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    public Persona(String dni) {
       this.dni = dni;
    }

    public void correr(){
        System.out.println("Corriendo");
    }
    public void correr(int km){
        System.out.println("Corriendo " + km + " km"); 
    }
}
