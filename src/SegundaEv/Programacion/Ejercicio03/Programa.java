package SegundaEv.Programacion.Ejercicio03;

public class Programa {
    public static void main(String[] args) {
        Perro perro1;
        Mono mono1;


        perro1 = new Perro(152432, "Portugal", "jacobo", "guau guau", "hembra", "pastor aleman");
        mono1 = new Mono(9223243, "España", "Andres", "uhahaha", "hombre", "humano", "inutil",  false);

        perro1.hablar();
        mono1.hablar();
    }
}
