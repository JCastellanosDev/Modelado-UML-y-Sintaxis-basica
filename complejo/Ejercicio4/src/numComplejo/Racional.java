package numComplejo;

import interfaces.Operable;

public class Racional implements Operable {
    private int numerador;
    private int denominador;

    public Racional(){
        this.numerador = 0;
        this.denominador = 1;
    }
    public Racional(int numerador, int denominador){
    if (denominador == 0){
        throw new IllegalArgumentException("El denominador no puede ser 0");
    }
    if (denominador < 0) {
        numerador = -numerador;
        denominador = -denominador;
    }
    this.numerador = numerador;
    this.denominador = denominador;
    simplificar();
    }
    public Racional(Racional otrito){
        this.numerador = otrito.numerador;
        this.denominador = otrito.denominador;
    }

    public int getNumerador() {
        return numerador;
    }
    public void setNumerador(int numerador) {
        this.numerador = numerador;
        simplificar();
    }

    public int getDenominador() {
        return denominador;
    }
    public void setDenominador(int denominador) {
        if (denominador <= 0) {
            throw new IllegalArgumentException("El denominador debe ser > 0.");
        }
        this.denominador = denominador;
        simplificar();
    }
    public void asignar(int numerador, int denominador) {
        if (denominador <= 0) {
            throw new IllegalArgumentException("El denominador debe ser > 0.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    private int mcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return (a == 0) ? 1 : a;
    }


    private void simplificar() {
        int divisor = mcd(numerador, denominador);
        numerador /= divisor;
        denominador /= divisor;
    }


    @Override
    public Operable sumar(Operable otro) {
        if (!(otro instanceof Racional)) {
            throw new IllegalArgumentException(
                    "Solo se puede sumar un Racional con otro Racional.");
        }
        Racional b = (Racional) otro;
        int nuevoNum = this.numerador * b.denominador + b.numerador * this.denominador;
        int nuevoDen = this.denominador * b.denominador;
        return new Racional(nuevoNum, nuevoDen);  // el constructor simplifica
    }

    // Formato "numerador/denominador"
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

}
