public class App {
    public static void main(String[] args) throws Exception {
        Libro libro1= new Libro("gabriel garcia", "cien años de soledad");
        Lector lector1=new Lector("meteo", "67235752");
    lector1.tomarPrestado(libro1);
   lector1.mostrarEstado();
    }
    }

