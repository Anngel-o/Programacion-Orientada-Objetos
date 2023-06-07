package Patrones.Singleton;

import java.util.ArrayList;
import java.util.List;

public class PaisDAOImpl {
    private PaisDAOImpl() {
        
    }
    public static PaisDAOImpl instancia = null;
    public static PaisDAOImpl getInstancia() {
        if (instancia == null){
            instancia = new PaisDAOImpl();
        }
        return instancia;
    }

    private List paises = null;

    public List getPaises() {
        if (paises == null){
            paises = new ArrayList();
            Pais mexico = new Pais("México");
            Pais peru = new Pais("Peru");
            Pais brasil = new Pais("Brasil");
            
            paises.add(mexico);
            paises.add(peru);
            paises.add(brasil);
        }
        return paises;
    }

    public void setPaises(List paises) {
        this.paises = paises;
    }
}
