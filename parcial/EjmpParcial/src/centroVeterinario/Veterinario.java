package centroVeterinario;

import animal.Animal;
import mascotas.Gato;
import mascotas.Perro;

public class Veterinario {

    private String nombre;
    private int experiencia;
    private String especialidad;

    public Veterinario(String nombre, int experiencia, String especialidad){
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.especialidad = especialidad;
    }

    //creamos un metodo para atender animales
    /*
     * recibe un animal y de forma polimorfica llama a su metodo hacer sonido
     */

    public String atenderAnimal(Animal animal){

       return animal.hacerSonido();

    }

    //creamosa sus getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    

}
