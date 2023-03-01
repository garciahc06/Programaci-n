package SegundaEv.Programacion.Ejercicio21;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Juego extends Frame implements Runnable {
    public static boolean fin = false;
    public static int cronometro = 0;
    public static final int TIEMPO = 30;
    Graphics noseve;
    Image imagen;
    Thread animacion;
    Dinusaurio dino;
    List<Obstaculos> obstaculos;
    public static int score = 0;
    public static boolean inicio = true;


    public static void main(String[] args) {
        Juego juego = new Juego();
    }

    public Juego() {
        super("Juego Dinosaurio");
        pack();
        setSize(500, 500);
        setVisible(true);

        //Método init
        dino = new Dinusaurio();
        obstaculos = new ArrayList<Obstaculos>();
        obstaculos.add(new Obstaculos());

        imagen = createImage(500, 500);
        noseve = imagen.getGraphics();

        //Método start
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.black);
        noseve.fillRect(0, 0, 500, 500);
        noseve.setColor(Color.white);
        noseve.fillRect(0, 400, 500, 5);

        //Dibujamos el texto de inicio
        if (inicio) {
            noseve.setColor(Color.red);
            noseve.setFont(new Font("Arial", Font.BOLD, 20));
            noseve.drawString("Clica para empezar", 165, 200);
        }

        //Dibujamos el dinosaurio
        dino.paint(noseve);

        //Dibujamos los obstaculos
        for (int i = 0; i < obstaculos.size(); i++) {
            obstaculos.get(i).paint(noseve);
        }

        // Dibujamos el score
        noseve.setColor(Color.white);
        noseve.setFont(new Font("Arial", Font.BOLD, 20));
        noseve.drawString("Score: " + score, 10, 50);

        //Game over
        if (fin) {
            noseve.setColor(Color.red);
            noseve.setFont(new Font("Arial", Font.BOLD, 40));
            noseve.drawString("GAME OVER", 140, 200);
        }

        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void run() {
        do {

            if (inicio) {
                repaint();
                try {
                    Thread.sleep(TIEMPO);
                } catch (Exception e) {
                }
                continue;
            }


            dino.update();
            for (int i = 0; i < obstaculos.size(); i++) {
                obstaculos.get(i).update();
            }

            cronometro += TIEMPO;
            if (cronometro == 1000) {
                obstaculos.add(new Obstaculos());
                cronometro = 0;
            }
            //score
            if (obstaculos.get(0).x == 100) {
                score++;
            }

            if (obstaculos.get(0).x < 0) {
                obstaculos.remove(0);
            }


            for (int i = 0; i < obstaculos.size(); i++) {
                if (dino.intersects(obstaculos.get(i))) {
                    fin = true;
                    repaint();
                    animacion.stop();
                }
            }

            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch (Exception e) {
            }
        } while (true);
    }

    public boolean keyDown(Event e, int key) {
        if (key == 27) System.exit(0);
        if (key == 32) dino.saltar();
        return true;
    }

    public boolean mouseDown(Event e, int x, int y) {
        if (inicio) {
            inicio = false;
        }
        return true;
    }
}
