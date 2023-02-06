package SegundaEv.Programacion.Ejercicio14;

import java.applet.Applet;
import java.awt.*;
import java.util.ArrayList;

public class Jugando extends Applet implements Runnable {
    public static final int NUM_PEL = 5;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    List pelotas;

    public void init() {
        this.setSize(400, 400);

        imagen = createImage(400, 400);
        noseve = imagen.getGraphics();
        pelotas = new List();
        for (int i = 1; i < NUM_PEL; i++)
            pelotas.add(String.valueOf(new Pelota((int) (Math.random()* 40) + 10)));
    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 400, 400);
        for (int i = 0; i < pelotas.size(); i++)
            pelotas.get(i).paint(noseve);
        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void run() {
        while (true) {
            for(int i = 0; i < pelotas.size(); i++)
                pelotas.get(i).update();
            repaint();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
            }
        }
    }
}
