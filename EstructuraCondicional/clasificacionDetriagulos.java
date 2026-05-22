package condicionales;

import java.util.Scanner;

public class clasificacionDetriagulos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("Ingrese lado 1: ");
        a = sc.nextDouble();

        System.out.print("Ingrese lado 2: ");
        b = sc.nextDouble();

        System.out.print("Ingrese lado 3: ");
        c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c) {
                System.out.println("Triángulo equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triángulo isósceles");
            } else {
                System.out.println("Triángulo escaleno");
            }

        } else {
            System.out.println("No es un triángulo válido");
        }

        sc.close();
    }
}