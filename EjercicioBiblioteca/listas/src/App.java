import bliblioteca.Biblioteca;
import bliblioteca.Genero;

public class App {
    public static void main(String[] args) throws Exception {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro("Blanca nieves", "Disney", Genero.AVENTURA, 120);
        biblioteca.agregarLibro("Crepusculo", "Mayer", Genero.NOVELA, 769);
        biblioteca.agregarLibro("Las maravillas", "Juan Domingo", Genero.HISTORIA, 500);
        biblioteca.agregarLibro("Crepusculo - Nueva Luna", "Mayer", Genero.NOVELA, 589);

        // System.out.println(biblioteca.cuantosLibrosPorGeneroLiterio());
        // System.out.println(biblioteca.mostrarlibrosPorGenero());

        System.out.println(biblioteca.mostrarlibrosPorGeneroLiterario(biblioteca.mostrarlibrosPorGenero()));
    }
}
