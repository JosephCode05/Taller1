import java.util.Scanner;

public class Ejercicio3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indica tu edad (número entero entre 1 y 120):");
        int edad = scanner.nextInt();


        while (edad < 1 || edad > 120) {
            System.out.println("\nError: La edad ingresada es inválida.");
            System.out.println("Por favor, ingresa un valor coherente (entre 1 y 120):");
            
            edad = scanner.nextInt();
        }

        System.out.println("\n--- Clasificación ---");
        System.out.printf("Edad registrada: %d años\n", edad);
        
        if (edad <= 12) {
            System.out.println("Etapa: Niñez");
        } else if (edad <= 17) {
            System.out.println("Etapa: Adolescencia");
        } else if (edad <= 25) {
            System.out.println("Etapa: Juventud");
        } else if (edad <= 59) {
            System.out.println("Etapa: Adultez");
        } else {
            System.out.println("Etapa: Tercera edad");
        }

        scanner.close();
    }
}