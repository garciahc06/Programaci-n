package SegundaEv.Programacion.Ejercicio05;

//Tenmos 48 bolas en una tabla 8x6 y queremos que se vayan sacando aleatoriamente sin repetir.
//Para ello, intercambiaremos el valor de la bola que ha salido por el último de la tabla y disminuiremos el tamaño de la tabla en 1.
public class Bombo {
    public static final int NUM_BOLAS = 48;  //Static es un atributo de clase, no de objeto. Final es una constante.
    public int[] bombo;
    public int bolasQuedan;

    public Bombo() {
        bombo = new int[48];
        bolasQuedan = NUM_BOLAS;
        for (int i = 0; i < NUM_BOLAS; i++) {
            bombo[i] = i + 1;
        }
    }

    public int sacarBola(){
        int bolaSacada = (int) (Math.random() * bolasQuedan);
        int bola = bombo[bolaSacada];
        bombo[bolaSacada] = bombo[bolasQuedan - 1];
        bolasQuedan--;
        return bola;
    }
}
