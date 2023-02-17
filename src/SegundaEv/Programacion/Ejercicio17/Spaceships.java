package SegundaEv.Programacion.Ejercicio17;

import java.awt.*;

public class Spaceships extends Rectangle {
    int velX;
    int velY;
    public Spaceships(){
        super((int) (Math.random() * 475), (int)(Math.random()*100) -100, 20, 14);
        velX = (int)(Math.random()*9) - 4;
        velY = (int) (Math.random()*3) + 2 ;
    }
    public void paint(Graphics g){
        g.setColor(Color.green);
        g.fillRect(x, y, width, height);
    }
    public void update(){
        if (x <= 0 || x >= 475) velX *= -1;
        x += velX;
        y += velY;
    }
}
