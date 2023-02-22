package SegundaEv.Programacion.Ejercicio19;

import java.awt.*;

/*
Juego en el que dos jugadores se enfrentan en una partida de tenis, en la que se mueven sus raquetas
 */

public class App extends Frame implements Runnable {
    public static final int ARRIBA = -1;
    public static final int ABAJO = 1;
    public static final int TIEMPO = 10;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Pelota pelota;
    Raqueta r1, r2;

    public static void main(String[] args) {
        App app = new App();
    }

    public App() {
        super("Juego del tenis");
        pack();
        setSize(500, 500);
        setVisible(true);

        //Método init
        pelota = new Pelota();
        r1 = new Raqueta(20, "Nadal");
        r2 = new Raqueta(470, "Alcaraz");

        imagen = this.createImage(500, 500);
        noseve = imagen.getGraphics();

        //Método start
        animacion = new Thread(this);
        animacion.start();

    }

    public void paint(Graphics g) {
        noseve.setColor(Color.black);
        noseve.fillRect(0, 0, 500, 500);

        noseve.setColor(Color.white);
        noseve.drawString(r1.nomTenista + " (" + r1.getPuntos() + ") - (" + r2.getPuntos() + ") " + r2.nomTenista, 200, 60);
        pelota.paint(noseve);
        r1.paint(noseve);
        r2.paint(noseve);

        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void run() {
        while (true) {
            pelota.update(r1, r2);
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean keyDown(Event e, int key) {
        switch (key) {
            case 119:
                r1.update(ARRIBA);
                break;
            case 115:
                r1.update(ABAJO);
                break;
            case 1004:
                r2.update(ARRIBA);
                break;
            case 1005:
                r2.update(ABAJO);
                break;
            case 27:
                System.exit(0);
                break;
        }
        return true;
    }
}
