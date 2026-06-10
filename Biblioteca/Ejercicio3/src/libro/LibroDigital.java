package libro;

public class LibroDigital  extends LibroPoli{
    private int usuariosActivos;
    private static final int LIMITE_SIMULTANEOS = 3;

    public LibroDigital(String titulo, String autor) {
        super(titulo, autor);
        this.usuariosActivos = 0;
    }
    public LibroDigital(String titulo, String autor, int usuariosActivos) {
        super(titulo, autor);
        this.usuariosActivos = usuariosActivos;
    }
    public LibroDigital(LibroDigital libro){
        super(libro);
        this.usuariosActivos = libro.usuariosActivos;

    }

    @Override
    public boolean prestar() {
        if (usuariosActivos < LIMITE_SIMULTANEOS) {
            usuariosActivos++;
            return true;
        } else {
            return false;
        }
    }
    @Override
    public boolean devolver() {
        if (usuariosActivos > 0) {
            usuariosActivos--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "[Digital] Accesos activos: "+ usuariosActivos+"/"+LIMITE_SIMULTANEOS;
    }
}
