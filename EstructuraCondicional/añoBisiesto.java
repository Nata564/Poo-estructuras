package condicionales;
import java.util.Scanner;

public class añoBisiesto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anio, dia;

        System.out.print("Ingrese año: ");
        anio = sc.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }

        System.out.print("Ingrese número del día (1-7): ");
        dia = sc.nextInt();

        switch (dia) {

            case 1:
                System.out.println("Lunes");
                break;

            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miércoles");
                break;

            case 4:
                System.out.println("Jueves");
                break;

            case 5:
                System.out.println("Viernes");
                break;

            case 6:
                System.out.println("Sábado");
                break;

            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("Número inválido");
        }

        sc.close();
    }
}