package bliblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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

    /*
     * se puede consultar cuantos libros hay de determinado autor
     */

    public int cantLibrosPorAutor(String autor) {
        int contador = 0;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                contador++;
            }
        }
        return contador;
    }

    /*
     * devolver una lista con los libros de un autor que pasamos por parametro
     */
    public List<Libro> listaLibrosAutor(String autor) {
        List<Libro> aux = new LinkedList<>();

        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                aux.add(libro);
            }
        }
        return aux;
    }

    public void ordenarLibros() {
        Collections.sort(this.libros);
    }

    /*
     * informar cuantos libros hay por genero literario
     */
    public Map<Genero, Integer> cuantosLibrosPorGeneroLiterio() {
        Map<Genero, Integer> mapita = new HashMap<Genero, Integer>();

        for (Libro libro : libros) {

            Genero clave = libro.getGenero();
            int valor;

            if (mapita.containsKey(clave)) {
                // si contiene la clave hay que actualizar
                valor = mapita.get(clave) + 1; // asi obtengo el valor de la clave y le incremento uno
            } else {
                valor = 1;
                // nueva entrada
            }
            // hacer put actualizado
            mapita.put(clave, valor);
        }
        return mapita;

    }

    /*
     * devuelve un mapa con los libros que tengo de cada genero
     */
    public Map<Genero, List<Libro>> mostrarlibrosPorGenero() {

        Map<Genero, List<Libro>> mapita = new TreeMap<>();
        // recorremos la lista de libros
        for (Libro libro : libros) {

            Genero genero = libro.getGenero(); // guardamos el valor de la clave
            List<Libro> listaDeLibros;// declaramos una lista de libros

            // verificamos si el mapa contiene como clave el genero
            if (mapita.containsKey(genero)) {
                listaDeLibros = mapita.get(genero);// le asignamos el contenido a la listadeLibros que sera la lista del
                                                   // mapa
            } else {
                listaDeLibros = new ArrayList<Libro>();// si no estaba el genero creo una nueva lista
            }

            listaDeLibros.add(libro);// agrego el libro que se esta iterando a la lista
            mapita.put(genero, listaDeLibros);// piso sobreescribo la lista que estaba en el mapa
        }
        return mapita;
    }

    /*
     * recorremos un mapa y lo mostramos en un string bien organizado
     */
    public String mostrarlibrosPorGeneroLiterario(Map<Genero, List<Libro>> m) {

        String s = "";
        List<Libro> lista;

        for (Map.Entry<Genero, List<Libro>> cadaFila : m.entrySet()) {

            Genero genero = cadaFila.getKey();
            s += genero;
            s += "\n";
            lista = cadaFila.getValue();

            for (Libro libro : lista) {
                s += libro.toString() + "\n";
            }

        }
        return s;
    }
}
