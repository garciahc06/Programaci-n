package SegundaEv.Programacion.Ejercicio02;

public class Casa {
    String direccion;
    int num_metros;
    int num_habitaciones;
    String pais;

    public Casa(String direc, int metros, int habitaciones, String pais){
        direccion = direc;
        num_metros = metros;
        num_habitaciones = habitaciones;
        this.pais = pais;
    }
    public void mostrar(){
        System.out.println("La casa tiene como direccion: " + direccion + ", tiene " + num_metros + " metros^2 y cuenta con " + num_habitaciones + " habitaciones y está localizada en " + pais + "." );
    }
}
