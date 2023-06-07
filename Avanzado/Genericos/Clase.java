package Avanzado.Genericos;

public class Clase <T, K, E> {
    //Una clase génerica puede tener N cantidad de estereotipos
    private T objetoT;
    private K objetoK;
    private E objetoE;

    public Clase(T objeto, K objetoK, E objetoE) {
        this.objetoT = objeto;
        this.objetoK = objetoK;
        this.objetoE = objetoE;
    }

    public void mostrarTipo(){
        System.out.println("T es un objeto " + objetoT.getClass().getName());
        System.out.println("K es un objeto " + objetoK.getClass().getName());
        System.out.println("E es un objeto " + objetoE.getClass().getName());
    }

    public T getObjetoT() {
        return objetoT;
    }

    public void setObjetoT(T objetoT) {
        this.objetoT = objetoT;
    }

    public K getObjetoK() {
        return objetoK;
    }

    public void setObjetoK(K objetoK) {
        this.objetoK = objetoK;
    }

    public E getObjetoE() {
        return objetoE;
    }

    public void setObjetoE(E objetoE) {
        this.objetoE = objetoE;
    }
}
