package Concurrencia.Hilo;

public class Hilos {
    public static void Suma(int a, int b) {
        System.out.println("La suma es: " + (a + b));
    }

    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new Thread(() -> {
            Suma(5, 4);
        });

        hilo.start();
        hilo.join();

        System.out.println("Ejecución finalizada");
    }
}
