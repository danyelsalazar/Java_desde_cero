package gestion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestionACME {

    public Map <Integer, List<Empleado>>leerArchivoDePersonal(String entrada) throws IOException{

        Map <Integer, List<Empleado>> mapa = new HashMap<>();

        FileReader fr = new FileReader(new File(entrada));
        BufferedReader br = new BufferedReader(fr);
        
        String linea = br.readLine();

        List<Empleado> le;

        while(linea != null){

            String datos[] =linea.split(",");
            try{

                int sector = Integer.parseInt(datos[0]);
                if(sector < 100 || sector > 300){
                    throw new SectorIncorrectoExeption();
                }
                int legajo = Integer.parseInt(datos[1]);
                String apeNomb = datos[2];
                int antiguedad = Integer.parseInt(datos[3]);
                //creo el empleado
                Empleado e = new Empleado(sector, legajo, apeNomb, antiguedad);
    
                //guardo el empleado en el mapa
                /* forma basica:
                if(mapa.containsKey(e)){
                    le = mapa.get(sector);
                }else{
                    le = new ArrayList<>();
                }
                le.add(e);
                */
                //lo mismo de arriba pero usando getOrdeFault:
    
                le = mapa.getOrDefault(sector, new ArrayList<Empleado>());//si el sector esta devuelveme la lista que seria sector, y si no esta crea una nueva lista
                //agregamos el empleados
                le.add(e);
                //actualizamos o agregamos al mapa
                mapa.put(sector, le);

            }catch(NumberFormatException nfe){
                System.err.println("Uno de los datos no es numerico");
            }catch(SectorIncorrectoExeption ex){
                System.err.print("Sector incorrecto, fuera de rango");
            }
            finally{ 
                //leemos la sigiente linea:
                linea = br.readLine();
            }
        }

        fr.close();

        return mapa;

    }

    //funcion del metodo: que genere el archivo “empleadosDelSectorXXX.csv” (XXX representa el sector pedido).

    public void listarEmpleadosDelSector(int sector, Map<Integer,List<Empleado>> empleados) throws IOException{

        String salida = "EmpleadosDelSector" + sector + ".csv";
        PrintWriter pr = new PrintWriter(new FileWriter(salida));

        pr.println("Sector " +  sector + " :");

        List<Empleado> listEmp = new ArrayList<>(); //creamos la lista y inicializa vacia

        if(empleados.containsKey(sector)){ //si temos ese sector en el mapa entramos a este bloque
            listEmp = empleados.get(sector);// inicialñizamos la lista con la que contiene ese sector
            //recorremos la lista y escribimos:
            for (Empleado empleado : listEmp) {
                pr.println(empleado);//escribimos en el archivo
            }		

        }else{
            pr.println("      SECTOR VACIO");
        }

        pr.close();

    }

}
