package ejercicios;
public class Arreglos {
    public static void main(String[] args) throws Exception{

        int[] numeros = {1,2,3,4,5,6,7,8,9,};

        //for each para arreglos

        //ponemos el tipo de datos de los elemento osea Integer, luego la varible que sera cada elemento,
        //ponemos dos puntos y el nombre del arreglo que vamos a iterar
        for(Integer cadaUno: numeros){
            System.out.println(cadaUno);
        }
    }
}
