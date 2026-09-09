import java.util.Scanner;

public class Ejercicio2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Indica el tipo de vehículo (1=Moto, 2=Carro, 3=Camioneta):");
        int tipo = scanner.nextInt();

        System.out.println("Indica el número de horas de permanencia:");
        int horas = scanner.nextInt();

        
        int primeraHora = 0;
        int horaAdicional = 0;

        
        switch (tipo) {
            case 1:
                primeraHora = 2000;
                horaAdicional = 1500;
                break; // El break indica que el caso termina aquí
            case 2:
                primeraHora = 4000;
                horaAdicional = 3000;
                break;
            case 3:
                primeraHora = 5000;
                horaAdicional = 4000;
                break;
            default:
                System.out.println("\nError: Tipo de vehículo no válido.");
                scanner.close();
                return;
        }

       
        int total = primeraHora + (horaAdicional * (horas - 1));

        
        System.out.printf("\nEl total a pagar es: $ %d\n", total);

        scanner.close();
    }
}