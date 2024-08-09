import java.util.Scanner;

public class NombreMes {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el numero del mes
        System.out.print("Ingrese el numero del mes (1-12): ");
        int mes = scanner.nextInt();
        
        // Determinar el nombre del mes utilizando if-else
        if (mes == 1) {
            System.out.println("Enero");
        } else if (mes == 2) {
            System.out.println("Febrero");
        } else if (mes == 3) {
            System.out.println("Marzo");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Mayo");
        } else if (mes == 6) {
            System.out.println("Junio");
        } else if (mes == 7) {
            System.out.println("Julio");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Septiembre");
        } else if (mes == 10) {
            System.out.println("Octubre");
        } else if (mes == 11) {
            System.out.println("Noviembre");
        } else if (mes == 12) {
            System.out.println("Diciembre");
        } else {
            System.out.println("Numero de mes invalido. Debe ser un numero entre 1 y 12.");
        }       
        // Cerrar el scanner
        scanner.close();
    }
}


