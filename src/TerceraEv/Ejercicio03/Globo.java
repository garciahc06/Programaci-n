package TerceraEv.Ejercicio03;

import javax.swing.plaf.metal.MetalTreeUI;
import java.awt.*;

public class Globo extends Rectangle {
    public static final int POSY = 810;
    public static final int ANCHURA = 80;
    public static final int ALTURA = 120;
    Image imagen;
    int velY;

    public Globo(Image img) {
        super((int) (Math.random() * 70) + 620, POSY,ANCHURA, ALTURA);
        imagen = img;
        velY = (int) (Math.random() * 4) + 2;
    }

    public void paint(Graphics gg, Frame frame) {
        gg.drawImage(imagen, x, y, ANCHURA, ALTURA, frame);
    }

    public void update() {
        y -= velY;
    }
}
