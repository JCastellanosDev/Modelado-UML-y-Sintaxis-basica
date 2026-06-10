package cuenta;

public abstract class CuentaBancaria {
    private String nombreCliente;
    private String numeroCuenta;
    private double saldo;
    private double tipoInteres;

    public CuentaBancaria(){
        this.nombreCliente = "Axel";
        this.numeroCuenta = "0001";
        this.saldo = 1500;
        this.tipoInteres = 1.6;
    }
    public CuentaBancaria(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo){
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }
    public CuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.nombreCliente = cuentaBancaria.nombreCliente;
        this.numeroCuenta = cuentaBancaria.numeroCuenta;
        this.saldo = cuentaBancaria.saldo;
        this.tipoInteres = cuentaBancaria.tipoInteres;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public abstract boolean ingreso(double valor);

    public abstract boolean reintegro(double valor);

    public boolean transferencia(CuentaBancaria cuentaBancariaDestino, double importe ) {
        if (this.reintegro(importe)) {
            cuentaBancariaDestino.ingreso(importe);
            return true;
        } else {
            return false;

        }
    }
}
