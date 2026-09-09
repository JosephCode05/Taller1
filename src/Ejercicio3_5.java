import java.util.Scanner;

public class Ejercicio3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indica el número inicial (a):");
        int a = scanner.nextInt();

        System.out.println("Indica el número final (b, debe ser mayor que a):");
        int b = scanner.nextInt();

        int cantidadPrimos = 0;
        int sumaPrimos = 0;
        String listaPrimos = ""; 


        for (int actual = a; actual <= b; actual++) {
            
            if (actual < 2) {
                continue; 
            }

            boolean esPrimo = true;
            int divisor = 2;
            double limiteBuscado = Math.sqrt(actual);

            while (divisor <= limiteBuscado) {
                if (actual % divisor == 0) {
                    esPrimo = false; 
                    break;           
                }
                divisor++;
            }


            if (esPrimo) {
                cantidadPrimos++;
                sumaPrimos += actual;
                
                if (cantidadPrimos == 1) {
                    listaPrimos += actual;
                } else {
                    listaPrimos += ", " + actual;
                }
            }
        }

        System.out.printf("\nPrimos entre %d y %d: %s\n", a, b, listaPrimos);
        System.out.printf("Cantidad: %d\n", cantidadPrimos);
        System.out.printf("Suma: %d\n", sumaPrimos);

        scanner.close();
    }
}