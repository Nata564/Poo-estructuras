public class AppVuelo {
    public static void main(String[] args) {
    
System.out.println("--------EJERCICIO #2 (VUELO)--------");

    Vuelo vuelo1=new Vuelo("AV9401", "Bogotá", "Medellín", 120);
    Vuelo vuelo2=new Vuelo("LA4210", "Cali", "Cartagena", 80);


    System.out.println("--Información de los vuelos--");
    System.out.println("vuelo #1");
    vuelo1.mostrarInfo();
    System.out.println("vuelo #2");
    vuelo2.mostrarInfo();
System.out.println("--Embarcando pasajeros--");
vuelo1.embarcar(100);
vuelo2.embarcar(87);
System.out.println("--Desembarcando pasajeros--");
vuelo1.desembarcar(105);
vuelo2.desembarcar(33);
System.out.println("--Estado actual del vuelo--");
System.out.println("vuelo #1");
vuelo1.mostrarInfo();
System.out.println("vuelo #2");
vuelo2.mostrarInfo();

}
}
