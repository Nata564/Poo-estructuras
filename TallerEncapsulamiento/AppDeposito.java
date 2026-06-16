public class AppDeposito {
    public static void main(String[] args) {
        System.out.println("--------EJERCICIO #3 (DEPOSITO DE AGUA)--------");

DepositoAgua depo1= new DepositoAgua(100);
DepositoAgua depo2= new DepositoAgua(50);

depo1.setDepositoDesborde(depo2);

System.out.println("--Estado del deposito--");
System.out.println("deposito #1");
depo1.mostrarEstado();
System.out.println("deposito #2");
depo2.mostrarEstado();
System.out.println("--Agregando agua--");
depo1.agregarAgua(60);
depo1.agregarAgua(80);
System.out.println("--Estado final--");
System.out.println("deposito #1");
depo1.mostrarEstado();
System.out.println("deposito #2");
depo2.mostrarEstado();
System.out.println("--Quitando agua--");
depo1.quitarAgua(70);
System.out.println("deposito #1");
depo1.mostrarEstado();
depo2.quitarAgua(40);
System.out.println("deposito #2");
depo2.mostrarEstado();
    }
}
