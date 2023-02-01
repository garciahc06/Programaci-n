package SegundaEv.Programacion.Ejercicio02;

public class Chalet extends Casa {
    int metros_jardin;
    boolean piscina;

    public Chalet(String direc, int metros, int habitaciones, String pais, int jardin, boolean pisci) {
        super(direc, metros, habitaciones, pais);
        metros_jardin = jardin;
        piscina = pisci;
    }

    public void mostrar() {
        System.out.print("El chalet tiene como direccion: " + direccion + ", tiene " + num_metros + " metros^2 y cuenta con " + num_habitaciones + " habitaciones y está localizada en " + pais + ".");
        if (piscina) {
            System.out.println(" Esto es un chalet con piscina");
        } else {
            System.out.println(" Esto es un chalet que no tiene piscina");
        }
    }
}

