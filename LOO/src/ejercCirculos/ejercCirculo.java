package ejercCirculos;

public class ejercCirculo {
    public static void main(String[] args) throws Exception{
        Circulo c1 = new Circulo(0, 0, 1);
        Circulo c2 = new Circulo(1, 1, 1.5);
        System.out.println(c1.seIntersectan(c2));
    }
}
