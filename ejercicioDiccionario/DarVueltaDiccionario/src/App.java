import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import entrenadores.Entrenadores;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> entrenadosPorBielsa = new LinkedList<>();
        entrenadosPorBielsa.add("Juan");
        entrenadosPorBielsa.add("Alberto");
        entrenadosPorBielsa.add("Vero");
        entrenadosPorBielsa.add("Tucu");


        List<String> entrenadosPorAlvarez = new LinkedList<>();
        entrenadosPorAlvarez.add("Tom");
        entrenadosPorAlvarez.add("Alberto");
        entrenadosPorAlvarez.add("Vero");

        Map<String, List<String>> dicc = new TreeMap<>();
        
        dicc.put("Bielsa", entrenadosPorBielsa);
        dicc.put("Alvarez", entrenadosPorAlvarez);

        Entrenadores e = new Entrenadores();

        System.out.println(e.entrenadosPor(dicc));


    }
}
