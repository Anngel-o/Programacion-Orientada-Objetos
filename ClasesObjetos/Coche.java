package ClasesObjetos;

public class Coche {
    //atributos
    String color;
    String marca;
    int km;

    //métodos
    public static void main(String[] args) {
        Coche coche1 = new Coche(); //instancia de la clase Coche
        coche1.color = "blanco";
        coche1.marca = "Audi";
        coche1.km = 0;

        Coche coche2 = new Coche();
        coche2.color = "negro";
        coche2.marca = "Ferrari";
        coche2.km = 100;

        System.out.println("Coche marca " + coche1.marca + ", color " + coche1.color + ", km de " + coche1.km);
        System.out.println("Coche marca " + coche2.marca + ", color " + coche2.color + ", km de " + coche2.km);
    }
}
