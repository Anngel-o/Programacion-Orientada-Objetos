package AreaPoligonos;

public abstract class Poligono {
    public Poligono(int numLados) {
        this.numLados = numLados;
    }

    int numLados;

    public abstract double area();

    @Override
    public String toString() {
        return "Poligono [numLados=" + numLados + "]";
    }
}
