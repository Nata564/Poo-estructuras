
    import java.util.Scanner;

public class SumaMatematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un valor");
        int n = sc.nextInt();

        long sumaNatural= 0;
        for (int i = 1; i <= n; i++) {
            sumaNatural += i;
        }
    
        long sumaNaturalesFormula =  n * (n + 1) / 2;

        System.out.println("\n---SERIE 1: Números Naturales ---");
        System.out.println("Resultado con ciclo: " + sumaNatural);
        System.out.println("Fórmula cerrada [n*(n+1)/2]: " + sumaNaturalesFormula);
        if (sumaNatural== sumaNaturalesFormula){
            System.out.println("los resultados coninciden");
        } else {
            System.out.println("los resultados no coninciden");
        }
        

        long sumaPares = 0;
        for (int i = 1; i <= n; i++) {
            sumaPares += (2 * i); 
        }
       
        long sumaParesFormula = (long) n * (n + 1);

        System.out.println("\n---SERIE 2: Números Pares ---");
        System.out.println("Resultado con ciclo: " + sumaPares);
        System.out.println("Fórmula cerrada [n*(n+1)]: " + sumaParesFormula);
        if (sumaPares== sumaPares){
            System.out.println("los resultados coninciden");
        } else {
            System.out.println("los resultados no coninciden");
        }


        long sumaCuadrados = 0;
        for (int i = 1; i <= n; i++) {
            sumaCuadrados += ((long) i * i);
        }

        long sumaCuadradosFormula = (long) n * (n + 1) * (2 * n + 1) / 6;

        System.out.println("\n--- SERIE 3: Cuadrados Perfectos---");
        System.out.println("Resultado con ciclo: " + sumaCuadrados);
        System.out.println("Fórmula cerrada [n*(n+1)*(2n+1)/6]: " + sumaCuadradosFormula);
        if (sumaCuadrados== sumaCuadradosFormula){
            System.out.println("los resultados coninciden");
        } else {
            System.out.println("los resultados no coninciden");
        }
    }
}
