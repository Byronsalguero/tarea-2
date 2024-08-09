
import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos de entrada
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        // Solicitar al usuario que ingrese el segundo número
        System.out.print("Ingrese el segundo numero entero: ");
        int numero2 = scanner.nextInt();

        // Solicitar al usuario que ingrese el tercer número
        System.out.print("Ingrese el tercer numero entero: ");
        int numero3 = scanner.nextInt();

        // Determinar el mayor de los tres números
        int mayor;
        
        if (numero1 >= numero2 && numero1 >= numero3) {
            mayor = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }

        // Mostrar el resultado
        System.out.println("El numero mayor es: " + mayor);

        // Cerrar el scanner
        scanner.close();
    }
} 
