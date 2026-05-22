import java.util.Scanner;

public class Estadisticas {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);
        double[] notas = new double[10];
        double suma = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = rr.nextDouble();
            suma = suma + notas[i];
        }
        
        double promedio = suma / 10;
        
        double notaAlta = notas[0];
        int posAlta = 0;
        double notaBaja = notas[0];
        int posBaja = 0;
        
        int aprobados = 0;
        int reprobados = 0;
        
        for (int i = 0; i < 10; i++) {
            if (notas[i] > notaAlta) {
                notaAlta = notas[i];
                posAlta = i;
            }
            if (notas[i] < notaBaja) {
                notaBaja = notas[i];
                posBaja = i;
            }
            if (notas[i] >= 3.0) {
                aprobados = aprobados + 1;
            } else {
                reprobados = reprobados + 1;
            }
        }
        
        System.out.println("Promedio del grupo: " + promedio);
        System.out.println("Nota mas alta: " + notaAlta + " en la posicion: " + posAlta);
        System.out.println("Nota mas baja: " + notaBaja + " en la posicion: " + posBaja);
        System.out.println("Estudiantes aprobados: " + aprobados);
        System.out.println("Estudiantes reprobados: " + reprobados);
        
     
    }
}