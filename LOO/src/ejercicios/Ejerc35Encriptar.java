package ejercicios;
//Encriptar un mensaje usando el método de "la cifra del césar", que consiste en correr cada letra 
//-considerando la posición de cada una en el alfabeto- una determinada cantidad de lugares. 
//Ejemplo: si el corrimiento es de 2 lugares, la palabra "HOLA" se transforma en "JQNC". Si el alfabeto termina antes de poder
//correr la cantidad de lugares necesarios, se vuelve a comenzar desde la letra "a"

import java.util.Scanner;

public class Ejerc35Encriptar {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int i, j;
        // hacemos un arreglo de tipo char que contendra todas las letras del abecedario
        char[] abecedario = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                            'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        System.out.println("Ingresa una palabra para encriptarla\n");
        String palabra = scanner.nextLine(); // leemos la palabra
        scanner.close();//cerramos el scanner ya que no lo usaremois mas
        

        char[] letras = palabra.toCharArray();//hacemos un arreglo char de las letras de la palabra ingresada
        //System.out.println(letras[2]); probamos que devuelva bien las letras
        //usamos un for para recorrer el abecedario

        char[] palabraEncriptada = new char[letras.length]; //creamos un arreglo que va a contener las letras de la palbra encriptada
        
        //rrecorremos el arreglo del abecedario y cada letra del mismo la usaremos para comparar con la
        //palabra ingresada y poder hacer las acciones que necesitamos segun sea la letra:

        for(i = 0; i < abecedario.length; i++){//!!este recorrera letra por letra del abecedario

            for(j = 0; j < palabra.length(); j ++){//!!este recorrera letra por letra de la palabra

                if(i < abecedario.length - 2){ //aqui solo entrara cuando i sea menor o ifual a la antepenultima letra del abecedario
                    if(letras[j] == abecedario[i]){
                        palabraEncriptada[j] = abecedario[i+2];
                    }
                }
                else if( i == abecedario.length - 2){//aqui entrara solo cuando i sea la penultima letra del abecedario
                    if(letras[j] == abecedario[i]){
                        palabraEncriptada[j] = abecedario[(i+1)- (i+1)];
                    }
                }
                else{//aqui entrara cuando la i sea la ultima letra del abecedario 
                    if(letras[j] == abecedario[i]){
                        palabraEncriptada[j] = abecedario[(i-i) + 1];
                    }
                }
            }
        }

        //transformamos el arreglo de char que contiene la palabra encriptada separada en caracteres a un string
        //y a su vez lo transformamos a mayusculas asi: 
        String encriptada = new String(palabraEncriptada).toUpperCase();
        //finalizamos mostrando la palabra encriptada:
        System.out.println("--------------------------------\nPalabra encriptada: " + encriptada + "\n--------------------------------");

    }
}
