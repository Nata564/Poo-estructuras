import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        Scanner bb = new Scanner(System.in);
        int edad;

        while (true) {
            System.out.print("Ingrese su edad (1 - 120): ");
             edad = bb.nextInt();
                if (edad < 1 || edad > 120) {
                System.out.println("Los siento, la edad debe estar estrictamente entre 1 y 120 años.Ademas que el numero debe ser un entero positivo");
        } else {
            break;
        }
    }

        System.out.print("Etapa de vida: ");
        if (edad <= 12) {
            System.out.println("Niñez");
        } else if (edad <= 17 && edad >=13) {
            System.out.println("Adolescencia");
        } else if (edad <= 25 && edad >=18) {
            System.out.println("Juventud");
        } else if (edad <= 59 && edad >=26) {
            System.out.println("Adultez");
        } else {
            System.out.println("Tercera edad");
        }

        
    }
}
