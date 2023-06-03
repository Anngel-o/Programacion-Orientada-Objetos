package Concurrencia.OperacionesAtomicas;

import java.util.concurrent.atomic.AtomicInteger;

public class Example {
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args){
        Thread hilo1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementAndGet();
            }
        });

        Thread hilo2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementAndGet();
            }
        });

        hilo1.start();
        hilo2.start();

        try {
            hilo1.join();
            hilo2.join();
        } catch (Exception e) {
            System.out.println("Interrupted!");
        }

        System.out.println("Counter value: " + counter.get());
        System.out.println("Ejecución finalizada");
    }
}
