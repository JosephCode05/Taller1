import java.util.Scanner;

public class Ejercicio1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indica la nota del primer parcial (30%):");
        double parcial1 = scanner.nextDouble();

        System.out.println("Indica la nota del segundo parcial (30%):");
        double parcial2 = scanner.nextDouble();

        System.out.println("Indica la nota del examen final (40%):");
        double examenFinal = scanner.nextDouble();

        double notaDefinitiva = (parcial1 * 0.30) + (parcial2 * 0.30) + (examenFinal * 0.40);

        String estado = (notaDefinitiva >= 3.0) ? "Aprueba" : "Reprueba";

        System.out.printf("\nLa nota definitiva es: %.2f\n", notaDefinitiva);
        System.out.printf("Estado del estudiante: %s\n", estado);

        scanner.close();
    }
}