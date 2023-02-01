package SegundaEv.Programacion.Ejercicio13;

import java.applet.Applet;
import java.awt.*;

public class Mondrian extends Applet implements Runnable {
    public static final int DERECHA = 0;
    public static final int ABAJO = 1;
    public static final int IZQUIERDA = 2;
    public static final int ARRIBA = 3;
    int direccion;
    int posX = 80;
    int posY = 100;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    public void init() {
        setSize(320, 350);
        direccion = DERECHA;
        imagen = createImage(320,350);
        noseve = imagen.getGraphics();
    }

    public void start() {
        animacion = new  Thread();
        animacion.start(); //Llama al método run
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 320, 350);
        noseve.setColor(Color.YELLOW);
        noseve.fillRect(0, 0, 90, 90);
        noseve.fillRect(250, 0,40,190);
        noseve.fillRect(80,160,100,120);
        noseve.setColor(Color.BLUE);
        noseve.fillRect(80,220,220,90);
        noseve.fillRect(100,10,90,80);
        noseve.setColor(Color.LIGHT_GRAY);
        noseve.fillRect(posX,posY,110,90);
        noseve.setColor(Color.RED);
        noseve.fillRect(200,0,45,45);
        noseve.fillRect(0,110,70,200);
        noseve.setColor(Color.MAGENTA);
        noseve.fillRect(200,55,60,135);
        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g){
        paint(g);
    }

    public void run() {
        switch(direccion){
            case DERECHA:
                posX++;
                if (posX == 100) direccion = ABAJO;
                break;
            case ABAJO:
                posY++;
                if (posY == 120) direccion = IZQUIERDA;
                break;
            case IZQUIERDA:
                posX--;
                if (posX == 80) direccion = ARRIBA;
                break;
            case ARRIBA:
                posY--;
                if (posY == 100) direccion = DERECHA;
                break;
        }
        repaint();
        while (true) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {}
        }
    }
}

