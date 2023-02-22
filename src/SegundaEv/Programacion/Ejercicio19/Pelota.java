package SegundaEv.Programacion.Ejercicio19;

import java.awt.*;

public class Pelota extends Rectangle {
    int velX;
    int velY;

    public Pelota() {
        super(250, 250, 15, 15);
        velX = (int) (Math.random() * 3) + 2;
        velY = (int) (Math.random() * 3) + 2;
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, width, height);
    }

    public void update(Raqueta r1, Raqueta r2) {
        if ((x <= 0) || (x >= (500 - width))) {
            if (x <= 0) r2.setPuntos();
            if (x >= (500 - width)) r1.setPuntos();
            velX = -velX;
        }
        if ((y <= 28) || (y >= (500 - width)))
            velY = -velY;
        x += velX;
        y += velY;
        if (this.intersects(r1) || this.intersects(r2))
            velX = -velX;
    }
    public void iniciarJuego(){
        x = 250;
        y = 250;
        velX = (int) (Math.random() * 3) + 2;
        velY = (int) (Math.random() * 3) + 2;
    }

}
