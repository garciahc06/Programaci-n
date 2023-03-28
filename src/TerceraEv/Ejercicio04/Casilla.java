package TerceraEv.Ejercicio04;

import java.awt.*;

public class Casilla extends Rectangle {
    public static final int DIMENSION = 50;
    private Image imagen;
    int valor;

    public Casilla(Image img, int posX, int posY, int v) {
        super(posX, posY, DIMENSION, DIMENSION);
        imagen = img;
        valor = v;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image img) {
        imagen = img;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int v) {
        valor = v;
    }

    public void paint(Graphics g, Frame f) {
        if (imagen != null)
            g.drawImage(imagen, x, y, f);
    }
}
