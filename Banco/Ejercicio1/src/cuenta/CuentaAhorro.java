package cuenta;

public class CuentaAhorro extends CuentaBancaria {

    public CuentaAhorro(String nombreCliente, String numeroCuenta,double tipoInteres, double saldo) {
        super(nombreCliente, numeroCuenta, tipoInteres, saldo);
    }

    @Override
    public boolean ingreso(double valor) {
        if (valor <= 0) return false;
        double bonificacion = valor * 0.1;
        setSaldo(getSaldo() + bonificacion + valor);
        return true;
    }

    @Override
    public boolean reintegro(double valor) {
        if (valor <= 0 || getSaldo() < valor )return false;
        setSaldo(getSaldo() - valor);
        return true;
    }
}
