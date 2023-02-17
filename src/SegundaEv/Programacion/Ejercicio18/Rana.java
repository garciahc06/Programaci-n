package SegundaEv.Programacion.Ejercicio18;

//Clase Rana (extends Rectangle)

import java.awt.*;

public class Rana extends Rectangle {
    public Rana(){
        super(240, 465, 20, 25);
    }
    public void paint(Graphics g){
        g.setColor(Color.green);
        g.fillRect(x, y, width, height);
    }
    public void update(){
        if (x <= 0) x = 5;
        if (x >= 485) x = 475;
        if (y <= 27) y = 32;
        if (y >= 473) y = 465;
    }
    public void mover(int direccion){
        switch (direccion){
            case App.ARRIBA:
                y -= 15;
                break;
            case App.ABAJO:
                y += 15;
                break;
            case App.IZQUIERDA:
                x -= 15;
                break;
            case App.DERECHA:
                x += 15;
                break;
        }
        update();
    }
}
