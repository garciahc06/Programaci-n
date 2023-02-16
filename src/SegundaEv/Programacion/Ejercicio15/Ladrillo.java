package SegundaEv.Programacion.Ejercicio15;

import java.awt.*;

public class Ladrillo extends Rectangle {
   Color color;
    public static final int ALTURA = 10;
    public static final int ANCHURA = 28;


    public Ladrillo(int x, int y, Color color){
        super(x, y, 28, 10);
        this.color = color;
    }
    public void paint(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, width, height);
        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(x, y, width, height);
    }
}
