package Patrones.Singleton;

public class App {
    public static void main(String[] args) {
        // PaisDAOImpl dao = new PaisDAOImpl();

        // for (Object obj : dao.getPaises()) {
        //     System.out.println(((Pais)obj).getNombre());
        // }
        // System.out.println();

        // for (Object obj : dao.getPaises()) {
        //     System.out.println(((Pais)obj).getNombre());
        // }
        //En el segundo ciclo no hace el recorrido de nuevo ya que el patrón hace que utilice los recursos anteriores del primer ciclo y no hacer uso extra de memoria en un proceso ya realizado

        //CON PATRÓN SINGLETON
        PaisDAOImpl dao = PaisDAOImpl.getInstancia();

        for (Object obj : dao.getPaises()) {
            System.out.println(((Pais)obj).getNombre());
        }
        System.out.println();

        for (Object obj : dao.getPaises()) {
            System.out.println(((Pais)obj).getNombre());
        }

        PaisDAOImpl dao2 = PaisDAOImpl.getInstancia();

        for (Object obj : dao2.getPaises()) {
            System.out.println(((Pais)obj).getNombre());
        }
    }
}
