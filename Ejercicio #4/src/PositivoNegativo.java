import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un numero entero
        System.out.print("Ingrese un numero entero: ");
        int numero = scanner.nextInt();
        
        // Determinar si el numero es positivo o negativo
        if (numero > 0) {
            System.out.println("El numero es positivo.");
        } else if (numero < 0) {
            System.out.println("El numero es negativo.");
        } else {
            System.out.println("El numero es cero.");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
