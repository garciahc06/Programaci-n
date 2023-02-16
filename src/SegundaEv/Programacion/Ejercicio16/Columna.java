package SegundaEv.Programacion.Ejercicio16;

import java.awt.*;

// Clase Columna, son las columnas del juego flapi birds, estas se mueven hacia la izquierda, con una separación
// de 50 pixeles entre ellas. Para ello se crearán 2 columnas, una superior y otra inferior, que se moverán
public class Columna {
    Rectangle cArriba;
    Rectangle cAbajo;
    int ancho;
    int alto;
    int x;
    int y;
    int separacion;
    int velocidad;
    int color;
    public Columna(){
        cArriba = new Rectangle(250, 0, 50, (int) (Math.random()*150) + 100);
        cAbajo = new Rectangle(250, cArriba.height + 100, 50, 300 - (cArriba.height + 100));

    }
    public void paint(Graphics g){
        g.setColor(Color.green);
        g.fillRect(cArriba.x, cArriba.y, cArriba.width, cArriba.height);
        g.fillRect(cAbajo.x, cAbajo.y, cAbajo.width, cAbajo.height);
    }
    public void update(){
        cArriba.x -= 5;
        cAbajo.x -= 5;
    }
}
