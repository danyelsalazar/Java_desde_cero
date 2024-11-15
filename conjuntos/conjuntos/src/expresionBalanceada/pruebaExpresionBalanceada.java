package expresionBalanceada;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class pruebaExpresionBalanceada {

    ExpresionBalanceada eb = new ExpresionBalanceada();

    @Test
    public void ejemploBalanceada(){
        String cadena = "[()]{}{[()()]()}";
        assertTrue(eb.estaBalanceada(cadena));
    }
}
