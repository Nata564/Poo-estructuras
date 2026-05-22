import java.util.Scanner;

public class RegistroVentas {
    public static void main(String[] args) {
        Scanner vv = new Scanner(System.in);
        int[][] ventas = new int[4][3];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Venta Sucursal " + (i + 1) + ", Producto " + (j + 1) + ": ");
                ventas[i][j] = vv.nextInt();
            }
        }
        
        System.out.println("\n--- Ventas por sucursal ---");
        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila = sumaFila + ventas[i][j];
            }
            System.out.println("Sucursal " + (i + 1) + ": $ " + sumaFila);
        }
        
        System.out.println("\n--- Ventas por producto ---");
        for (int j = 0; j < 3; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna = sumaColumna + ventas[i][j];
            }
            System.out.println("Producto " + (j + 1) + ": $ " + sumaColumna);
        }
        
        int ventaAlta = ventas[0][0];
        int sucAlta = 1;
        int prodAlto = 1;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (ventas[i][j] > ventaAlta) {
                    ventaAlta = ventas[i][j];
                    sucAlta = i + 1;
                    prodAlto = j + 1;
                }
            }
        }
        
        System.out.println("\nVenta mas alta: $ " + ventaAlta + " (Sucursal " + sucAlta + ", Producto " + prodAlto + ")");
        
      
    }
}