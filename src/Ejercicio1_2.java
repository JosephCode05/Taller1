import java.util.Scanner;

    public class Ejercicio1_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingresa el nombre del empleado: ");
            String nombre = scanner.nextLine();

            System.out.println("Ingresa las horas trabajadas: ");
            double horasTrabajadas = scanner.nextDouble();

            System.out.println("Ingresa el valor de la hora: ");
            double valorHora = scanner.nextDouble();

            double salarioBruto = horasTrabajadas * valorHora;
            double descuentos = salarioBruto * 0.08;
            double retencion = salarioBruto * 0.05;
            double salarioNeto = salarioBruto - descuentos - retencion;

             System.out.println("Empleado: " + nombre + "\nSalario Bruto: " + salarioBruto + "\nDescuentos: " + descuentos + "\nRetención: " + retencion + "\nSalario Neto: " + salarioNeto);

            scanner.close();
    }

}
