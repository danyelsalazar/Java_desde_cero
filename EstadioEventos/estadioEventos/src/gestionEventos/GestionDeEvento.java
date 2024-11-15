package gestionEventos;

import java.util.Map;
import java.util.TreeMap;

public class GestionDeEvento {
    private Map<String, EspectadoresPorEvento> estadio;

    public GestionDeEvento(){
        this.estadio = new TreeMap<>(); 
    }

    
}
