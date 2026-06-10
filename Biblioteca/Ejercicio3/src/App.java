import libro.Libro;




import java.util.Scanner;

void main(){
        Scanner sc = new Scanner(System.in);
        String titulo, autor;
        int ejemplares;


        System.out.print("Introduce título: ");
        titulo = sc.nextLine();
        System.out.print("Introduce autor: ");
        autor = sc.nextLine();
        System.out.print("Introduce número de ejemplares: ");
        ejemplares = sc.nextInt();


        Libro libro1 = new Libro(titulo, autor, ejemplares, 0);

        Libro libro2 = new Libro();

        libro2.setTitulo("Don Quijote de la Mancha");
        libro2.setAutor("Miguel de Cervantes");
        libro2.setEjemplares(1);
        libro2.setPrestados(0);


        System.out.println("Libro 1:");
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getEjemplares());
        System.out.println("Prestados: " + libro1.getPrestados());
        System.out.println();


        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar.");
        }

        if (libro1.devolucion()) {
            System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
        } else {
            System.out.println("No hay ejemplares prestados del libro " + libro1.getTitulo());
        }


        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar.");
        }

        // 5. Volver a intentar realizar otro préstamo de libro1
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar.");
        }

        System.out.println();


        System.out.println(libro1.toString());
        System.out.println();


        System.out.println(libro2.toString());

        sc.close();
    }


