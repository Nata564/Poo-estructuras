import java.util.Scanner;

public class TiempoViaje {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de minutos: ");
        int minutosTotales = sc.nextInt();

       
        int segundosTotales = minutosTotales * 60;

        
        int horas = minutosTotales / 60;
        int minutos = minutosTotales % 60;
        int segundos = segundosTotales % 60;

        System.out.println("\n===== RESULTADO =====");
        System.out.println("Tiempo ingresado: " + minutosTotales + " minutos");
        System.out.println("Equivale a:       " + horas + " horas, "
                + minutos + " minutos, "
                + segundos + " segundos");

        System.out.println("En segundos:      " + segundosTotales + " segundos");

        sc.close();
    }
}