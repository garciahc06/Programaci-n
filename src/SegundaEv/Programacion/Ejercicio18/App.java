package SegundaEv.Programacion.Ejercicio18;

import java.awt.*;

/*
Clase ejectuable,
JUEGO: CROSSED ROAD
*/
public class App extends Frame implements Runnable {
    public static final int ARRIBA = 1;
    public static final int ABAJO = 2;
    public static final int IZQUIERDA = 3;
    public static final int DERECHA = 4;
    Graphics noseve;
    Image imagen;
    Thread animacion;
    Rana rana;
    Coche coche;

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
        coche = new Coche();
        imagen = this.createImage(500, 500);
        noseve = imagen.getGraphics();

        //Método start
        animacion = new Thread(this);
        animacion.start();

    }
    public void paint(Graphics g){
        //Dibujamos la carretera
        noseve.setColor(Color.gray);
        noseve.fillRect(0, 0, 500, 500 );
        noseve.setColor(Color.black);
        noseve.fillRect(0, 67, 500, 392);
        noseve.setColor(Color.white);
        noseve.fillRect(0,250, 500, 35);

        //Dibujamos la rana
        rana.paint(noseve);

        //Dibujamos el coche
        coche.paint(noseve);
        g.drawImage(imagen, 0, 0, this);
    }
    public void update(Graphics g){
        paint(g);
    }
    public void run(){
        while(true){
            rana.update();
            repaint();
            try{
                Thread.sleep(10);
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
