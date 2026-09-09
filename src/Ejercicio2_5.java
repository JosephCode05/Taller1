import java.util.Scanner;

public class Ejercicio2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Indica un año (número entero positivo):");
        int anio = scanner.nextInt();

        
        System.out.println("Indica un número del 1 al 7 para el día de la semana:");
        int dia = scanner.nextInt();

        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

        if (esBisiesto) {
            System.out.printf("\nEl año %d es bisiesto.\n", anio);
        } else {
            System.out.printf("\nEl año %d no es bisiesto.\n", anio);
        }


        System.out.println("--- Día de la Semana ---");
        switch (dia) {
            case 1:
                System.out.println("El día 1 corresponde a: Lunes");
                break;
            case 2:
                System.out.println("El día 2 corresponde a: Martes");
                break;
            case 3:
                System.out.println("El día 3 corresponde a: Miércoles");
                break;
            case 4:
                System.out.println("El día 4 corresponde a: Jueves");
                break;
            case 5:
                System.out.println("El día 5 corresponde a: Viernes");
                break;
            case 6:
                System.out.println("El día 6 corresponde a: Sábado");
                break;
            case 7:
                System.out.println("El día 7 corresponde a: Domingo");
                break;
            default:
                System.out.println("Error: El número debe estar entre el 1 y el 7.");
                break;
        }

        scanner.close();
    }
}