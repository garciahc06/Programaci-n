package SegundaEv.Programacion.Ejercicio15;

import java.awt.*;

public class Pelota extends Rectangle {
    int velX;
    int velY;
    Raqueta r;
    public Pelota(){
        super(290, 529,20,20);
        velX = (int) (Math.random() * 3) + 2;
        velY = (int) (Math.random() * 3) + 2;
    }
    public void update(){
        if ((x <= 0) ||(x >= (600-width)))
            velX = -velX;
        if ((y <= 28) ||(y >= (600-width)))
            velY = -velY;
        x += velX;
        y += velY;
    }
    public void paint(Graphics g){
        g.setColor(Color.white);
        g.fillOval(x,y,width,height);
        g.setColor(Color.black);
        g.drawOval(x,y,width,height);
    }
}
