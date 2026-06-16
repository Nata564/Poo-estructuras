public class AppLibro {
    public static void main(String[] args) {
        System.out.println("--------EJERCICIO #1 (LIBRO)--------");

        Libro libro1= new Libro("revelion en la granja", "george orwell");
        Libro libro2=new Libro("cien años de soledad", "gabriel garcia marquez");
System.out.println("--Información del libro--");
System.out.println("Libro 1");
libro1.mostrarInfo();
System.out.println("Libro 2");
libro2.mostrarInfo();
System.out.println("--Prestar un libro--");
libro1.prestar();
System.out.println("--Información del libro--");
libro1.mostrarInfo();
System.out.println("--Devolución--");
libro1.devolver();
System.out.println("--Información del libro--");
libro1.mostrarInfo();

System.out.println("--Título vacío--");
libro2.setTitulo("  ");
}
    }

    
