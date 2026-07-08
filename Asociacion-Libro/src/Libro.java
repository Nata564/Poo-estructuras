public class Libro {
    private String titulo, autor;
    private boolean disponible;

public Libro (){
this.disponible=true;
}

public Libro(String autor,String titulo){
this.autor=autor;
this.titulo=titulo;
    this.disponible=true;
}

public Libro(String titulo, String autor,boolean disponible){
this.autor=autor;
this.titulo=titulo;
    this.disponible=disponible;

}

public String getTitulo(){
return this.titulo;
}
public String getAutor(){
    return this.autor;
}
public void setAutor(String autor){
    this.autor=autor;
}

public boolean isDisponible(){ //get disponible
    return this.disponible;
}
public void setDisponible(boolean disponible){
    this.disponible=disponible; 
}

public void setTitulo(String titulo){
    if ((titulo!= null) && !titulo.isEmpty()){
        this.titulo=titulo;
    }else{
        System.out.println("No se encontro un titulo");
    }
}

public void mostrarInfo(){
    System.out.println("Titulo: "+titulo);
    System.out.println("Autor:"+autor);
    System.out.println("Disponible: "+ (disponible ? "Si" : "No"));
}
     
public boolean prestar(){
 if (disponible){
    disponible=false;
    System.out.println("El libro '"+titulo+"'fue prestado");
    return true;
 }else{
System.out.println("El libro '"+titulo+"' ya esta prestado");
return false;
 }
}

public void devolver(){
    disponible=true;
    System.out.println("El libro '" + titulo +"' ya fue devuelto");
}




}
