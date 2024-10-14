package com.entities;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CuentaCompartida {

    private Map<Integer,ArrayList<Consumo>> cuenta;
    private double cubierto;
    private int cantComensales;

    public CuentaCompartida(double cubierto, int cantComensales){
        cuenta = new HashMap<>();
        this.cubierto = cubierto;
        this.cantComensales = cantComensales;
    }


    /*
     * verificamos si existe el comensal , si existe agregamos el consumo al mismo
     * si no existe creamos un nuevo comensal con el numero recibido
     */
    public void agregarConsumoALaCuenta(Integer comensal, Consumo consumo){

        ArrayList<Consumo> lista;
         
       //primero tengo que verificar si ya esta el comensal y si esta le agrego el consumo
       if(cuenta.containsKey(comensal)){
            lista = cuenta.get(comensal);
        }

        else{

            if(! (comensal > 0 && comensal <= this.cantComensales)) throw new Error("El numero de comensal No es valido");

            lista = new ArrayList<>();
        }

        lista.add(consumo);
        this.cuenta.put(comensal,lista);
    }

    public void agregarConsumoALaCuenta(Integer comensal, String descripcion, double precio){

        this.agregarConsumoALaCuenta(comensal, new Consumo(descripcion, precio));
    }

    /*
     * Consultar consumo de algun comensal pasado por parametros
     */

    public void mostrarConsumoComensal(Integer comensal){

        if(!cuenta.containsKey(comensal)){
            throw new Error("Comensal no existe");
        }else{
            for (Consumo c: cuenta.get(comensal)) {
                System.out.println(c);
            }
        }
    }

    /*
     * Consultar consumo de todos los comensales
     */

    public void mostrarConsumoComensales(){
        for (Map.Entry<Integer, ArrayList<Consumo>> entrada : cuenta.entrySet()) {
            for (Consumo c : entrada.getValue()) {
                System.out.println("Comensal" + entrada.getKey());
                System.out.println(c + "\n");
            }
        }
    }

    /*
     * informa lo que paga cada comensal
     */
    public void mostrarImporteDeCadaComensal(){

        double importe;

        for (Map.Entry<Integer, ArrayList<Consumo>> entrada : cuenta.entrySet()) {
            importe = 0;
            for (Consumo c : entrada.getValue()) {
               importe += c.getPrecio();
            }
            importe += this.cubierto;
            System.out.println("Comensal " +  entrada.getKey() + " paga " + importe + " incluye el cubirto\n");
        }

    }


    /*
     * mostra cual fue el comensal que consumio mas
     */
    public void consumoMaximo(){

        double comsMax = 0;
        double importe;
        int bandera = 0;
        int comensal = 0;

        
        for (Map.Entry<Integer, ArrayList<Consumo>> entrada : cuenta.entrySet()) {

            importe = 0;

            for (Consumo c : entrada.getValue()) {
               importe += c.getPrecio();
            }

            if (bandera == 0){
                comsMax = importe;
                comensal = entrada.getKey();
                bandera = 1;
            }else{
                if(importe > comsMax){
                    comsMax = importe;
                    comensal = entrada.getKey();
                }
            }
            
        }
        comsMax += this.cubierto;
        System.out.println("El comensal que pago mas es el : " + comensal +  " Y pago: " + comsMax + " $");

    }
}
