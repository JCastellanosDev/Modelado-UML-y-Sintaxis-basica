import Separador.Separadores;
import cuenta.CuentaAhorro;
import cuenta.CuentaBancaria;
import cuenta.CuentaCorriente;

void main() {

    ArrayList<CuentaBancaria> cuentas = new ArrayList<>();

    cuentas.add(new CuentaAhorro("Jesus Castellanos", "1125250017", 1.5, 1000));
    cuentas.add(new CuentaCorriente("Axel Lares", "1125250008", .5, 500 ));

    for(CuentaBancaria cuenta: cuentas) {
        System.out.println(Separadores.SEPARADOR);
        System.out.println(cuenta.getNombreCliente());
        System.out.printf("Saldo inicial: %.2f$\n", cuenta.getSaldo());
// ingreso de 200
        boolean okIngreso = cuenta.ingreso(200);
        System.out.printf("Ingreso de 200$: %s , Saldo actual: %.2f$\n", okIngreso ? "ok": "rechazado", cuenta.getSaldo());
// reintegro de 50
        boolean okReintegro = cuenta.reintegro(50);
        System.out.printf("Reintegro de 50$: %s , Saldo actual: %.2f$\n", okReintegro ? "ok": "rechazado", cuenta.getSaldo());

    }
    System.out.println(Separadores.SEPARADOR);


    /*Scanner sc = new Scanner(System.in);
    String nombre, numero;
    double tipo, importe;

//se crea objeto cuenta1 sin parámetros
//se ejecuta el constructor por defecto
    CuentaBancaria cuentaBancaria1 = new CuentaBancaria();

    System.out.print("Nombre : ");
    nombre = sc.nextLine();
    System.out.print("Número de cuenta : ");
    numero = sc.nextLine();
    System.out.print("Tipo de interes : ");
    tipo = sc.nextDouble();
    System.out.print("Saldo: ");
    importe = sc.nextDouble();

    cuentaBancaria1.setNombreCliente(nombre);
    cuentaBancaria1.setNumeroCuenta(numero);
    cuentaBancaria1.setTipoInteres(tipo);
    cuentaBancaria1.setSaldo(importe);
//se crea el objeto cuenta2 con los valores leidos por teclado
//se ejecuta el constructor con parámetros
    CuentaBancaria cuentaBancaria2 = new CuentaBancaria("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);

//se crea cuenta3 como copia de cuenta1
//se ejecuta el constructor copia
    CuentaBancaria cuentaBancaria3 = new CuentaBancaria(cuentaBancaria1);

//mostrar los datos de cuenta1
    System.out.println("Datos de la cuenta 1");
    System.out.println("Nombre del titular: " + cuentaBancaria1.getNombreCliente());
    System.out.println("Número de cuenta: " + cuentaBancaria1.getNumeroCuenta());
    System.out.println("Tipo de interés: " + cuentaBancaria1.getTipoInteres());
    System.out.println("Saldo: " + cuentaBancaria1.getSaldo());
    System.out.println();

//se realiza un ingreso en cuenta1
    cuentaBancaria1.ingreso(4000);

//mostrar el saldo de cuenta1 después del ingreso
    System.out.println("Saldo: " + cuentaBancaria1.getSaldo());

//mostrar los datos de cuenta2
    System.out.println("Datos de la cuenta 2");
    System.out.println("Nombre del titular: " + cuentaBancaria2.getNombreCliente());
    System.out.println("Número de cuenta: " + cuentaBancaria2.getNumeroCuenta());
    System.out.println("Tipo de interés: " + cuentaBancaria2.getTipoInteres());
    System.out.println("Saldo: " + cuentaBancaria2.getSaldo());
    System.out.println();

//mostrar los datos de cuenta3
    System.out.println("Datos de la cuenta 3");
    System.out.println("Nombre del titular: " + cuentaBancaria3.getNombreCliente());
    System.out.println("Número de cuenta: " + cuentaBancaria3.getNumeroCuenta());
    System.out.println("Tipo de interés: " + cuentaBancaria3.getTipoInteres());
    System.out.println("Saldo: " + cuentaBancaria3.getSaldo());
    System.out.println();

//realizar una transferencia de 10 de una cuenta a otra
    cuentaBancaria3.transferencia(cuentaBancaria2, 10);

//mostrar el saldo de cuenta2
    System.out.println("Saldo de la cuenta 2");
    System.out.println("Saldo: " + cuentaBancaria2.getSaldo());
    System.out.println();

//mostrar el saldo de cuenta3
    System.out.println("Saldo de la cuenta 3");
    System.out.println("Saldo: " + cuentaBancaria3.getSaldo());
    System.out.println();

     */
}

