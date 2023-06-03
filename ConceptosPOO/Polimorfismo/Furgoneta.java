package ConceptosPOO.Polimorfismo;

public class Furgoneta extends Vehiculo{
    public Furgoneta(String matricula, String modelo, String marca, int carga) {
        super(matricula, modelo, marca);
        this.carga = carga;
    }

    private int carga;

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
}
