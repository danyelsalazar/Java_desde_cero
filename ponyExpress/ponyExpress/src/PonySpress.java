public class PonySpress {

    private int[] distancias;

    PonySpress(int[] distancias) {
        this.distancias = distancias;
    }

    /**
     * Calcula la cantidad de caballos necesarios para enviar el correo
     * sin que ningun caballo recorra más de 100 millas.
     * 
     * @param distancias es la distancia en millas de una estación hasta la otra
     * @returns la cantidad de caballos necesarios para enviar el correo
     */

    public int caballos() {

        int cantCaballos = 1; // Siempre necesitamos al menos 1 caballo
        int acumuDist = 0; // con este acumularemos las distancias

        for (int index = 0; index < distancias.length; index++) {

            int distancia = distancias[index]; // guardamos el valor de la distancia para empezar a operar

            // verificamos si dos distancias consecutivas son mayor a 100
            if (distancia > 100) {
                throw new Error("distancia no valida");
            }

            // si al sumar esta distancia acumulada sobrepasamos 100, necesitamos otro
            // caballo
            if (acumuDist + distancia > 100) {
                cantCaballos++;
                acumuDist = distancia; // reiniciamos la acumulación para el nuevo caballo
            } else {
                acumuDist += distancia; // Sumamos la distancia al caballo actual si todavia podemos cubrir otra
                                        // distancia
            }

            System.out.println("\nacumulado: " + acumuDist + " millas, caballos: " + cantCaballos);
        }

        return cantCaballos;
    }

}
