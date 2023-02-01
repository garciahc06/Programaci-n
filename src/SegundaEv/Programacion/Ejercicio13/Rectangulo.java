package SegundaEv.Programacion.Ejercicio13;

import java.awt.*;

public class Rectangulo {
    public int posX, posY, anchura, altura;
    Color color;
    public Rectangulo(int px, int py, int an, int al, Color c){
        posX = px;
        posY = py;
        altura = al;
        anchura = an;
        color = c;
    }
    public void dibujar(Graphics gg){
        gg.setColor(color);
        gg.fillRect(posX, posY, anchura, altura);
    }
}
