import contador.ContadorAscendente;
import contador.ContadorDescendente;
import interfaces.Contable;

void main() {
    Contable[] contadores = new Contable[2];
    contadores[0] = new ContadorAscendente(10);
    contadores[1] = new ContadorDescendente(10);

    for (Contable contador : contadores) {
        System.out.println("Tipo: " + contador.getClass().getSimpleName());
        System.out.println("Valor inicial: "+ contador.getValor());

        contador.cambiar();
        contador.cambiar();
        contador.cambiar();

        System.out.println("Valor final: "+ contador.getValor());

    }
}