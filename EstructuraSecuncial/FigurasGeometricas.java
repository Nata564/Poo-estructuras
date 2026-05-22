import java.util.Scanner;

public class FigurasGeometricas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base del rectángulo: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = sc.nextDouble();

       
        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();

        
        double areaRectangulo = base * altura;
        double perimetroRectangulo = 2 * (base + altura);

       
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        double circunferencia = 2 * Math.PI * radio;

     
        System.out.println("\n===== RESULTADOS =====");

        System.out.printf("Área del rectángulo: %.2f%n", areaRectangulo);
        System.out.printf("Perímetro del rectángulo: %.2f%n", perimetroRectangulo);

        System.out.printf("Área del círculo: %.2f%n", areaCirculo);
        System.out.printf("Circunferencia del círculo: %.2f%n", circunferencia);

        sc.close();
    }
}