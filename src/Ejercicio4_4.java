import java.util.Scanner;

public class Ejercicio4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] ventas = new double[4][3];

        double ventaMaxima = -1.0;
        int sucursalMax = 0;
        int productoMax = 0;

        System.out.println("--- Ingreso de Ventas ---");

        for (int fila = 0; fila < ventas.length; fila++) {
            System.out.printf("\nDatos de la Sucursal %d:\n", (fila + 1));
            
            for (int columna = 0; columna < ventas[fila].length; columna++) {
                System.out.printf("  Venta del Producto %d: $ ", (columna + 1));
                ventas[fila][columna] = scanner.nextDouble();

                if (ventas[fila][columna] > ventaMaxima) {
                    ventaMaxima = ventas[fila][columna];
                    sucursalMax = fila + 1;   
                    productoMax = columna + 1; 
                }
            }
        }

        System.out.println("\n--- Ventas por sucursal ---");
        for (int fila = 0; fila < ventas.length; fila++) {
            double totalSucursal = 0;
            for (int columna = 0; columna < ventas[fila].length; columna++) {
                totalSucursal += ventas[fila][columna];
            }
            System.out.printf("Sucursal %d: $ %.2f\n", (fila + 1), totalSucursal);
        }

        System.out.println("\n--- Ventas por producto ---");
 
        for (int columna = 0; columna < 3; columna++) {
            double totalProducto = 0;
            for (int fila = 0; fila < ventas.length; fila++) {
                totalProducto += ventas[fila][columna];
            }
            System.out.printf("Producto %d: $ %.2f\n", (columna + 1), totalProducto);
        }

        System.out.printf("\nVenta más alta: $ %.2f (Sucursal %d, Producto %d)\n", ventaMaxima, sucursalMax, productoMax);

        scanner.close();
    }
}