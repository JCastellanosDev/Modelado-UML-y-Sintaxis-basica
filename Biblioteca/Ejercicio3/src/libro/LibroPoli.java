package libro;

public abstract class LibroPoli {
    protected String titulo;
    protected String autor;

    public LibroPoli() {
        this.titulo = "Blancos VS Negros";
        this.autor = "Jesus Castellanos";

    }
    public LibroPoli(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    public LibroPoli(LibroPoli libroPoli) {
        this.titulo = libroPoli.titulo;
        this.autor = libroPoli.autor;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract boolean prestar();
    public abstract boolean devolver();

    @Override
    public String toString() {
        return "LibroPoli{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
