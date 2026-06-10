package contador;

import interfaces.Contable;

public class ContadorDescendente implements Contable {
    private int contador;

    public ContadorDescendente(){
        this.contador = 0;
    }
    public ContadorDescendente(int contador){
        this.contador = contador;
    }
    public ContadorDescendente(ContadorDescendente contador){
        this.contador = contador.contador;
    }

    @Override
    public void cambiar() {
        if (this.contador > 0) this.contador--;

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
    public String
    toString() {
        return "ContadorDescendente{" +
                "contador=" + contador +
                '}';
    }
}
