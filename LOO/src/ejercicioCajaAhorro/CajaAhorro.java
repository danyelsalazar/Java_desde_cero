package ejercicioCajaAhorro;

public class CajaAhorro {

    private String titular;
    private double saldo;
    

    /**
     * post: la instancia queda asignada al titular indicado y con saldo igual a 0.
     */
    public CajaAhorro(String titularDeLaCuenta){ 
        this.titular = titularDeLaCuenta;
        this.saldo = 0;
    }
    
    /**
     * post: devuelve el nombre del titular de la Caja de Ahorro.
     */
    public String obtenerTitular() { 
        return this.titular;
    }

    /**
     * post: devuelve el saldo de la Caja de Ahorro.
     */
    public double consultarSaldo() { 
        return this.saldo;
    }

    /**
     * pre : monto es un valor mayor a 0.
     * post: aumenta el saldo de la Caja de Ahorro según el monto depositado.  
     */
    public void depositar(double monto) { 
        try{
            if(monto <= 0){
                throw new Error("El monto ingresado es menor o igual a 0");
            }
            this.saldo += monto;
        }catch(Exception e){
            e.printStackTrace();
        }
    }
 
    /**
     * pre : monto es mayor a 0 y menor o igual que el saldo de la Caja de Ahorro.
     * post: disminuye el saldo de la Caja de Ahorro según el monto extraído.
     */
    public void extraer(double monto) { 
        try{
            if(monto <= 0){
                throw new Error("monto incorrecto");
            }
            if(haySaldoSuficiente(monto)){
                this.saldo -= monto;
            }else{
                throw new Error("No hay saldo suficiente");
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    /**
     * pre: hay saldo suficiente para hacer la transferencia
     * prost: la cuneta origen resta monto de su saldo y la cuenta destino
     * suma el monto a su saldo
     * @param destino: cajaAhorro que recibe la transferencia
     * @param monto: monto de transferencia
     */
    public void tranferir(CajaAhorro destino, double monto){
        this.extraer(monto);
        destino.depositar(monto);
    }


    /**
     * 
     * @param monto
     * @return true si hay saldo suficiente
     */

    private boolean haySaldoSuficiente(double monto){
        return this.saldo >= monto;
    }

}
