  import java.util.Scanner;

public class Ejercicio1_1{
    public static void main(String[] args) {
        // Inicializamos el Scanner para leer datos de la consola
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;
        
        
        System.out.printf("Celsius:    %.2f °C\n", celsius);
        System.out.printf("Fahrenheit: %.2f °F\n", fahrenheit);
        System.out.printf("Kelvin:     %.2f K\n", kelvin);
        
        // Es buena práctica cerrar el scanner al terminar
        scanner.close();
    }
}