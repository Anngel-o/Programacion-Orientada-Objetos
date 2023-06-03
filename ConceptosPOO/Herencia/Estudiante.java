package ConceptosPOO.Herencia;

public class Estudiante extends Persona{
    private int matricula;
    public Estudiante(String nombre, String apellido, int edad, int matricula) {
        super(nombre, apellido, edad);
        this.matricula = matricula;
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public String toString() {
        return "Estudiante [matricula=" + matricula + ", nombre=" + this.getNombre() + "]";
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
