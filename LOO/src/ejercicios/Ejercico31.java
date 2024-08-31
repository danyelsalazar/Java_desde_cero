package ejercicios;

/*Escribir una función que reciba un arreglo de enteros y devuelva la suma de los
 elementos que se encuentran en posiciones pares (incluido el elemento de la posición 0).
 Por ejemplo: Dado el arreglo [1, 2, 13 ,4, 8, 6] => devuelve 22 (1+13+8) */

public class Ejercico31 {

    public static void main(String[] args){

        int[] enteros = {12,2,5,7,24,6,10};
        int[] b = new int[10];

        for (int i = 0; i < b.length; i++) {
            b[i] = i;
        }

        elementosEnPosPares(enteros);
        elementosEnPosImpares(enteros);

    }

    static void elementosEnPosPares(int[] enteros){
        int suma = 0;

        for(int i = 0; i < enteros.length; i+=2){ //con el i+= 2 asi itero las posiciones pares sin poner if
            suma += enteros[i];
            System.out.println(enteros[i]);
        }
        System.out.println("La sumatoria de posiciones pares es: " + suma);
    }

    static void elementosEnPosImpares(int[] enteros){
        int suma = 0;

        for(int i = 1; i < enteros.length; i+=2){ //con el i+= 2 asi itero las posiciones pares sin poner if
            suma += enteros[i];
            System.out.println(enteros[i]);
        }
        System.out.println("La sumatoria de posiciones impares es: " + suma);
    }
}
