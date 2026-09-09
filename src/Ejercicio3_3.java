import java.util.Scanner;

public class Ejercicio3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indica el número de términos (n) para calcular las series:");
        int n = scanner.nextInt();

        int sumaNaturales = 0;
        int sumaPares = 0;
        int sumaCuadrados = 0;

        for (int i = 1; i <= n; i++) {
            sumaNaturales += i;             
            sumaPares += (2 * i);             
            sumaCuadrados += (i * i);          
        }

   
        int formulaNaturales = n * (n + 1) / 2;
        int formulaPares = n * (n + 1);
        int formulaCuadrados = n * (n + 1) * (2 * n + 1) / 6;

        System.out.println("\n--- 1. Suma de los primeros " + n + " números naturales ---");
        System.out.printf("Resultado con ciclo for: %d\n", sumaNaturales);
        System.out.printf("Resultado con fórmula:   %d\n", formulaNaturales);

        System.out.println("\n--- 2. Suma de los primeros " + n + " números pares ---");
        System.out.printf("Resultado con ciclo for: %d\n", sumaPares);
        System.out.printf("Resultado con fórmula:   %d\n", formulaPares);

        System.out.println("\n--- 3. Suma de los primeros " + n + " cuadrados perfectos ---");
        System.out.printf("Resultado con ciclo for: %d\n", sumaCuadrados);
        System.out.printf("Resultado con fórmula:   %d\n", formulaCuadrados);

        scanner.close();
    }
}