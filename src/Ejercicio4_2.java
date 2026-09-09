import java.util.Scanner;

public class Ejercicio4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indica la cantidad de números a ingresar (máximo 20):");
        int n = scanner.nextInt();

        if (n <= 0 || n > 20) {
            System.out.println("\nError: El número ingresado debe estar entre 1 y 20.");
            scanner.close();
            return; 
        }

        int[] numeros = new int[n];

        System.out.println("Ingresa los valores del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Valor en posición %d: ", i);
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nArreglo Original:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d  ", numeros[i]);
        }
        System.out.println(); 

        for (int i = 0; i < n / 2; i++) {
        
            int temporal = numeros[i];
            
            numeros[i] = numeros[n - 1 - i];
            
            numeros[n - 1 - i] = temporal;
        }

 
        System.out.println("\nArreglo Invertido:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d  ", numeros[i]);
        }
        System.out.println();

        scanner.close();
    }
}