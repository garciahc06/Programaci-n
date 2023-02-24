package SegundaEv.Programacion.Ejercicio20;

import java.awt.*;

/*
Esta clase representa una pelota que se mueve por la pantalla
la cual, si se clica en ella, se divide en 2, cogiendo colores y velocidad distintas
 */
public class Pelota extends Rectangle {
    int velX, velY;
    Color color;
    Color[] colores = {Color.red, Color.blue, Color.green, Color.yellow, Color.orange, Color.pink};

    public Pelota(int x, int y, int diametro) {

        super(x, y, diametro, diametro);
        color = colores[(int) (Math.random() * colores.length)];
        velX = (int) (Math.random() * 7) - 3;
        velY = (int) (Math.random() * 7) - 3;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);

    }

    public void update() {
        x += velX;
        y += velY;
        if ((x <= 0) || (x >= 500 - width))
            velX = -velX;
        if ((y <= 28) || (y >= 500 - width))
            velY = -velY;
    }

}
