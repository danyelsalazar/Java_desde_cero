import static org.junit.Assert.assertThrows;

import org.junit.Assert;
import org.junit.Test;

public class ponyEspressTest {

    @Test
    public void probarTresCaballos() {

        Assert.assertEquals(3, new PonySpress(new int[] { 33, 8, 16, 47, 30, 30, 46 }).caballos());
    }

    @Test
    public void probarUnCaballos() {
        Assert.assertEquals(1, new PonySpress(new int[] { 18, 15 }).caballos());
    }

    @Test
    public void probarDosCaballos() {
        Assert.assertEquals(2, new PonySpress(new int[] { 43, 23, 40, 13 }).caballos());
    }

    @Test
    public void probarCuatroCaballos() {
        Assert.assertEquals(4,
                new PonySpress(new int[] { 6, 24, 6, 8, 28, 23, 47, 17, 29, 37, 18, 40, 49 }).caballos());
    }

    @Test
    public void probarInvalidaCaballos() {
        Assert.assertEquals(3, new PonySpress(new int[] { 51, 51, 51 }).caballos());
    }

    // para hacer text de tipo errores hacemos lo siguiente
    @Test
    public void probarDistanciaInvalida() {
        assertThrows(Error.class, () -> new PonySpress(new int[] { 23, 23, 180, 23, 32 }).caballos());
    }
}
