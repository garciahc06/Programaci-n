package SegundaEv.Programacion.Ejercicio20;

import java.awt.*;

/*
Esta clase representa una pelota que se mueve por la pantalla
la cual, si se clica en ella, se divide en 2, cogiendo colores y velocidad distintas
 */
public class Pelota extends Rectangle {
    int velX;
    int velY;
    Color color;
    Color[] colores = {Color.red, Color.blue, Color.green, Color.yellow, Color.orange, Color.pink};

    public Pelota(int x, int y, int ancho, int alto) {
        super(x, y, ancho, alto);
    }

    public void paint(Graphics g) {
        color = colores[(int) (Math.random() * colores.length)];
        g.setColor(color);
        g.fillOval(x, y, width, height);

    }

    public void update() {
        velX = (int) (Math.random() * 10);
        velY = (int) (Math.random() * 10) + 2;
        if ((x <= 0) || (x >= (500 - width))) {
            velX = -velX;
        }
        if ((y <= 28) || (y >= (500 - width)))
            velY = -velY;
        x += velX;
        y += velY;

    }

    public void Dividir() {
        Pelota pelota1 = new Pelota(x, y, width / 2, height / 2);
        Pelota pelota2 = new Pelota(x + width / 2, y + height / 2, width / 2, height / 2);
    }
}
