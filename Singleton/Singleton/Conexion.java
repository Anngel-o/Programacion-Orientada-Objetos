package Patrones.Singleton;

public class Conexion {
    //Poseer una única instancia de una clase en particular
    //Implementación del patrón singleton, se usa en conexiones a bases de datos para que la conexion no sea variable
    private Conexion() {

    }

    private static Conexion instancia = null;

    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    public static void setInstancia(Conexion instancia) {
        Conexion.instancia = instancia;
    }
}
