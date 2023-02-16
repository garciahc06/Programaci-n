package SegundaEv.Programacion.Ejercicio16;

import java.awt.*;

public class Pajaro extends Rectangle {
    public Pajaro(){
        super(75, 10, 10, 10);
    }
    public void paint(Graphics g){
        g.setColor(Color.yellow);
        g.fillOval(x, y, width, height);
    }
    public void update(){
        y += 5;
    }
    public void subir(){
        y -= 30;
    }
}
