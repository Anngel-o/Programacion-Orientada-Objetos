package Sobreescritura;

public class Persona extends Animal{

    @Override
    public void comer() {
        System.out.println("Estoy comiendo sentado y con cubiertos");
    }
    
}
