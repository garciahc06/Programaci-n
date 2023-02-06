package SegundaEv.Programacion.Ejercicio13;

import java.awt.*;

public class Rectangulo {
    public int posX, posY, anchura, altura;
    public int topeDcha, topeIzq, topeArriba, topeAbajo;
    Color color;
    int direccion;
    public static final int DERECHA = 0;
    public static final int ABAJO = 1;
    public static final int IZQUIERDA = 2;
    public static final int ARRIBA = 3;

    public Rectangulo(int px, int py, int an, int al, Color c) {
        posX = px;
        posY = py;
        altura = al;
        anchura = an;
        color = c;
        direccion = DERECHA;
        topeDcha = px + 20;
        topeIzq = px;
        topeArriba = py;
        topeAbajo = py + 20;
    }

    public void dibujar(Graphics gg) {
        gg.setColor(color);
        gg.fillRect(posX, posY, anchura, altura);
    }

    public void actualizar() {
        switch (direccion) {
            case DERECHA:
                posX++;
                if (posX == topeDcha) direccion = ABAJO;
                break;
            case ABAJO:
                posY++;
                if (posY == topeAbajo) direccion = IZQUIERDA;
                break;
            case IZQUIERDA:
                posX--;
                if (posX == topeIzq) direccion = ARRIBA;
                break;
            case ARRIBA:
                posY--;
                if (posY == topeArriba) direccion = DERECHA;
                break;
        }
    }
}
