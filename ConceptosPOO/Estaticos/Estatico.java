package ConceptosPOO.Estaticos;

public class Estatico {
    private static String frase = "Primera frase";

    public static int sumar(int a, int b) {
        int suma = a + b;
        return suma;
    }

    public static void main(String[] args) {
        Estatico obj1 = new Estatico();
        Estatico obj2 = new Estatico();
        
        obj2.frase = "Segunda frase";

        System.out.println(obj1.frase); 
        System.out.println(obj2.frase); 
        System.out.println("La suma es: " + Estatico.sumar(4, 7));
    }
}
