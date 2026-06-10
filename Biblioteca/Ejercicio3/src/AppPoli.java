import libro.LibroPoli;
import libro.LibroDigital;
import libro.LibroFisico;

void main() {
     ArrayList<LibroPoli> biblioteca = new ArrayList<>();
     biblioteca.add(new LibroFisico("La pascualita", "Axel lares", 2, 1));
     biblioteca.add(new LibroDigital("No se que poner", "Jesus Castellanos"));

     for (LibroPoli libro : biblioteca) {
         System.out.println("=== Evaluando: " + libro.getTitulo()+ " ===");
         for (int i = 1; i <= 3; i++){
             boolean exito = libro.prestar();
             System.out.println("Prestamo #"+ i + " Exitoso:" + exito + " Estado: "+ libro);
         }
     }

}