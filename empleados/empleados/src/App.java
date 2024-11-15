import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import gestion.Empleado;
import gestion.GestionACME;

public class App {
    public static void main(String[] args) throws IOException {

        GestionACME ga = new GestionACME();
        Map<Integer, List<Empleado> > empPorSect = new TreeMap<>();
        empPorSect = ga.leerArchivoDePersonal("personal.csv");

        /* probando si hay datos enm el mapa
        for (Map.Entry<Integer, List<Empleado>> cadaSector : empPorSect.entrySet()) {
	        Integer sec = cadaSector.getKey();
	        List<Empleado> listEmp = cadaSector.getValue();	
            System.out.println("Sector: " + sec);
            System.out.println(listEmp);
        }
        */
        ga.listarEmpleadosDelSector(140, empPorSect);

    }
}
