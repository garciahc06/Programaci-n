package SegundaEv.Programacion.Ejercicio21;
/*
Clase Obstaculos, unos cuadrados que aparecen en el juego y que el dinosaurio debe esquivar, saltando.
Serán de distinos colores y tamaños pero con un tamaño límite para que el dinosaurio pueda saltar sobre ellos.
 */
import java.awt.*;

public class Obstaculos extends Rectangle {
    Color color;
    Color[] colores = {Color.red, Color.blue, Color.green, Color.yellow, Color.orange, Color.pink, Color.cyan};
    public Obstaculos(){
        super(500, 370, 30, 30);
        color = colores[(int)(Math.random()*colores.length)];
    }
    public void paint(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
    public void update(){
        x -= 5;
    }
}
