package Examen;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Juego extends Frame implements Runnable {
    Graphics noseve;
    Image imagen;
    Thread animacion;
    List<RectanInmoviles> inmoviles;
    List<RectanMoviles> moviles;
    List<Lineas> lineas;
    Lineas actual = null;
    private int tipo;

    public static void main(String[] args) {
        Juego juego = new Juego();
    }

    public Juego() {
        super("Juego de pelotas");
        pack();
        setSize(500, 500);
        setVisible(true);

        //Método init
        imagen = this.createImage(500, 500);
        noseve = imagen.getGraphics();

        //Dibujamos la lista de Rectangulos inmoviles
        inmoviles = new ArrayList<RectanInmoviles>();
        for (int i = 0; i < 5; i++) {
            inmoviles.add(new RectanInmoviles(45 + (i * 90), 400));
        }

        //Dibujamos la lista de Rectangulos moviles
        moviles = new ArrayList<RectanMoviles>();
        for (int i = 0; i < 5; i++) {
            moviles.add(new RectanMoviles((int) (Math.random() * 450 + 10), (int) (Math.random() * 300)));
        }

        //Inicializamos la lista de lineas
        lineas = new ArrayList<Lineas>();
        tipo = Lineas.LINEA;


        //Método start
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.black);
        noseve.fillRect(0, 0, 500, 500);

        //Dibujamos los rectangulos inmoviles
        for (int i = 0; i < inmoviles.size(); i++) {
            inmoviles.get(i).paint(noseve);
        }

        //Dibujamos los rectangulos moviles
        for (int i = 0; i < moviles.size(); i++) {
            moviles.get(i).paint(noseve);
        }

        //Dibuja las lineas si se clica en los rectangulos inmoviles
        if (actual != null)
            actual.paint(noseve);
        for (Lineas item : lineas) {
            item.paint(noseve);
        }


        g.drawImage(imagen, 0, 0, this);
    }

    public boolean mouseDown(Event ev, int x, int y) {
         for (int i = 0; i < inmoviles.size(); i++) {
             if (inmoviles.get(i).contains(x, y)) {
                 actual = new Lineas(x, y, x, y, tipo);
                 repaint();
             }
         }
         return true;
    }

    public boolean mouseDrag(Event ev, int x, int y) {
        actual.setPosFinX(x);
        actual.setPosFinY(y);
        repaint();
        return true;
    }

    public boolean mouseUp(Event ev, int x, int y) {
        lineas.add(actual);
        repaint();
        return true;
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void run() {
        while (true) {
            //Actualizamos los rectangulos moviles
            for (int i = 0; i < moviles.size(); i++) {
                moviles.get(i).update();
            }
            //Cambiamos el color de las lineas segun el rectangulo que se clica
            for (int i = 0; i < inmoviles.size(); i++) {
                if (actual != null) {
                    actual.setColor(inmoviles.get(i).getColor());
                }
            }

            //La línea se mueve segun el rectangulo movil al que se le ha soltado
            for (int i = 0; i < moviles.size(); i++) {
                if (actual != null) {
                    if (moviles.get(i).contains(actual.getPosFinX(), actual.getPosFinY())) {
                        actual.setPosIniX(moviles.get(i).getPosIniX());
                        actual.setPosIniY(moviles.get(i).getPosIniY());
                    }
                }
            }

            repaint();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
            }
        }
    }


    public boolean keyDown(Event e, int key) {
        if (key == 27)
            System.exit(0);
        return true;
    }

}
