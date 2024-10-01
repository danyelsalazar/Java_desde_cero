package animal;

public abstract class Animal {

    private String nombre;
    private int edad;

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //metodo abstracto hacersonido
    public abstract String hacerSonido();

    //hacemos los getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    
}
