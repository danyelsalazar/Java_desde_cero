package ejercCirculos;

public class Circulo {

    private Punto punto;
    private double radio;

    //creamos un constructor
    public Circulo(double x, double y, double radio){
        this.punto = new Punto(x,y);
        this.radio = radio;
    }

    //creamos el metodo para saber si se intersectan

    public boolean seIntersectan(Circulo c2){
        /*
        *si la distancia entre ambos puntos es menor que la suma de los radios de los dos
        *circulos significa que se intersectan
        */
        return Math.sqrt(Math.pow(this.punto.getX() - c2.punto.getX() , 2) + Math.pow(this.punto.getY() - c2.punto.getY() , 2)) <= this.radio + c2.radio;
    }

    //creamos los getters y setters
    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    

}
