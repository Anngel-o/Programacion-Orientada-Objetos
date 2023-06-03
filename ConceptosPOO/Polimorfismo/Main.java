package ConceptosPOO.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculos[] = new Vehiculo[4];

        vehiculos[0] = new Vehiculo("12FD", "Ferrari", "A89");
        vehiculos[1] = new Camioneta("25FR", "Chevrolet", "A76", 2);
        vehiculos[2] = new Furgoneta("12FD", "Toyota", "A89", 2000);
        vehiculos[3] = new Deportivo("34YT", "Audi", "A45", 500);

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.toString());
        }
    }
}
