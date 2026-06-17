public class Vuelo {
    private String numero, origen, destino;
    private int ocupacion, capacidadMaxima;

    public Vuelo(String numero, String origen, String destino, int capacidadMaxima){
        this.numero=numero;
        this.origen=origen;
        this.destino=destino;
        this.ocupacion=0;
        this.capacidadMaxima=capacidadMaxima;
    }

public String getNumero(){
    return this.numero;
}
public String getOrigen(){
    return this.origen;
}
public String getDestino(){
    return this.destino;
}
public int getOcupacion(){
    return this.ocupacion;
}
public int getCapacidadMaxima(){
    return this.capacidadMaxima;
}

public void setNumero(String numero){
    this.numero=numero;
}
public void setOrigen(String origen){
    this.origen=origen;
}
public void setDestino(String destino){
    this.destino=destino;
}
public void setCapacidadMaxima(int capacidadMaxima){
    if (capacidadMaxima<=0){
        System.out.println("Lo sentimos, la capacidad debe ser mayor a 0");
    }else{
    this.capacidadMaxima=capacidadMaxima;
}
}
public void setOcupacion(int ocupacion){
    if(ocupacion<0 || ocupacion>capacidadMaxima){
        System.out.println("Lo siento, la ocupación tiene que ser mayor a 0 y no mayor a la capacidad del avión");
    } else{
        this.ocupacion=ocupacion;
    }
}

public void mostrarInfo(){
    System.out.println("Numero de vuelo: "+ numero);
    System.out.println("Lugar de origen: "+origen);
    System.out.println("Destino: "+destino);
    System.out.println("Pasajeros a bordo: "+ocupacion);
    System.out.println("Capacidad maxima: "+capacidadMaxima);
    System.out.println("Asientos libres: "+(capacidadMaxima-ocupacion));
}

public void embarcar(int pasajeros){
    if(ocupacion+pasajeros<capacidadMaxima){
        ocupacion+=pasajeros;
        System.out.println("Embarcaron "+pasajeros+" pasajeros");
    }else{
        double espacioLibre= capacidadMaxima-ocupacion;
        double sobrante = pasajeros-espacioLibre;
        System.out.println("Lo sentimos solo tenemos " + (capacidadMaxima-ocupacion)+" asientos disponibles, por lo que quedan " +sobrante+" pasajeros fuera de este vuelo" );
    this.ocupacion+=espacioLibre;
    }
}

public void desembarcar(int pasajeros){
    if(ocupacion-pasajeros>=0){
        ocupacion-=pasajeros;
        System.out.println("Desembarcaron "+pasajeros+" pasajeros");
    }else{
        System.out.println("Lo siento, pero no se pueden desembarcar mas pasajeros de los que estan a bordo");
    }
}

}