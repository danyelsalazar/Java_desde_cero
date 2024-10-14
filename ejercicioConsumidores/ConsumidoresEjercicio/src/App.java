import com.entities.CuentaCompartida;

public class App {
    public static void main(String[] args) throws Exception {

        CuentaCompartida cumplePepe = new CuentaCompartida(1000, 5);

        cumplePepe.agregarConsumoALaCuenta(1, "Coca", 1500);
        cumplePepe.agregarConsumoALaCuenta(1, "Pancho", 2500);
        cumplePepe.agregarConsumoALaCuenta(3, "Jugo", 1600);
        cumplePepe.agregarConsumoALaCuenta(4, "Coca", 1800);
        cumplePepe.agregarConsumoALaCuenta(4, "Empanada", 1300);


        /* 
        cumplePepe.mostrarConsumoComensal(1);
        cumplePepe.mostrarConsumoComensal(4);
        cumplePepe.mostrarConsumoComensal(30);
        */

        cumplePepe.mostrarConsumoComensales();
        cumplePepe.mostrarImporteDeCadaComensal();
        cumplePepe.consumoMaximo();

    }
}
