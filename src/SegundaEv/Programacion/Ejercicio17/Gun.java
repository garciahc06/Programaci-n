package SegundaEv.Programacion.Ejercicio17;

import java.awt.*;

public class Gun extends Rectangle {

    public Gun() {
        super(250, 450, 20, 25);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y, width, height);
    }

    public void update(int posX) {
        x = posX - 7;
        if (x <= 0) x = 0;
        if (x >= 500) x = 475;
    }
}