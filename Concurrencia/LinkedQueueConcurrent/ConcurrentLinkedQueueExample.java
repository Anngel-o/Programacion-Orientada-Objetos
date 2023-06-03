package Concurrencia.LinkedQueueConcurrent;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

        //Agregar elementos
        queue.offer("Charizard");
        queue.offer("Blastoise");
        queue.offer("Snorlax");

        //Mostrar elementos de la cola
        System.out.println(queue);

        //Eliminar elemento
        String elementoEliminado = queue.poll();
        System.out.println("Elemento eliminado: " + elementoEliminado);

        //Mostrar elementos de la cola
        System.out.println(queue);
    }
}
