import java.util.Scanner;

public class Ejercicio2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indica la longitud del primer lado del triángulo:");
        double lado1 = scanner.nextDouble();

        System.out.println("Indica la longitud del segundo lado del triángulo:");
        double lado2 = scanner.nextDouble();

        System.out.println("Indica la longitud del tercer lado del triángulo:");
        double lado3 = scanner.nextDouble();

        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("\nEl triángulo es: Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("\nEl triángulo es: Isósceles");
            } else {
                System.out.println("\nEl triángulo es: Escaleno");
            }
            
        } else {

            System.out.println("\nError: Las medidas indicadas no pueden formar un triángulo.");
        }

        scanner.close();
    }
}
