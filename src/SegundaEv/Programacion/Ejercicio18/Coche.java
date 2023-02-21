package SegundaEv.Programacion.Ejercicio18;

import java.awt.*;

public class Coche extends Rectangle {
    int velX;
    public static final int ANCHO = 30;
    public static final int ALTO = 20;
    Color color = Color.RED;

    public Coche(int posX, int posY) {
        super(posX, posY, ANCHO, ALTO);
        velX = (int) (Math.random() * 3) + 2;
        if(posX >= 300) {
            velX = -velX;
            color = Color.ORANGE;
        }

    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

    public void update() {
        x += velX;
    }
}
