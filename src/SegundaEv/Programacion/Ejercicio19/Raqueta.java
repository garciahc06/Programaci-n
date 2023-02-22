package SegundaEv.Programacion.Ejercicio19;

import java.awt.*;

public class Raqueta extends Rectangle {
    private int velY;
    String nomTenista;
    private int puntos = 0;
    public Raqueta(int posX, String nt) {
        super(posX, 230, 10, 60);
        velY = 10;
        nomTenista = nt;
    }
    public int getPuntos() {
        return puntos;
    }
    public void setPuntos() {
        this.puntos++;
    }
    public int getVelY() {
        return velY;
    }

    public void setVelY(int velY) {
        this.velY = velY;
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y, width, height);
    }

    public void update(int direccion) {
        y += (velY * direccion);
        if (y <= 28)
            y = 28;
        if ((y + 60) >= 500)
            y = 440;
    }

}
