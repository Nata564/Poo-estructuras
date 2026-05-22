package condicionales;

import java.util.Scanner;

public class sisCalificaciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota;

        System.out.print("Ingrese nota: ");
        nota = sc.nextDouble();

        if (nota >= 4.6) {
            System.out.println("A - Excelente");
        } else if (nota >= 4.0) {
            System.out.println("B - Sobresaliente");
        } else if (nota >= 3.5) {
            System.out.println("C - Aceptable");
        } else if (nota >= 3.0) {
            System.out.println("D - Aprobado mínimo");
        } else {
            System.out.println("F - Reprobado");
        }

        sc.close();
    }
}