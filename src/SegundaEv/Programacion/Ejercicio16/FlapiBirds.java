package SegundaEv.Programacion.Ejercicio16;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FlapiBirds extends Frame implements Runnable {
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Pajaro pajaro;

    List<Columna> columnas;

    public static void main(String[] args) {
        FlapiBirds app = new FlapiBirds();
    }

    public FlapiBirds() {
        super("Flapi Birds");
        pack();
        setSize(300, 300);
        setVisible(true);

        //Método init de la clase
        pajaro = new Pajaro();


        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();

        //Método start de la clase
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.black);
        noseve.fillRect(0, 0, 300, 300);

        pajaro.paint(noseve);

        g.drawImage(imagen, 0, 0, this);
    }
    public void update(Graphics g){
        paint(g);
    }

    public void run() {
        while (true) {
            pajaro.update();
            repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {}
        }
    }
    public boolean keyDown(Event ev, int tecla){
        if(tecla == 32)
            pajaro.subir();
        if(tecla == 27)
            System.exit(0);
        return true;
    }
}
