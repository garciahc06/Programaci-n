package TerceraEv.Ejercicio02;

import java.awt.*;

public class Puzzle extends Frame implements Runnable {
    public static final int NUMERO = 25;
    public static final int Columnas = 4;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Image img;
    Image[] imagenes;
    Pieza[] piezas;

    public static void main(String[] args) {
        Puzzle puzzle = new Puzzle();
    }

    public Puzzle() {
        super("Puzzle");
        pack();
        setSize(500, 500);
        setVisible(true);

        //Método init
        imagen = createImage(500, 500);
        noseve = imagen.getGraphics();

        piezas = new Pieza[NUMERO];
        imagenes = new Image[NUMERO];
        for (int i = 0; i < NUMERO; i++) {
            imagenes[i] = Toolkit.getDefaultToolkit().getImage("src/TerceraEv/Ejercicio02/directorioImagenes/" + (i + 1) + ".png");
            piezas[i] = new Pieza(imagenes[i]);
        }


        //Método start
        animacion = new Thread(this);
        animacion.start();

    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 500, 500);

        for (Pieza pieza : piezas) {
            pieza.paint(noseve, this);
        }


        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }
    }

    public boolean keyDown(Event e, int key) {
        if (key == 27) System.exit(0);
        return true;
    }
}
