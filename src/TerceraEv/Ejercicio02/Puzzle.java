package TerceraEv.Ejercicio02;

import java.awt.*;

public class Puzzle extends Frame {
    public static final int NUMERO = 25;
    public static final int DIM = 5;
    Image imagen;
    Graphics noseve;
    Image[] imagenes;
    Pieza[] piezas;
    Pieza actual;
    Rectangle[][] destinos;

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
            piezas[i] = new Pieza(imagenes[i], i + 1);
        }
        destinos = new Rectangle[DIM][DIM];
        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                destinos[i][j] = new Rectangle(i * Pieza.DIMENSION, j * Pieza.DIMENSION, Pieza.DIMENSION, Pieza.DIMENSION);
            }
        }
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 500, 500);

        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                noseve.setColor(Color.WHITE);
                noseve.drawRect(destinos[i][j].x, destinos[i][j].y, destinos[i][j].width, destinos[i][j].height);
            }
        }

        for (Pieza pieza : piezas) {
            pieza.paint(noseve, this);
        }

        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g) {
        paint(g);
    }


    public boolean keyDown(Event e, int key) {
        if (key == 27) System.exit(0);
        return true;
    }

    public boolean mouseDown(Event e, int x, int y) {
        for (Pieza pieza : piezas) {
            if (pieza.contains(x, y)) {
                actual = pieza;
                break;
            }
        }
        return true;
    }

    public boolean mouseDrag(Event e, int x, int y) {
        if (actual != null) {
            actual.update(x, y);
            repaint();
        }
        return true;
    }

    public boolean mouseUp(Event e, int x, int y) {
        if (actual == null)
            for(int i = 0; i < DIM; i++)
                for(int j = 0; j < DIM; j++)
                    if((actual.intersects(destinos[i][j])) && (actual.getPosicion() == (i*DIM) + j)) {
                        actual.x = i * Pieza.DIMENSION;
                        actual.y = j * Pieza.DIMENSION;
                        actual.setColocada(false);
                    }
        actual = null;
        return true;
    }
}
