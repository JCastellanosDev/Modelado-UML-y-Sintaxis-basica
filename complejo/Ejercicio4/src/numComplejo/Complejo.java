package numComplejo;

import interfaces.Operable;

public class Complejo implements Operable {
    private double pReal;
    private double pImag;

    public Complejo(){
        this.pReal = 0;
        this.pImag = 0;
    }
    public Complejo(double pReal, double pImag){
        this.pReal = pReal;
        this.pImag = pImag;
    }
    public Complejo(Complejo complejo){
        this.pReal = complejo.pReal;
        this.pImag = complejo.pImag;
    }

    public double getpImag() {
        return pImag;
    }
    public void setpImag(double pImag) {
        this.pImag = pImag;
    }

    public double getpReal() {
        return pReal;
    }
    public void setpReal(double pReal) {
        this.pReal = pReal;
    }

    public void asignar(double real, double imag){
        this.pReal = real;
        this.pImag = imag;
    }

    @Override
    public Operable sumar(Operable otro) {
        if (!(otro instanceof Complejo)) {
            throw new IllegalArgumentException("Solo se puede sumar un complejo con " +
                    "otro complejo");
        }
        Complejo complejo = (Complejo) otro;
        return new Complejo(this.pReal + complejo.pReal, this.pImag + complejo.pImag);

    }
    @Override
    public String toString() {
        if (pImag >= 0) {
            return pReal + " + " + pImag + "i";
        } else {
            return pReal + " - " + Math.abs(pImag) + "i";
        }
    }
}
