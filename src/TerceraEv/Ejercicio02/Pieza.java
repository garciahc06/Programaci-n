package TerceraEv.Ejercicio02;

import java.awt.*;

public class Pieza extends Rectangle {
    Image imagen;
    private boolean colocada = true;
    public static final int DIMENSION = 60;
    int posicion;

    public Pieza(Image image, int pos) {
        super((int) (Math.random() * 200) + 150, (int) (Math.random() * 400), DIMENSION, DIMENSION);
        this.imagen = image;
        posicion = pos;
    }

    public void paint(Graphics g, Frame frame) {
        g.drawImage(imagen, x, y, frame);
    }

    public void update(int posX, int posY) {
        x = posX - (DIMENSION/2);
        y = posY - (DIMENSION/2);
    }
    public boolean isColocada() {
        return colocada;
    }

    public void setColocada(boolean colocada) {
        this.colocada = colocada;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
