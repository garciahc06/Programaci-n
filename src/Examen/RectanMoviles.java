package Examen;

import java.awt.*;

/*
En esta clase, se crearán rectángulos móviles, que se situarán en la parte superior del Frame,
Estos rectángulos tendrán una velocidad aleatoria, y rebotarán en los bordes del Frame, y tambíen rebotarán en
Y = 350, dejando así un espacio libre para que los rectángulos inmóviles.
 */
public class RectanMoviles extends Rectangle {
    int x, y;
    int velX, velY;
    int posIniX, posIniY;
    Color color;
    Color[] colores = {Color.red, Color.orange, Color.green, Color.yellow, Color.magenta};

    public RectanMoviles(int x, int y) {
        super(x, y, 60, 60);
        this.x = x;
        this.y = y;

        color = colores[(int) (Math.random() * colores.length)];
        velX = (int) (Math.random() * 5);
        velY = (int) (Math.random() * 5);
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

    public void update() {
        x += velX;
        y += velY;
        if (x < 10 || x > 490 - width) {
            velX *= -1;
        }
        if (y < 27 || y > 350 - height) {
            velY *= -1;
        }
    }

    public void setVelocidadX(int velX) {
        this.velX = velX;
    }

    public void setVelocidadY(int velY) {
        this.velY = velY;
    }

    public void getVelocidadX(int velX) {
        this.velX = velX;
    }

    public void getVelocidadY(int velY) {
        this.velY = velY;
    }

    public int getPosIniX() {
        return posIniX;
    }

    public void setPosIniX(int posIniX) {
        this.posIniX = posIniX;
    }

    public int getPosIniY() {
        return posIniY;
    }

    public void setPosIniY(int posIniY) {
        this.posIniY = posIniY;
    }

}
