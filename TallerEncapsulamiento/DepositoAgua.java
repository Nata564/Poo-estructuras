public class DepositoAgua {
    private double capacidad, volumenActual;
    private DepositoAgua depositoDesborde;

public DepositoAgua(double capacidad) {
        if (capacidad <= 0) {
            System.out.println("La capacidad debe ser mayor a 0. Se le va a asignar 100 de capacidad");
            this.capacidad = 100.0;
        } else {
            this.capacidad = capacidad;
        }
        this.volumenActual = 0;
        this.depositoDesborde = null;
    }

    public double getCapacidad() {
        return this.capacidad;
    }
    public double getVolumenActual() {
        return this.volumenActual;
    }
    public DepositoAgua getDepositoDesborde() {
        return this.depositoDesborde;
    }


    public void setCapacidad(double capacidad) {
        if (capacidad <= 0) {
            System.out.println("La capacidad debe ser mayor a 0.");
        } else {
            this.capacidad = capacidad;
        }
    }

    public void setVolumenActual(double volumenActual) {
        if (volumenActual > this.capacidad) {
            this.volumenActual = this.capacidad;
        } else if (volumenActual < 0) {
            this.volumenActual = 0;
        } else {
            this.volumenActual = volumenActual;
        }
    }

    public void setDepositoDesborde(DepositoAgua depositoDesborde) {
        this.depositoDesborde = depositoDesborde;
    }

    public void mostrarEstado() {
        double espacioLibre = capacidad - volumenActual;
        System.out.println("Capacidad Máxima: " + capacidad + " L");
        System.out.println("Volumen Actual  : " + volumenActual + " L");
        System.out.println("Espacio Libre   : " + espacioLibre + " L");
    }

    public void agregarAgua(double cantidad) {
        double espacioLibre;
        if (volumenActual + cantidad <= capacidad) {
            volumenActual += cantidad;
            System.out.println("Se agregaron "+cantidad+" L.");
        } else {
            espacioLibre = capacidad - volumenActual;
            double sobrante = cantidad - espacioLibre;
            volumenActual = capacidad;
            System.out.println("¡ALERTA! Al añadirle "+cantidad+" el depósito se desbordo. Sobran: " + sobrante + " L.");
            
            if (depositoDesborde != null) {
                System.out.println("Enviando el sobrante al depósito de desborde");
                depositoDesborde.agregarAgua(sobrante);
            } else {
                System.out.println("ALERTA: El depósito de desborde no esta conectado.");
            }
        }
    }


    public void quitarAgua(double cantidad) {
        if (volumenActual - cantidad >= 0) {
            volumenActual -= cantidad;
            System.out.println("Se quitaron " + cantidad +" L.");
        } else {
            System.out.println("Lo siento no hay suficiente agua. El depósito quedó vacío");
            volumenActual = 0;
        }
    }
}

