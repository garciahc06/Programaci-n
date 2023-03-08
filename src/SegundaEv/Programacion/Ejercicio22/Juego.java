package SegundaEv.Programacion.Ejercicio22;

import java.awt.*;
import java.util.*;

public class Juego extends Frame implements Runnable {
    public static final int TIEMPO = 30;
    private static int cronometro = 0;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Pou pou;
    ArrayList<Plataforma> plataformas;
    public static void main(String[] args) {
        Juego juego = new Juego();
    }

    public Juego() {
        super("Juego");
        pack();
        setSize(500, 500);
        setVisible(true);

        // Método init
        pou = new Pou(215, 200 );
        plataformas = new ArrayList<Plataforma>();
        plataformas.add(new Plataforma((int) (Math.random()*400) , 0 ));

        imagen = createImage(500, 500);
        noseve = imagen.getGraphics();

        // Método start
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.black);
        noseve.fillRect(0, 0, 500, 500);

        pou.paint(noseve);
        for (int i = 0; i < plataformas.size(); i++) {
            plataformas.get(i).paint(noseve);
        }

        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void run() {
        while (true) {
            cronometro += TIEMPO;
            if (cronometro == 1000) {
                plataformas.add(new Plataforma((int) (Math.random()*400), -25 ));
                cronometro = 0;
            }
            pou.update();
            for (int i = 0; i < plataformas.size(); i++) {
                plataformas.get(i).update();
            }

            for (int i = 0; i < plataformas.size(); i++) {
                if (pou.intersects(plataformas.get(i))) {
                    pou.setPosY(plataformas.get(i).getPosY() - 25);
                    pou.setVelY();

                }
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }
    }

    public boolean keyDown(Event e, int key){
        if ( key == 27) {
            System.exit(0);
        }
        if ( key == 32) {
            pou.salto();
        }
        if (key == 1007) {
            pou.moverDcha();
        }
        if (key == 1006) {
            pou.moverIzq();
        }
        return true;
    }

}
