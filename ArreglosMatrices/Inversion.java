import java.util.Scanner;

public class Inversion {
    public static void main(String[] args) {
        Scanner ee = new Scanner(System.in);
        
        System.out.print("Ingrese el tamano del arreglo (maximo 20): ");
        int n = ee.nextInt();
        
        int[] numeros = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento [" + i + "]: ");
            numeros[i] = ee.nextInt();
        }
        
        System.out.print("Original: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        
        for (int i = 0; i < n / 2; i++) {
            int temporal = numeros[i];
            numeros[i] = numeros[n - 1 - i];
            numeros[n - 1 - i] = temporal;
        }
        
        System.out.print("Invertido: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        
    
    }
}
