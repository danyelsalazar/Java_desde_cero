package bliblioteca;

public class Libro {

    private String titulo;
    private String autor;
    private Genero genero;
    private int cantPaginas;

    public Libro(String titulo, String autor, Genero genero, int cantPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.cantPaginas = cantPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

}
