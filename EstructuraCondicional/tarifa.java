package condicionales;

import java.util.Scanner;

public class tarifa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tipo, horas;
        double total = 0;

        System.out.print("Tipo de vehículo (1 Moto, 2 Carro, 3 Camioneta): ");
        tipo = sc.nextInt();

        System.out.print("Horas: ");
        horas = sc.nextInt();

        switch (tipo) {

            case 1:
                total = 2000 + ((horas - 1) * 1500);
                break;

            case 2:
                total = 4000 + ((horas - 1) * 3000);
                break;

            case 3:
                total = 5000 + ((horas - 1) * 4000);
                break;

            default:
                System.out.println("Opción no válida");
        }

        if (tipo >= 1 && tipo <= 3) {
            System.out.println("Total a pagar: $" + total);
        }

        sc.close();
    }
}