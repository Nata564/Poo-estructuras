import java.util.Scanner;

public class Triqui {
    public static void main(String[] args) {
        Scanner tt = new Scanner(System.in);
        char[][] tablero = new char[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
        
        char jugadorActual = 'X';
        boolean juegoTerminado = false;
        int jugadas = 0;
        
        while (juegoTerminado == false) {
            System.out.println("\n " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2]);
            System.out.println("-----------");
            System.out.println(" " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2]);
            System.out.println("-----------");
            System.out.println(" " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2]);
            
            System.out.println("\nTurno del jugador " + jugadorActual);
            System.out.print("Ingrese fila (0-2): ");
            int fila = tt.nextInt();
            System.out.print("Ingrese columna (0-2): ");
            int col = tt.nextInt();
            
            if (fila >= 0 && fila <= 2 && col >= 0 && col <= 2 && tablero[fila][col] == ' ') {
                tablero[fila][col] = jugadorActual;
                jugadas = jugadas + 1;
                
                boolean gano = false;
                
                for (int i = 0; i < 3; i++) {
                    if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) {
                        gano = true;
                    }
                    if (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual) {
                        gano = true;
                    }
                }
                
                if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) {
                    gano = true;
                }
                if (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
                    gano = true;
                }
                
                if (gano == true) {
                    System.out.println("\n " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2]);
                    System.out.println("-----------");
                    System.out.println(" " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2]);
                    System.out.println("-----------");
                    System.out.println(" " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2]);
                    System.out.println("\n¡El jugador " + jugadorActual + " ha ganado!");
                    juegoTerminado = true;
                } else if (jugadas == 9) {
                    System.out.println("\n " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2]);
                    System.out.println("-----------");
                    System.out.println(" " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2]);
                    System.out.println("-----------");
                    System.out.println(" " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2]);
                    System.out.println("\n¡Es un empate!");
                    juegoTerminado = true;
                } else {
                    if (jugadorActual == 'X') {
                        jugadorActual = 'O';
                    } else {
                        jugadorActual = 'X';
                    }
                }
            } else {
                System.out.println("Lo siento, esta casilla no es valida o ya esta ocupada. Intente de nuevo.");
            }
        }
        
        
    }
}