package SegundaEv.Programacion.Ejercicio15;

import java.awt.*;

public class Raqueta extends Rectangle {
    private int velX;

    public Raqueta() {
        super(240, 500, 80, Ladrillo.ALTURA);
        velX = 10;
    }
    public int getVelX(){
        return velX;
    }
    public void setVelX(int velX){
        this.velX = velX;
    }
    public void paint(Graphics g){
        g.setColor(Color.white);
        g.fillRect(x, y, width , height);
    }
    public void update(int direccion){
        x += velX * direccion;
        if (x <= 0)
            x = 0;
        if (x >= (600 - width))
            x = 600 - width;
    }
}
