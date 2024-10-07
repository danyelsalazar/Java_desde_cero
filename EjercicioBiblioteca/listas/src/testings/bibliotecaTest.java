package testings;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import bliblioteca.Biblioteca;
import bliblioteca.Genero;
import bliblioteca.Libro;

public class bibliotecaTest {

    @Test
    public void cuantoslibrosTest() {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro("Blanca nieves", "Disney", Genero.AVENTURA, 120);
        biblioteca.agregarLibro("Crepusculo", "Mayer", Genero.NOVELA, 769);

        assertEquals(2, biblioteca.cantidadLibros());
    }

    @Test
    public void libroEnLaPosicionTest() {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro("Blanca nieves", "Disney", Genero.AVENTURA, 120);
        biblioteca.agregarLibro("Crepusculo", "Mayer", Genero.NOVELA, 769);

        String esperado = "Crepusculo";
        String obtenido = biblioteca.libroEnLaPisicion(2);

        assertEquals(esperado, obtenido);
    }

    @Test
    public void libroEnLaUltimaPosiscionTest() {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro("Blanca nieves", "Disney", Genero.AVENTURA, 120);
        biblioteca.agregarLibro("Crepusculo", "Mayer", Genero.NOVELA, 769);
        biblioteca.agregarLibro("Las maravillas", "Juan Domingo", Genero.HISTORIA, 500);

        String esperado = "Las maravillas";
        String obtenido = biblioteca.libroEnLaUltimaPosicion();

        assertEquals(esperado, obtenido);
    }

    @Test
    public void libroConMasPaginasTest() {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro("Blanca nieves", "Disney", Genero.AVENTURA, 120);
        biblioteca.agregarLibro("Crepusculo", "Mayer", Genero.NOVELA, 769);
        biblioteca.agregarLibro("Las maravillas", "Juan Domingo", Genero.HISTORIA, 500);

        Libro esperado = new Libro("Crepusculo", "Mayer", Genero.NOVELA, 769);
        assertEquals(esperado, biblioteca.libroConMasPaginas());

    }

    @Test
    public void cantidadLibrosAutorTest() {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro("Blanca nieves", "Disney", Genero.AVENTURA, 120);
        biblioteca.agregarLibro("Crepusculo", "Mayer", Genero.NOVELA, 769);
        biblioteca.agregarLibro("Las maravillas", "Juan Domingo", Genero.HISTORIA, 500);
        biblioteca.agregarLibro("Crepusculo - Nueva Luna", "Mayer", Genero.NOVELA, 589);

        assertEquals(2, biblioteca.cantLibrosPorAutor("Mayer"));
    }

    @Test
    public void listaLibrosAutorTest() {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro("Blanca nieves", "Disney", Genero.AVENTURA, 120);
        biblioteca.agregarLibro("Crepusculo", "Mayer", Genero.NOVELA, 769);
        biblioteca.agregarLibro("Las maravillas", "Juan Domingo", Genero.HISTORIA, 500);
        biblioteca.agregarLibro("Crepusculo - Nueva Luna", "Mayer", Genero.NOVELA, 589);

        List<Libro> librosEsperados = new LinkedList<>();
        librosEsperados.add(new Libro("Crepusculo", "Mayer", Genero.NOVELA, 769));
        librosEsperados.add(new Libro("Crepusculo - Nueva Luna", "Mayer", Genero.NOVELA, 589));

        assertEquals(librosEsperados, biblioteca.listaLibrosAutor("Mayer"));

    }

}
