package mascotas;

import animal.Animal;

public class Perro extends Animal{

    public Perro(String nombre, int edad){
        super(nombre, edad);
    }

    //sobreescribimos el metodo
    @Override
    public String hacerSonido() {
        return "Guauu me llamo " + this.getNombre();
    }



}
