import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner ty= new Scanner(System.in);
        
        int num = (int) (Math.random() * 100) + 1;
        
        int intentos;
        int numIntentos = 0;
        
  System.out.println("Adivina el numero en el que estoy pensando");
        
        do {
            numIntentos++;
            
            System.out.print("Intento #" + numIntentos);
            intentos = ty.nextInt();
            
            if (intentos < num) {
                System.out.println("El número es mayor.");
            } else if (intentos > num) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Correcto! Lo lograste en " + numIntentos + " intentos.");
            }
            
        } while (intentos != num); 
        
    }
}