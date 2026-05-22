import java.util.Scanner;

public class BusquedaNombre {
    public static void main(String[] args) {
        Scanner ww = new Scanner(System.in);
        String[] pacientes = new String[8];
        
        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese el nombre del paciente " + (i + 1) + ": ");
            pacientes[i] = ww.next();
        }
        
        System.out.print("Ingrese el nombre del paciente que quiere buscar: ");
        String buscar = ww.next();
        
        boolean encontrado = false;
        int posicion = -1;
        
        for (int i = 0; i < 8; i++) {
            if (pacientes[i].equalsIgnoreCase(buscar) == true) {
                encontrado = true;
                posicion = i;
            }
        }
        
        if (encontrado == true) {
            System.out.println("El paciente que busca esta en la posicion: " + posicion);
        } else {
            System.out.println("El paciente no fue encontrado.");
        }
        
      
    }
}