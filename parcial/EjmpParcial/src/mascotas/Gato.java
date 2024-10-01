package mascotas;

import animal.Animal;

public class Gato extends Animal{

    public Gato(String nombre, int edad){
        super(nombre,edad);
    }

    //sobreescribimos el metodo
    @Override
    public String hacerSonido() {
        return "Miauuuu me llamo " +  this.getNombre();
    }

}
