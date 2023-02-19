package SegundaEv.Programacion.Ejercicio18;

import java.awt.*;
import java.util.*;
import java.util.List;

/*
Clase ejectuable,
JUEGO: CROSSED ROAD
*/
public class App extends Frame implements Runnable {
    public static final int ARRIBA = 1;
    public static final int ABAJO = 2;
    public static final int IZQUIERDA = 3;
    public static final int DERECHA = 4;
    public static final int TIEMPO = 30;
    Graphics noseve;
    Image imagen;
    Thread animacion;
    Rana rana;
    List<Coche> coche;
    int cronometro = 0;
    boolean fin = false;


    public static void main(String[] args) {
        App app = new App();
    }
    public App(){
        super();
        pack();
        setSize(500, 500);
        setVisible(true);

        //Método init
        rana = new Rana();
        coche = new ArrayList<Coche>();
        for (int i = 0; i < 10; i++) {
            coche.add(new Coche());
        }



        imagen = this.createImage(500, 500);
        noseve = imagen.getGraphics();

        //Método start
        animacion = new Thread(this);
        animacion.start();

    }
    public void paint(Graphics g){
        //Dibujamos la carretera
        noseve.setColor(Color.darkGray);
        noseve.fillRect(0, 0, 500, 500 );
        noseve.setColor(Color.black);
        noseve.fillRect(0, 67, 500, 392);
        for (int i = 0; i < 500; i += 50) {
            noseve.setColor(Color.white);
            noseve.fillRect(i, 250, 40, 25);
        }
        //Dibujamos la rana
        rana.paint(noseve);

        //Dibujamos el coche
        for (Coche coche : coche) {
            coche.paint(noseve);
        }
        g.drawImage(imagen, 0, 0, this);
    }
    public void update(Graphics g){
        paint(g);
    }
    public void run(){
        while(true){
            cronometro += TIEMPO;
            if (cronometro >= 1000) {
                for (int i = 0; i < 6; i++)
                    coche.add(new Coche());
                cronometro = 0;
            }

            rana.update();
            for (Coche coche : coche) {
                coche.update();
            }
            repaint();
            try{
                Thread.sleep(TIEMPO);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public boolean keyDown(Event e, int key){
        if (key == 27) System.exit(0);
        if (key == 1004) rana.mover(ARRIBA);
        if (key == 1005) rana.mover(ABAJO);
        if (key == 1006) rana.mover(IZQUIERDA);
        if (key == 1007) rana.mover(DERECHA);
        return true;
    }
}
