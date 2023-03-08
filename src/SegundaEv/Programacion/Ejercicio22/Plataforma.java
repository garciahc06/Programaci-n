package SegundaEv.Programacion.Ejercicio22;

import java.awt.*;

//Clase Plataforma. Construiremos un objeto de esta clase
public class Plataforma extends Rectangle {
    public int posX, posY;
    Color color;
    Color[] colores = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.PINK, Color.CYAN, Color.MAGENTA};
    public Plataforma (int posX, int posY) {
        super(posX, posY, 100, 20);

        this.posX = posX;
        this.posY = posY;
        color = colores[(int)(Math.random()*colores.length)];
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(posX, posY, width, height);
    }

    public void update(){
        posY++;
    }
    public int getPosX(){
        return posX;
    }
    public int getPosY(){
        return posY;
    }
}
