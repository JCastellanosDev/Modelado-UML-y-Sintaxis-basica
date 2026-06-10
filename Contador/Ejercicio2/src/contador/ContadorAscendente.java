package contador;

import interfaces.Contable;

public class ContadorAscendente implements Contable {
    private int contador ;

    public ContadorAscendente(){
        this.contador = 0;
    }
    public ContadorAscendente(int contador){
        this.contador = contador < 0 ? 0 : contador;
    }
    public ContadorAscendente(ContadorAscendente contador){
        this.contador = contador.contador;
    }

    @Override
    public void cambiar() {
        this.contador++;
    }

    @Override
    public int getValor() {
        return contador;
    }

    @Override
    public void setValor(int valor) {
        this.contador = valor < 0 ? 0 : valor;
    }

    @Override
    public String toString() {
        return "ContadorAscendente{" +
                "contador=" + contador +
                '}';
    }
}
