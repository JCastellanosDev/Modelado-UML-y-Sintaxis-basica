import interfaces.Operable;
import numComplejo.Complejo;
import numComplejo.Racional;

public class App {
    public static void main(String[] args) {




        Complejo c1 = new Complejo();

        c1.asignar(3, 2);


        Complejo c2 = new Complejo(1, 5);


        Complejo c3 = new Complejo(c1);

        System.out.println("Complejo c1: " + c1);
        System.out.println("Complejo c2: " + c2);
        System.out.println("Complejo c3 (copia de c1): " + c3);
        System.out.println();

        Operable[] numeros = new Operable[2];
        numeros[0] = new Complejo(3, 2);
        numeros[1] = new Racional(1, 2);

        System.out.println("Elementos del array Operable:");
        for (Operable o : numeros) {
            System.out.println("  " + o);
        }
        System.out.println();


        Complejo cA = new Complejo(3, 2);
        Complejo cB = new Complejo(1, 4);
        Operable sumaComplejos = cA.sumar(cB);
        System.out.println("(" + cA + ") + (" + cB + ") = " + sumaComplejos);
        System.out.println();

        Racional rA = new Racional(1, 2);
        Racional rB = new Racional(1, 3);
        Operable sumaRacionales = rA.sumar(rB);
        System.out.println("(" + rA + ") + (" + rB + ") = " + sumaRacionales);
        System.out.println();


        try {
            Operable mezcla = cA.sumar(rA);   
            System.out.println(mezcla);
        } catch (IllegalArgumentException e) {
            System.out.println("Error controlado: " + e.getMessage());
        }
    }
}