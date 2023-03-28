package TerceraEv.Ejercicio03;

import java.awt.*;
import java.util.List;

public class Flecha extends Point {
    public static final int VELX = 10;
    Image imagen;

    public Flecha(Image img, int posY) {
        super(100, posY);
        imagen = img;
    }

    public void paint(Graphics gg, Frame frame) {
        gg.drawImage(imagen, x, y,100,50 ,frame);
    }

    public void update(List<Globo> globos) {
        x += VELX;
        for (Globo globo : globos) {
            if (globo.contains(this)) {
                globos.remove(globo);
                break;
            }
        }
    }
}
