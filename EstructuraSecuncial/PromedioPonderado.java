import java.util.Scanner;

public class PromedioPonderado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

     
        System.out.print("Ingrese la nota del primer parcial: ");
        double parcial1 = sc.nextDouble();

        System.out.print("Ingrese la nota del segundo parcial: ");
        double parcial2 = sc.nextDouble();

        System.out.print("Ingrese la nota del examen final: ");
        double examenFinal = sc.nextDouble();

        
        double definitiva = (parcial1 * 0.30) +
                            (parcial2 * 0.30) +
                            (examenFinal * 0.40);

        // Operador ternario para aprobar o reprobar
        String resultado = (definitiva >= 3.0) ? "APROBADO" : "REPROBADO";

        
        System.out.println("\n===== RESULTADO ACADÉMICO =====");
        System.out.printf("Primer parcial:  %.2f%n", parcial1);
        System.out.printf("Segundo parcial: %.2f%n", parcial2);
        System.out.printf("Examen final:    %.2f%n", examenFinal);

        System.out.printf("Nota definitiva: %.2f%n", definitiva);
        System.out.println("Estado: " + resultado);

        sc.close();
    }
}
    

