//import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        Ventas v = new Ventas();

        v.leerVentas("src\\ventas.in");
        
        v.escribirVentasPorProducto("ventasPorProducto.out");

        //Map<String, Integer> mapa = v.getVentasPorProducto();

        /* 
        for(Map.Entry<String,Integer> linea : mapa.entrySet()){
            String codigo = linea.getKey();
            Integer cantidad = linea.getValue();

            System.out.println(codigo + " " + cantidad);
        }
        */

    }
}
