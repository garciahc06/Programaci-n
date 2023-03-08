package Examen;

import java.awt.*;

/*
En esta clase, se crearán 5 rectangulos inmoviles completamente, que se situarán en la parte infefior del Frame
Cada uno, tendrá colores distintos, y se situarán uno al lado del otro, con un espacio entre ellos
 */
public class RectanInmoviles extends Rectangle {
    int x, y;
    Color color;
    Color[] colores = {Color.red, Color.orange, Color.green, Color.yellow, Color.magenta};
    public RectanInmoviles(int x, int y){
        super(x, y, 60,60);
        this.x = x;
        this.y = y;
        color = colores[(int)(Math.random()*colores.length)];
    }

    public void paint(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color = color;
    }
}
