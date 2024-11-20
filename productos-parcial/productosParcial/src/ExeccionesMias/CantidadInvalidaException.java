package ExeccionesMias;

public class CantidadInvalidaException extends Exception {

    public CantidadInvalidaException(){
        super("La cantidad de productos es inválida");
    }
}
