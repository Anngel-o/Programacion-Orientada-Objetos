package Sobrecarga;

public class Main {
    public static void main(String[] args) {
        Persona person = new Persona(21, "Jhon");
        Persona person1 = new Persona(21, "Jhon");

        person.correr();
        person1.correr(5);
    }
}
