import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner gh = new Scanner(System.in);
        
        System.out.print("Ingrese un numero");
        int n = gh.nextInt();
        
        System.out.println("\n--- Tabla del " + n + " ---");
        for (int i = 1; i <= 12; i++) {
            int mul = n * i;
            System.out.printf("%d x %d = %d%n", n, i, mul);
        }
        
        System.out.println("\n--- Tablas de multiplicar ----");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.printf("%4d", i * j);
            }
        }
        
        
    }
}
    

