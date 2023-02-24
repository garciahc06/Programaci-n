package SegundaEv.Programacion.Ejercicio20;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
/*
Juego en el que una pelota se mueve de forma aleatoria por la pantalla, y al hacerle click, esta se divide
en 2, cogiendo colores y velocidad distintas. La pelota rebota constantemente con los bordes de la pantalla
 */
public class Juego extends Frame implements Runnable {
    public static final int TIEMPO = 20;
    Graphics noseve;
    Image imagen;
    Thread animacion;
    List<Pelota> pelotas;

    public static void main(String[] args) {
        Juego juego = new Juego();
    }
    public Juego(){
        super("Juego de pelotas");
        pack();
        setSize(500, 500);
        setVisible(true);

        //Método init
        pelotas = new ArrayList<Pelota>();
        pelotas.add(new Pelota(225, 225, 250));


        imagen = this.createImage(500, 500);
        noseve = imagen.getGraphics();

        //Método start
        animacion = new Thread(this);
        animacion.start();
    }
    public void paint(Graphics g){
        noseve.setColor(Color.black);
        noseve.fillRect(0, 0, 500, 500);

        for (int i = 0; i < pelotas.size(); i++) {
            Pelota pelota = pelotas.get(i);
            pelota.paint(noseve);
        }

        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g){
        paint(g);
    }

    public void run() {
        while (true) {
            for (int i = pelotas.size()-1; i >= 0; i--) {
                Pelota pelota = pelotas.get(i);
                pelota.update();
                if (pelota.width < 5){
                    pelotas.remove(i);
                }
            }
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch (InterruptedException e) {}
        }
    }

    public boolean mouseDown(Event e, int x, int y){
        for (int i = pelotas.size()-1; i >= 0; i--) {
            Pelota pelota = pelotas.get(i);
            if (pelota.contains(x, y)){
                pelotas.remove(i);
                pelotas.add(new Pelota(pelota.x, pelota.y, pelota.width/2));
                pelotas.add(new Pelota(pelota.x, pelota.y, pelota.width/2));
            }
        }
        return true;
    }

    public boolean keyDown(Event e, int key){
        if (key == 27){
            System.exit(0);
        }
        return true;
    }

}
