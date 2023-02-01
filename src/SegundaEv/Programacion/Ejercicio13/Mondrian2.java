package SegundaEv.Programacion.Ejercicio13;

import java.applet.Applet;
import java.awt.*;

public class Mondrian2 extends Applet implements Runnable {
    public static final int DERECHA = 0;
    public static final int ABAJO = 1;
    public static final int IZQUIERDA = 2;
    public static final int ARRIBA = 3;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    public void init() {

    }

    public void start() {
        animacion = new Thread();
        animacion.start();
    }

    public void paint(Graphics g) {
    }

    public void update() {

    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
            }
        }

    }
}
