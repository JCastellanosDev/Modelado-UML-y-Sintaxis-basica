package libro;

public class Libro {
   private String titulo;
   private String autor;
   private int ejemplares;
   private int prestados;

    public Libro() {
       this.titulo = "La obra de teatro";
       this.autor = "Axel Lares";
       this.ejemplares = 10;
       this.prestados = 0;
   }
    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }
    public Libro(Libro libro) {
       this.titulo = libro.titulo;
       this.autor = libro.autor;
       this.ejemplares = libro.ejemplares;
       this.prestados = libro.prestados;
    }

    public int getPrestados() {
        return prestados;
    }
    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public int getEjemplares() {
        return ejemplares;
    }
    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
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

    public boolean prestamo(){
        if (this.prestados < this.ejemplares){
            this.prestados ++;
            return true;
        }else {
            return false;
        }
    }

    public boolean devolucion() {
        if (this.prestados > 0){
            this.prestados --;
            return true;
        }else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "Libros{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ejemplares=" + ejemplares +
                ", prestados=" + prestados +
                '}';
    }
}

