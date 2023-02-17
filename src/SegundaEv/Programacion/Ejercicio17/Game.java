package SegundaEv.Programacion.Ejercicio17;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Game extends Frame implements Runnable {
    int score = 0;
    boolean inicio = false;
    boolean fin = false;
    int cronometro = 0;
    public static final int TIEMPO = 30;
    public static int IZQUIERDA = 0;
    public static int DERECHA = 1;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Gun gun;
    List<Bullets> bullets;
    List<Spaceships> spaceships;

    public static void main(String[] args) {
        Game app = new Game();
    }

    public Game() {
        super("Game");
        pack();
        this.setSize(500, 500);
        this.setVisible(true);

        //Método init
        gun = new Gun();
        bullets = new ArrayList<Bullets>();
        spaceships = new ArrayList<Spaceships>();

        for (int i = 0; i < 5; i++)
            spaceships.add(new Spaceships());

        imagen = this.createImage(500, 500);
        noseve = imagen.getGraphics();

        //Método start
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.black);
        noseve.fillRect(0, 0, 500, 500);

        gun.paint(noseve);
        for (int i = 0; i < bullets.size(); i++) {
            bullets.get(i).paint(noseve);
        }
        for (int i = 0; i < spaceships.size(); i++) {
            spaceships.get(i).paint(noseve);
        }


        //Cuando se acabe el juego se muestra el mensaje GAME OVER
        if (fin) {
            noseve.setColor(Color.red);
            noseve.setFont(new Font("Arial", Font.BOLD, 50));
            noseve.drawString("GAME OVER", 100, 250);
        }

        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void run() {
        while (true) {
            cronometro += TIEMPO;
            if (cronometro >= 1000) {
                for (int i = 0; i < 2; i++)
                    spaceships.add(new Spaceships());
                cronometro = 0;
            }
            for (int i = 0; i < bullets.size(); i++) {
                bullets.get(i).update();
                if (bullets.get(i).y <= 0)
                    bullets.remove(i);
            }
            for (int i = 0; i < spaceships.size(); i++)
                spaceships.get(i).update();

            for(int i = 0; i < bullets.size(); i++) {
                for(int j = 0; j < spaceships.size(); j++) {
                    if(bullets.get(i).intersects(spaceships.get(j))) {
                        spaceships.remove(j);
                        bullets.remove(i);
                        break;
                    }
                }
            }

            //si una nave toca el suelo, se acaba el juego
            for (int i = 0; i < spaceships.size(); i++)
                if (spaceships.get(i).y >= 500) {
                    fin = true;
                    repaint();
                    animacion.stop();
                    break;
                }
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch (InterruptedException e) {}
        }
    }

    public boolean keyDown(Event e, int key) {;
        if (key == 27)
            System.exit(0);
        return true;
    }

    public boolean mouseMove(Event e, int x, int y) {
        gun.update(x);
        return true;
    }

    public boolean mouseDown(Event e, int x, int y) {
        bullets.add(new Bullets(x));
        return true;
    }
}
