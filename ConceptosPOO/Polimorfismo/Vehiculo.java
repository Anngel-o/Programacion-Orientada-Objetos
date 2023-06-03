package ConceptosPOO.Polimorfismo;

public class Vehiculo {
    public Vehiculo(String matricula, String modelo, String marca) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
    }

    protected String matricula;
    protected String modelo;
    protected String marca;
    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + "]";
    }
}
