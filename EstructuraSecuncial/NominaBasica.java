import java.util.Scanner;

public class NominaBasica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese las horas trabajadas: ");
        int horas = sc.nextInt();

        System.out.print("Ingrese el valor por hora: ");
        double valorHora = sc.nextDouble();

        double salarioBruto = horas * valorHora;

        
        double descuentoSS = salarioBruto * 0.08;
        double retencion = salarioBruto * 0.05;

       
        double salarioNeto = salarioBruto - descuentoSS - retencion;

        
        System.out.println("\n===== NÓMINA =====");
        System.out.println("Empleado:           " + nombre);
        System.out.println("Horas trabajadas:   " + horas);

        System.out.printf("Salario bruto:      $ %.2f%n", salarioBruto);
        System.out.printf("Descuento SS (8%%): $ %.2f%n", descuentoSS);
        System.out.printf("Retención (5%%):    $ %.2f%n", retencion);
        System.out.printf("Salario neto:       $ %.2f%n", salarioNeto);

        sc.close();
    }
}