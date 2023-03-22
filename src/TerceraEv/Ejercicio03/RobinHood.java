package TerceraEv.Ejercicio03;

import java.awt.*;

/*
Esta imagen se moverá en la izquierda del frame y se moverá con el ratón, de arriba abajo.
 */
public class RobinHood {
    Image imagen;
    int posY;
    public static final int ANCHURA = 130;
    public static final int ALTURA = 130;

    public RobinHood(Image img) {
        imagen = img;
        posY = 150;
    }

    public void paint(Graphics gg, Frame frame) {
        gg.drawImage(imagen, 100, posY, ANCHURA, ALTURA, frame);
    }

    public void update(int py) {
        posY = py;
        if (posY < 0) posY = 0;
        if (posY > 800 - ALTURA) posY = 800 - ALTURA;

    }

}
