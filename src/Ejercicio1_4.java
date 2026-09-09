import java.util.Scanner;
    public class Ejercicio1_4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese los minutos totales del viaje: ");
            int minutosTotales = scanner.nextInt();

            int horas = minutosTotales / 60;   
            int minutos = minutosTotales % 60;
            int segundos = (minutosTotales * 60) % 60;

            System.out.printf("Tiempo del viaje: %d horas, %d minutos y %d segundos\n", horas, minutos, segundos);
            scanner.close();

        }


    
}
