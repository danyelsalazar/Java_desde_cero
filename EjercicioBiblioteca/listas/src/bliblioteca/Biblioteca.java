package bliblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    /*
     * Retorna la cantidad de libros que tiene el arreglo de libros
     */
    public int cantidadLibros() {
        return libros.size();
    }

    /*
     * metodo para agregar libros a nuestra lista
     */
    public void agregarLibro(String titulo, String autor, Genero genero, int cantPaginas) {

        Libro libro = new Libro(titulo, autor, genero, cantPaginas);
        // agrego el libro a la lista
        libros.add(libro);

    }

    /*
     * retona el titulo del libro
     */
    public String libroEnLaPisicion(int posicion) {

        if (posicion < 1 || posicion > libros.size()) {
            throw new Error("No se encontro el libro, POSICION FUERA DE RANGO");
        }
        return libros.get(posicion - 1).getTitulo();
    }

    /*
     * retorna el titulo del ultimo libro de la lista
     */
    public String libroEnLaUltimaPosicion() {
        return this.libroEnLaPisicion(libros.size());
    }

    public Libro libroConMasPaginas() {

        Libro libroMax = libros.get(0);

        for (Libro libro : libros) {
            if (libro.getCantPaginas() > libroMax.getCantPaginas()) {
                libroMax = libro;
            }
        }

        return libroMax;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

}
