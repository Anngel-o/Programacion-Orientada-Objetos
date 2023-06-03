package ConceptosPOO.Polimorfismo;

public class Deportivo extends Vehiculo{

    public Deportivo(String matricula, String modelo, String marca, int cilindrada) {
        super(matricula, modelo, marca);
        this.cilindrada = cilindrada;
    }
    
    private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Deportivo [matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + ", cilindrada=" + cilindrada + "]";
    }
}
