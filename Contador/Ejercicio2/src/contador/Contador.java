package contador;

public class Contador {
    private int contador;
    public Contador(){
        contador = 0;
    }
    public Contador(int contador) {
        if (contador < 0) {
            this.contador = 0;
        } else {
            this.contador = contador;
        }
    }
    public Contador(Contador contador) {
        this.contador = contador.getContador();
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador < 0 ? 0 : contador;
    }

    void incrementar(){
        this.contador++;
    }

    void decrementar(){
        this.contador = this.contador <= 0 ? 0 : this.contador - 1;
    }

    @Override
    public String toString() {
        return "Contador{" +
                "contador=" + contador +
                '}';
    }
}
