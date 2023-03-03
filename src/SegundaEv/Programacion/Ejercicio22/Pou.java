package SegundaEv.Programacion.Ejercicio22;

import java.awt.*;

public class Pou extends Rectangle {
    public int posX, posY;
    public Pou(int posX, int posY){
        super(posX, posY , 50, 50);
        this.posX = posX;
        this.posY = posY;
    }
    public void paint(Graphics g){
        g.setColor(Color.pink);
        g.fillOval(posX, posY, 50, 50);
    }

    public void update(){
        posY += 2;
        if (posX > 500){
            posX = -20;
        }
        if (posX < -20){
            posX = 490;
        }
    }
    public void salto(){
        posY -= 80;
    }
    public void moverDcha(){
        posX += 50;
    }
    public void moverIzq(){
        posX -= 50;
    }
}
