import java.util.ArrayList;
import java.util.Collection;

import animal.Animal;
import centroVeterinario.Veterinario;
import mascotas.Gato;
import mascotas.Perro;

public class App {
    public static void main(String[] args) throws Exception {

        //creamos la coleccion de animales
        Collection<Animal> animales = new ArrayList<>();
        //creamos aniamles

        Perro p1 = new Perro("Maximo", 3);
        Perro p2 = new Perro("Chiqui", 8);

        Gato g1 = new Gato("Rancio", 1);
        Gato g2 = new Gato("Misu", 4);

        animales.add(p1);
        animales.add(p2);
        animales.add(g1);
        animales.add(g2);

        //creamos un veterinario

        Veterinario v = new Veterinario("Marcela Rodriguez", 12, "Analista Clinico");

        //recorremos la coleccion 
        for(Animal mascota: animales){

            System.out.println(v.atenderAnimal(mascota));
        }
        
        
    }
}
