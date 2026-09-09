import java.util.Scanner;

public class Ejercicio2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indica tu peso en kilogramos (ej. 75.5):");
        double peso = scanner.nextDouble();

        System.out.println("Indica tu estatura en metros (ej. 1.75):");
        double estatura = scanner.nextDouble();

       
        double imc = peso / Math.pow(estatura, 2);

        System.out.printf("\nTu Índice de Masa Corporal (IMC) es: %.1f\n", imc);

        
        if (imc < 18.5) {
            System.out.println("Categoría: Bajo peso");
        } else if (imc < 25.0) {
            System.out.println("Categoría: Peso normal");
        } else if (imc < 30.0) {
            System.out.println("Categoría: Sobrepeso");
        } else {
            System.out.println("Categoría: Obesidad");
        }

        scanner.close();
    }
}