package Constructor;

public class Persona {
    //Atributos
    int edad;
    String nombre;

    //Métodos
    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    public void mostrarDatos() {
        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + nombre);
    }
}
