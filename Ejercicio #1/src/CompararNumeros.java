import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos de entrada
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número
        System.out.print("Ingrese el primer numero entero: ");
        int numero1 = scanner.nextInt();

        // Solicitar al usuario que ingrese el segundo número
        System.out.print("Ingrese el segundo numero entero: ");
        int numero2 = scanner.nextInt();

        // Comparar los dos números y determinar el mayor
        if (numero1 > numero2) {
            System.out.println("El numero mayor es: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("El numero mayor es: " + numero2);
        } else {
            System.out.println("Ambos numeros son iguales.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}

