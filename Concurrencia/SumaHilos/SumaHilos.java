package Concurrencia.SumaHilos;

import ParametrosArgumentos.Main;

public class SumaHilos implements Runnable{
    private int num1, num2;    

    public SumaHilos(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        synchronized(Main.class) {
            System.out.println("La suma es: " + (num1 + num2));
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] sumas = new Thread[5];

        for (int i = 0; i < sumas.length; i++) {
            sumas[i] = new Thread(new SumaHilos(i+10, i+11));
        }

        for (int i = 0; i < sumas.length; i++) {
            sumas[i].start();
        }

        for (int i = 0; i < sumas.length; i++) {
            sumas[i].join();
        }

        System.out.println("Ejecución Finalizada");
    }
}
