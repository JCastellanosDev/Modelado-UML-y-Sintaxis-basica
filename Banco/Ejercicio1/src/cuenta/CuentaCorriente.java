package cuenta;

public class CuentaCorriente extends CuentaBancaria{
    private static final double COMISION = 0.5;
    public CuentaCorriente(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {
        super(nombreCliente, numeroCuenta, tipoInteres, saldo);
    }
    @Override
    public boolean ingreso(double valor) {
        if (valor <= 0) return false;
        setSaldo(getSaldo() + valor);
        return true;
    }

    @Override
    public boolean reintegro(double valor) {
        double total = valor + COMISION;
        if (valor <= 0 || getSaldo() < total) return false;
        setSaldo(getSaldo() - total);
        return false;
    }
}
