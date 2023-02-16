package SegundaEv.Programacion.Ejercicio13;

import org.w3c.dom.css.Rect;

import java.applet.Applet;
import java.awt.*;

public class Mondrian2 extends Applet implements Runnable {
    public static final int NUM_RECT = 9;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Rectangulo[] vector;
    int[] posicionesX = {0, 250, 80, 80, 100, 80, 200, 0, 200};
    int[] posicionesY = {0, 0, 160, 220, 10, 100, 0, 110, 55};
    int[] anchuras = {90, 40, 100, 220, 90, 110, 45, 70, 60};
    int[] alturas = {90, 190, 120, 90, 80, 90, 45, 200, 135};
    Color[] colores = {Color.yellow, Color.yellow, Color.yellow, Color.blue, Color.blue, Color.lightGray, Color.red, Color.pink, Color.green};

    public void init() {
        setSize(320, 350);
        imagen = createImage(320, 350);
        noseve = imagen.getGraphics();
        vector = new Rectangulo[NUM_RECT];
        for (int i = 0; i < NUM_RECT; i++)
            vector[i] = new Rectangulo(posicionesX[i], posicionesY[i], anchuras[i], alturas[i], colores[i]);
    }

    public void start() {
        animacion = new Thread();
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 320, 350);
        for (int i = 0; i < NUM_RECT; i++)
            vector[i].dibujar(noseve); //Llama al método dibujar de la clase Rectangulo
        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void run() {
        while (true) {
            for (int i = 0; i < NUM_RECT; i++)
                vector[i].actualizar();
            repaint();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
            }
        }

    }
}
