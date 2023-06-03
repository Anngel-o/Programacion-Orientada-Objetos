package ConceptosPOO.Encapsular;

public class Clase2 {
    public static void main(String[] args) {
        Clase1 objeto1 = new Clase1();
        //objeto1.edad = 1000;
        objeto1.setEdad(34);
        objeto1.setNombre("Anngel");
        System.out.println("La edad es: " + objeto1.getEdad());
        System.out.println("El nombre es: " + objeto1.getNombre());
    }
}
