package ConceptosPOO.Polimorfismo;

public class Camioneta extends Vehiculo{
    
    public Camioneta(String matricula, String modelo, String marca, int numPuertas) {
        super(matricula, modelo, marca);
        this.numPuertas = numPuertas;
    }

    private int numPuertas;

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Camioneta [matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + ", numPuertas=" + numPuertas + "]";
    }
}
