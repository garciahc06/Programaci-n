package TerceraEv.Ejercicio02;

import java.awt.*;

public class Pieza extends Rectangle {
    Image imagen;
    public static final int DIMENSION = 60;

    public Pieza(Image image) {
        super((int) (Math.random() * 200) + 150, (int) (Math.random() * 400), DIMENSION, DIMENSION);
        this.imagen = image;
    }

    public void paint(Graphics g, Frame frame) {
        g.drawImage(imagen, x, y, frame);
    }

    public void update(int posX, int posY) {
        x = posX;
        y = posY;
    }
}
