import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import ExeccionesMias.CantidadInvalidaException;
import ExeccionesMias.CodigoInvalidoException;

public class Ventas {
    private Map<String, Integer> ventasPorProducto;

    public Ventas(){
        this.ventasPorProducto = new HashMap<String, Integer>();
    }

    public void leerVentas(String entrada) {
        try(
            FileReader fr = new FileReader(new File(entrada));
            BufferedReader br = new BufferedReader(fr);
        ){

            String linea;
            linea = br.readLine();
            Integer auxCantidad = 0;
            while (linea != null) {
                try{

                    String[] datos = linea.split(" ");
    
                    if(datos[0].length() != 6){
                        throw new CodigoInvalidoException();
                    }else if(Integer.parseInt(datos[1]) > 1000){
                        throw new CantidadInvalidaException();
                    }
    
                    auxCantidad = this.ventasPorProducto.get(datos[0]);
    
                    if(this.ventasPorProducto.containsKey(datos[0])){
                        this.ventasPorProducto.put(datos[0], auxCantidad + Integer.parseInt(datos[1]));
                    }else{
                        this.ventasPorProducto.put(datos[0], Integer.parseInt(datos[1]));
                    }
    
                }catch(CodigoInvalidoException e){
                    System.out.println(e);
                }catch(CantidadInvalidaException e){
                    System.out.println(e);
                }finally{
                    linea = br.readLine();
                }
            }

        }catch(IOException e){
            System.out.println("No se encontro el archivo");
        }
    }

    public void escribirVentasPorProducto(String nombre) {
        try{

            PrintWriter salida = new PrintWriter(new FileWriter(nombre));
            salida.println("Ventas del mes: ");

            for(Map.Entry<String,Integer> datos: this.ventasPorProducto.entrySet()){
                String codigo = datos.getKey();
                Integer cantidad = datos.getValue();

                salida.println(codigo + " " + cantidad);
            }

            salida.close();

        }catch(IOException e){
            System.err.println(e);
        }
    }


    public Map<String, Integer> getVentasPorProducto() {
        return ventasPorProducto;
    }


}
