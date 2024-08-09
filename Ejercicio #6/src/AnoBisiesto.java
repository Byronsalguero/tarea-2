
import java.util.Scanner;
public class AnoBisiesto {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un ano
        System.out.print("Ingrese un ano: ");
        int ano = scanner.nextInt();
        
        // Verificar si el ano es bisiesto
        boolean esBisiesto = esAnoBisiesto(ano);
        
        // Mostrar el resultado
        if (esBisiesto) {
            System.out.println(ano + " es un ano bisiesto.");
        } else {
            System.out.println(ano + " no es un ano bisiesto.");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
    
    public static boolean esAnoBisiesto
    (int ano) {
        // Un ano es bisiesto si es divisible por 4 y no divisible por 100, 
        // o si es divisible por 400.
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}

