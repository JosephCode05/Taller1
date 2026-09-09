import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indica un número entero positivo (n):");
        int n = scanner.nextInt();

        System.out.printf("\n--- Tabla del %d ---\n", n);
        
     
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%d x %d = %d\n", n, i, (n * i));
        }


        System.out.printf("\n--- Cuadrícula de tablas del 1 al %d ---\n", n);
        
      
        for (int fila = 1; fila <= n; fila++) {
            
            for (int columna = 1; columna <= 12; columna++) {
                // Multiplicamos la fila actual por la columna actual
                int resultado = fila * columna;
                

                System.out.printf("%4d", resultado);
            }
            
            System.out.println();
        }

        scanner.close();
    }
}