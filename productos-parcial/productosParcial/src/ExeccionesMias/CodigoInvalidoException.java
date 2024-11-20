package ExeccionesMias;

public class CodigoInvalidoException extends Exception {

    public CodigoInvalidoException(){
        super("Codigo del producto invalido");
    }
}
