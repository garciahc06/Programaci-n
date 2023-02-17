package SegundaEv.Programacion.Ejercicio18;

import java.awt.*;

public class Coche extends Rectangle {
    int velX = 0;
    int velY = 0;
    public Coche(){
        super(0, (int) (Math.random()* 175) + 285, 50, 35);
    }
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillRect(x, y, width, height);
    }
    public void update(){

    }
}
