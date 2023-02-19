package SegundaEv.Programacion.Ejercicio18;

import java.awt.*;

public class Coche extends Rectangle {
    int velX = 5;

    public Coche() {
        super(0, (int) (Math.random() * 358) + 67, 50, 35);
        if (y <= 250)
            velX = - velX;
        if (y > 250 && y < 275)
            velX = (int) (Math.random() * 10) + 5;
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y, width, height);
    }

    public void update() {
        x += velX;
    }
}
