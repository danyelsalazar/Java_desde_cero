public class App {
    public static void main(String[] args) throws Exception {
        //hacemos el arreglo con distancias
        int[] distancias = { 33, 8, 16, 47, 30, 30, 46 };
        int caballosUsados = caballos(distancias);
        System.out.println("Total de caballos usados: " + caballosUsados);
    }

    /**
    * Calcula la cantidad de caballos necesarios para enviar el correo
    * sin que ningún caballo recorra más de 100 millas.
    * 
    * @param distancias es la distancia en millas de una estación hasta la otra
    * @returns la cantidad de caballos necesarios para enviar el correo
    */

    public static int caballos(int[] distancias) {
        int cantCaballos = 1; // Siempre necesitamos al menos 1 caballo
        int acumuDist = 0; // con este acumularemos las distancias

        for (int index = 0; index < distancias.length-1; index++) {

            int distancia = distancias[index]; // guardamos el valor de la distancia para empezar a operar

            // verificamos si dos distancias consecutivas son mayor a 100 
            if (distancia + distancias[index+1] > 100) {
                throw new IllegalArgumentException("distancia no valida");
            }

            // si al sumar esta distancia acumulada sobrepasamos 100, necesitamos otro caballo
            if (acumuDist + distancia > 100) {
                cantCaballos++;
                acumuDist = distancia; // reiniciamos la acumulación para el nuevo caballo
            } else {
                acumuDist += distancia; // Sumamos la distancia al caballo actual si todavia podemos cubrir otra distancia
            }

            System.out.println("\nacumulado: " + acumuDist + " millas, caballos: " + cantCaballos);
        }

        return cantCaballos;
    }
}
