public class App {
    public static void main(String[] args) throws Exception {
       
        Libro l1= new Libro("gabriel garcia", "cien años de soledad");
        Libro l2= new Libro("george orwell", "Revelion en la granja");
        Libro l3= new Libro("Don Quijote", "Miguel de Cervantes");
        Libro l4= new Libro("La Odisea", "Homero");
        Libro l5= new Libro("Agustina Bazterrica","Cadaver exquisito");
        
        
        Lector e1=new Lector("Brayan", "6723");
        Lector e2=new Lector("Juan", "5734");
        Lector e3=new Lector("Yurladis", "2353");
        Lector e4=new Lector("Sofia", "8934");
        Lector e5=new Lector("Manuel", "1247");
    

e1.tomarPrestado(l1);
e2.tomarPrestado(l2);
e3.tomarPrestado(l3);
e4.tomarPrestado(l4);
e5.tomarPrestado(l5);

System.out.println("-------");
e4.tomarPrestado(l1);

System.out.println("--------");
e1.regresarLibro();
e4.regresarLibro();
System.out.println("--------");
e4.tomarPrestado(l1);
System.out.println("---informacion----");
System.out.println("---lector #1----");
e1.mostrarEstado();
System.out.println("---lector #2---");
e2.mostrarEstado();
System.out.println("---lector #3---");
e3.mostrarEstado();
System.out.println("---lector #4---");
e4.mostrarEstado();
System.out.println("---lector #5---");
e5.mostrarEstado();
    }
    }

