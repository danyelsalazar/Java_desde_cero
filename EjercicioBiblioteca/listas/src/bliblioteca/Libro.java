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

    /*
     * agregamos los siguientes metos para poder hacer comparaciones de libros luego
     * en el test
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((autor == null) ? 0 : autor.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + cantPaginas;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Libro other = (Libro) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (autor == null) {
            if (other.autor != null)
                return false;
        } else if (!autor.equals(other.autor))
            return false;
        if (genero != other.genero)
            return false;
        if (cantPaginas != other.cantPaginas)
            return false;
        return true;
    }

}
