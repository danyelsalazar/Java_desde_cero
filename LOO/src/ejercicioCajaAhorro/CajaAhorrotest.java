/*package ejercicioCajaAhorro;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CajaAhorrotest {
    @Test
    public void consultarSaldoTest(){
        CajaAhorro c = new CajaAhorro("Leo");
        assertEquals("Leo",c.obtenerTitular());
    }

    @Test
    public void transferirTest(){
        CajaAhorro origen = new CajaAhorro("Danyel");
        CajaAhorro destino = new CajaAhorro("Julio");

        origen.depositar(10000.50);
        origen.tranferir(destino, 500);
        assertEquals(9500.50, origen.consultarSaldo(), 0.001);
        assertEquals(500, destino.consultarSaldo(),0.001);



    }

 
}*/
