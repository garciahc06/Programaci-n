package SegundaEv.Estudio;
//Calcular los puntos en el juego de cartas, el giñote
public class Estudio {
    public static void main(String[] args) {
        int buenas = 0;
        int malas = 80;
        if (malas > 50) {
            buenas = malas - 50;
            malas = 0;
        }
        System.out.println("Buenas: " + buenas);
    }
}
