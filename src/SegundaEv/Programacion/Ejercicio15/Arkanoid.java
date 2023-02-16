package SegundaEv.Programacion.Ejercicio15;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Arkanoid extends Frame implements Runnable {
    public static final int IZQUIERDA = -1;
    public static final int DERECHA = 1;
    public static final int COLS = 30;
    public static final int FILAS = 5;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Pelota pelota;
    List<Ladrillo> ladrillos;
    Raqueta raqueta;
    Color[] colores = {Color.MAGENTA, Color.GREEN, Color.ORANGE, Color.BLUE, Color.LIGHT_GRAY};
    int quedan;
    int velocidad;

    public static void main(String[] args) {
        Arkanoid app = new Arkanoid();

    }

    public Arkanoid() {
        super("Juego Alcanoid");

        pack();
        setSize(600, 600);
        setVisible(true);


        //init
        pelota = new Pelota();
        ladrillos = new ArrayList<Ladrillo>();
        for (int i = 0; i < FILAS; i++)
            for (int j = 0; j < COLS; j++)
                ladrillos.add(new Ladrillo((j * Ladrillo.ALTURA) + 10, (i * Ladrillo.ANCHURA), colores[i]));
        raqueta = new Raqueta();

        imagen = this.createImage(600, 600);
        noseve = imagen.getGraphics();

        //start
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.black);
        noseve.fillRect(0, 0, 600, 600);

        pelota.paint(noseve);

        if (animacion.isAlive()){
            noseve.setColor(Color.white);
            noseve.drawString("Pulsa cualquier tecla para jugar", 235, 450);
            noseve.drawString("la barra espaciadora", 230, 475);
        }
        for(Ladrillo ld : ladrillos)
            ld.paint(noseve);
        raqueta.paint(noseve);
        quedan = 60 - ladrillos.size();

        if (pelota.y >= 600){
            noseve.setColor(Color.white);
            noseve.drawString("DEFEAT", 260, 300);
            noseve.drawString("SCORE" + String.valueOf(quedan), 270, 340);
            noseve.drawString("Para volver a jugar, pulsa:", 215, 450);
            noseve.drawString("la barra espaciadora", 230, 475);
        }
        if (ladrillos.isEmpty()){
            noseve.setColor(Color.white);
            noseve.drawString("YOU WIN", 260, 300);
            noseve.drawString("SCORE", 270, 340);
            animacion.interrupt();
        }
        if (animacion.isAlive()){
            noseve.setColor(Color.white);
            noseve.drawString("Score: " + String.valueOf(quedan), 10, 575);
        }
        g.drawImage(imagen, 0 , 0, this);

    }

    public void update(Graphics g) {
        paint(g);
    }

    public void run() {
        while (true) {
            if(pelota.intersects(raqueta)){
                pelota.velY *= -1;
                if(pelota.velX > 0 && pelota.x - raqueta.x < pelota.width/2)
                    pelota.velX *= -1;
                if(pelota.velX < 0 && pelota.x - raqueta.x > raqueta.width-pelota.width/2)
                    pelota.velX *= -1;

            }
            for(Ladrillo ld : ladrillos)
                if(pelota.intersects(ld)){
                    pelota.velY *= -1;
                    ladrillos.remove(ld);
                    switch(ladrillos.size()){
                        case 50:
                            velocidad = 5;
                            raqueta.width -=10;
                            break;
                        case 40:
                            velocidad = 4;
                            raqueta.width -=10;
                            break;
                        case 30:
                            velocidad = 3;
                            raqueta.width -=10;
                            break;
                        case 20:
                            velocidad = 2;
                            raqueta.width -=10;
                            break;
                        case 10:
                            velocidad = 1;

                            break;
                    }
                    break;
                }
            pelota.update();
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
    }
        public void startNewGame(){
        if(!animacion.isAlive())
            animacion.start();
        ladrillos.clear();
        velocidad = 6;
        pelota = new Pelota();
        for(int i = 0; i < 5; i++)
            for(int j = 0; j < 10; j++)
                ladrillos.add(new Ladrillo(j*60, i*30+1, colores[i]));
        raqueta = new Raqueta();
        this.setSize(600, 600);

        imagen = this.createImage(600, 600);
        noseve = imagen.getGraphics();
    }
    public boolean keyDown(Event ev, int tecla){
       //método para mover la raqueta con las teclas 1006 izda y 1007 dcha
       if(ev.key ==  1006 && raqueta.x > 0)
           raqueta.update(IZQUIERDA);
       if(ev.key == 1007 && raqueta.x < 600 - raqueta.width)
           raqueta.update(DERECHA);
       if(ev.key == 32)//barra espaciadora
                startNewGame();

        return true;
    }
    public boolean mouseMove(Event ev, int x, int y){
        raqueta.x = x - raqueta.width/2;

        return true;
    }

    public boolean handleEvent(Event e) {
        if (e.id == Event.WINDOW_DESTROY) {
            System.exit(0);
        }
        return super.handleEvent(e);
    }
}

