import java.util.Scanner;

public class Ejercicio4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[10];

        // Variables acumuladoras y de control
        double suma = 0;
        double notaMaxima = -1.0; 
        double notaMinima = 6.0;  
        int indiceMaximo = 0;
        int indiceMinimo = 0;
        int aprobados = 0;
        int reprobados = 0;

        System.out.println("Ingresa las notas de los 10 estudiantes (entre 0.0 y 5.0):");


        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota del estudiante %d: ", (i + 1));
            notas[i] = scanner.nextDouble();

            suma += notas[i];


            if (notas[i] > notaMaxima) {
                notaMaxima = notas[i];
                indiceMaximo = i; 
            }


            if (notas[i] < notaMinima) {
                notaMinima = notas[i];
                indiceMinimo = i; 
            }

            if (notas[i] >= 3.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }


        double promedio = suma / notas.length;

   
        System.out.println("\n--- Estadísticas del Grupo ---");
        System.out.printf("Promedio del grupo: %.2f\n", promedio);
        System.out.printf("Nota más alta:      %.2f (en la posición %d)\n", notaMaxima, indiceMaximo);
        System.out.printf("Nota más baja:      %.2f (en la posición %d)\n", notaMinima, indiceMinimo);
        System.out.printf("Estudiantes aprobados:  %d\n", aprobados);
        System.out.printf("Estudiantes reprobados: %d\n", reprobados);

        scanner.close();
    }
}