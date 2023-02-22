package SegundaEv.Programacion.Ejercicio20;

import java.awt.*;
/*
Juego en el que una pelota se mueve de forma aleatoria por la pantalla, y al hacerle click, esta se divide
en 2, cogiendo colores y velocidad distintas. La pelota rebota constantemente con los bordes de la pantalla
 */
public class Juego extends Frame implements Runnable {
    public static final int TIEMPO = 20;
    Graphics noseve;
    Image imagen;
    Thread animacion;
    Pelota pelota;

    public static void main(String[] args) {
        Juego juego = new Juego();
    }
    public Juego(){
        super("Juego de pelotas");
        pack();
        setSize(500, 500);
        setVisible(true);

        //Método init
        pelota = new Pelota(0, 0, 50, 50);

        imagen = this.createImage(500, 500);
        noseve = imagen.getGraphics();

        //Método start
        animacion = new Thread(this);
        animacion.start();
    }
    public void paint(Graphics g){
        noseve.setColor(Color.black);
        noseve.fillRect(0, 0, 500, 500);

        pelota.paint(noseve);

        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g){
        paint(g);
    }

    public void run() {
        while (true) {
            pelota.update();
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch (InterruptedException e) {}
        }
    }

}
