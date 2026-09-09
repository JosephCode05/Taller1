
import java.util.Scanner;

    
    public class Ejercicio1_3 {
        public static void main(String[] args) {
            Scanner scanner =new Scanner(System.in);

            System.out.println("Indica la base de del Rectangulo");
            double base = scanner.nextDouble();

            System.out.println("Indica la altura del Rectangulo");
            double altura = scanner.nextDouble();

            System.out.println("Indica el radio del circulo");
            double radio = scanner.nextDouble();

            double areaRectangulo = (base * altura);
            double perimetroRectangulo = 2 * (base + altura);
            double areaCirculo = Math.PI * Math.pow(radio, 2);
            double CircunferenciaCirculo = 2 * Math.PI * radio;

            System.out.printf("El area del rectangulo es: %.2f\n", areaRectangulo);
            System.out.printf("El perimetro del rectangulo es: %.2f\n", perimetroRectangulo);
            System.out.printf("La circunferencia del círculo es: %.2f\n", CircunferenciaCirculo);
            System.out.printf("El area del círculo es: %.2f\n", areaCirculo);

            scanner.close();

        }
    
}
