package SegundaEv.Programacion.Ejercicio17;

import java.awt.*;


public class Bullets extends Rectangle {
    public Bullets(int posX) {
        super(posX, 450, 5, 5);
    }
    public void paint(Graphics g) {
        //ponemos color rgb
        g.setColor(new Color(255, 255, 0));
        g.fillRect(x, y, width, height);
    }
    public void update() {
        y -= 10;
    }
}
