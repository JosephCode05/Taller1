import java.util.Scanner;

public class Ejercicio4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pacientes = new String[8];

        System.out.println("--- Registro de Pacientes de la Clínica ---");
        System.out.println("Ingresa los nombres de los 8 pacientes:");

        for (int i = 0; i < pacientes.length; i++) {
            System.out.printf("Paciente %d: ", (i + 1));
            pacientes[i] = scanner.nextLine(); 
        }

        System.out.println("\nIndica el nombre del paciente a buscar en la base de datos:");
        String nombreBuscado = scanner.nextLine();

        boolean encontrado = false;
        int posicion = -1; 

        for (int i = 0; i < pacientes.length; i++) {
            
            if (pacientes[i].equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;
                posicion = i;
                break; 
            }
        }

        if (encontrado) {
            System.out.printf("\nResultado: El paciente '%s' existe en el sistema (Posición interna: %d).\n", nombreBuscado, posicion);
        } else {
            System.out.printf("\nResultado: El paciente '%s' no fue encontrado en la base de datos.\n", nombreBuscado);
        }

        scanner.close();
    }
}