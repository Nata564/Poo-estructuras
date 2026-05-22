import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner pp= new Scanner(System.in);
        
        System.out.print("Introduce a: ");
        int a = pp.nextInt();
        System.out.print("Introduce b: ");
        int b = pp.nextInt();
        
        int cantidad = 0;
        int suma = 0;
        
        System.out.print("Primos entre " + a + " y " + b + ": ");
        

        for (int i = a; i <= b; i++) {
            
            if (i >= 2) {
                
                boolean esPrimo = true;
                int divisor = 2;
                
 
                while (divisor <= Math.sqrt(i) && esPrimo == true) {
                    if (i % divisor == 0) {
                        esPrimo = false;
                    }
                    divisor++;
                }
                

                if (esPrimo == true) {
                    System.out.print(i + ", ");
                    cantidad ++;
                    suma += i;
                }
            }
        }
        
        System.out.println();
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Suma: " + suma);
        

    }
}