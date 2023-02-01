package SegundaEv.Programacion.Ejercicio03;

public class Mono extends Animal {
    String habilidades;
    boolean cola;

    public Mono(int cod, String pais, String nom, String onoma, String sex, String r, String h, boolean c){
        super(cod, nom, onoma, sex);
        habilidades = h;
        cola = c;
    }

    public void hablar(){
        System.out.println("Este mono soy yo xd");
    }
}
