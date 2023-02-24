package SegundaEv.Programacion.Ejercicio21;

import java.awt.*;

public class Dinusaurio extends Rectangle {
    private int posY = 300;
    public Dinusaurio(){
        super(100, 300, 40, 100);
    }
    public void paint(Graphics g){
        g.setColor(Color.white);
        g.fillOval(x, y, width, height);
    }
    public void update(){
        if (y != posY) y += 2;
    }
    public void saltar(){
        y -= 80;
    }
}
