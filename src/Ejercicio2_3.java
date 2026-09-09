import java.util.Scanner;

public class Ejercicio2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indica la nota del estudiante (entre 0.0 y 5.0):");
        double nota = scanner.nextDouble();

        if (nota < 0.0 || nota > 5.0) {
            System.out.println("\nError: La nota ingresada es inválida. Debe estar entre 0.0 y 5.0.");
        } else {

            System.out.println("\n--- Reporte de Calificación ---");
            
            if (nota >= 4.6) {
                System.out.println("Letra: A - Excelente");
            } else if (nota >= 4.0) {
                System.out.println("Letra: B - Sobresaliente");
            } else if (nota >= 3.5) {
                System.out.println("Letra: C - Aceptable");
            } else if (nota >= 3.0) {
                System.out.println("Letra: D - Aprobado mínimo");
            } else {
                System.out.println("Letra: F - Reprobado");
            }
        }

        scanner.close();
    }
}