import java.util.Scanner;

public class Ejercicio3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = (int) (Math.random() * 100) + 1;
        
        // Inicializamos las variables de control
        int intento = 0;
        int contadorIntentos = 0;

        System.out.println("Adivina el número secreto (entre 1 y 100):");

        while (intento != numeroSecreto) {
            contadorIntentos++; // Sumamos 1 al contador de intentos
            
            System.out.printf("Intento %d: ", contadorIntentos);
            intento = scanner.nextInt();

            // Evaluamos la entrada del usuario para darle pistas
            if (intento < numeroSecreto) {
                System.out.println("-> El número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("-> El número es menor.");
            } else {
               
                System.out.printf("\n¡Correcto! Lo lograste en %d intentos.\n", contadorIntentos);
            }
        }

        scanner.close();
    }
}