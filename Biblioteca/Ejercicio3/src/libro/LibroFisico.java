package libro;

public class LibroFisico extends LibroPoli{
    private int ejemplaresTotales;
    private int ejempalresPrestados;

    public LibroFisico(String titulo, String autor){
        super(titulo,autor);
        this.ejemplaresTotales = 10;
        this.ejempalresPrestados = 0;
    }
    public LibroFisico(String titulo, String autor, int ejemplaresTotales, int ejempalresPrestados){
        super(titulo,autor);
        this.ejemplaresTotales = ejemplaresTotales;
        this.ejempalresPrestados = ejempalresPrestados;
    }
    public LibroFisico(LibroFisico libroFisico){
        super(libroFisico);
        this.ejemplaresTotales = libroFisico.ejemplaresTotales;
        this.ejempalresPrestados = libroFisico.ejempalresPrestados;
    }

    @Override
    public boolean prestar() {
        if (ejempalresPrestados < ejemplaresTotales) {
            ejempalresPrestados++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean devolver() {
        if (ejempalresPrestados > 0){
            ejempalresPrestados--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "[Fisico] Disponible: " + (ejemplaresTotales - ejempalresPrestados) + "\n";
    }
}
