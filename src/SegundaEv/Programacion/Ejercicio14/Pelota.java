package SegundaEv.Programacion.Ejercicio14;

import java.awt.*;

public class Pelota extends Rectangle {
    Color[] colores = {Color.yellow, Color.red, Color.pink, Color.green, Color.blue, Color.lightGray};
    Color color;
    int velocidadX;
    int velocidadY;
    public Pelota(int diametro){
        super((int) (Math.random() * 350), (int) (Math.random() * 350), diametro, diametro);
        this.color = colores[(int) (Math.random() * colores.length)];
        velocidadX = (int) (Math.random() * 5) + 1;
        velocidadY = (int) (Math.random() * 5) + 1;
    }
    public void paint(Graphics g){
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
    public void update(){
        if((x <= 0) || (x >= (400-width)))
            velocidadX = -velocidadX;
        if ((y <= 0) || (y >= (400-width)))
            velocidadY = -velocidadY;
        x += velocidadX;
        y += velocidadY;
    }
}
