public class Libro {
    private String titulo, autor;
    private boolean disponible;

    public Libro (String titulo, String autor){
    this.titulo=titulo;
    this.autor=autor;
    this.disponible=true;
}
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public boolean getDisponible(){
        return this.disponible;
    }

    public void setTitulo(String titulo){
        if (titulo == null || titulo.trim().isEmpty()) {
            System.out.println("Lo siento, el título no puede estar vacío.");
        this.titulo = "Título Desconocido";
        mostrarInfo();
        } else {
        this.titulo = titulo;
        }
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public void setDisponible(boolean disponible){
        this.disponible=disponible;
    }



    public String getEstado(){
if (disponible) {
    return "Disponible";
} else {
    return "Prestado";
}
    }

    public void mostrarInfo(){
        System.out.println("Titulo:"+titulo);
        System.out.println("Autor:"+autor);
        System.out.println("Estado: "+ getEstado());
    }

    public void prestar(){
        if (disponible) {
            disponible = false;
            System.out.println("El libro '" + titulo + "'acaba de ser prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' ya se encuentra prestado actualmente.");
        }
    }

    public void devolver(){
        if (!disponible) {
            disponible = true;
            System.out.println("El libro '" + titulo + "' acaba de ser devuelto y ya está disponible.");
        } else {
            System.out.println("El libro '" + titulo + "' ya estaba en la biblioteca.");
        }
    }
    }
