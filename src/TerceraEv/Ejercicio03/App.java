package TerceraEv.Ejercicio03;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/*
Juego del Robin Hood, la imagen del robin está a la izquierda del frame y se mueve con el ratón, de arriba abajo,
Unos globos saldrán por la derecha de manera ascendente y el jugador deberá ir disparando a los globos con el ratón
 */
public class App extends Frame implements Runnable {
    private int contador = 0;
    private static final int TIEMPO = 30;
    private static final int NUM_GLOBOS = 4;
    Image imagen;
    Graphics noseve;
    Thread animacion;
    Image robin, flechaImg;
    Image[] globosImg;
    RobinHood arquero;
    ArrayList<Globo> globos;
    ArrayList<Flecha> flechas;

    public static void main(String[] args) {
        App app = new App();
    }

    public App() {
        super("Robin Hood");
        pack();
        setSize(800, 800);
        setVisible(true);

        //Método init
        imagen = createImage(800, 800);
        noseve = imagen.getGraphics();

        robin = Toolkit.getDefaultToolkit().getImage("src/TerceraEv/Ejercicio03/Imagenes/arquero.png");
        flechaImg = Toolkit.getDefaultToolkit().getImage("src/TerceraEv/Ejercicio03/Imagenes/flecha.png");


        globosImg = new Image[NUM_GLOBOS];
        for (int i = 0; i < NUM_GLOBOS; i++) {
            globosImg[i] = Toolkit.getDefaultToolkit().getImage("src/TerceraEv/Ejercicio03/Imagenes/globo" + (i + 1) + ".png");
        }

        arquero = new RobinHood(robin);
        globos = new ArrayList<Globo>();
        globos.add(new Globo(globosImg[(int) (Math.random() * NUM_GLOBOS)]));

        flechas = new ArrayList<Flecha>();


        //Método start
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 800, 800);

        for (Globo globo : globos) globo.paint(noseve, this);

        for (Flecha flecha : flechas) flecha.paint(noseve, this);

        arquero.paint(noseve, this);

        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void run() {
        while (true) {
            contador += TIEMPO;
            if (contador > 1000) {
                contador = 0;
                globos.add(new Globo(globosImg[(int) (Math.random() * NUM_GLOBOS)]));
            }

            if (globos.get(0).y < -100) globos.remove(0);

            for (Globo globo : globos) globo.update();

            if ((!flechas.isEmpty()) && (flechas.get(0).x > 800)) flechas.remove(0);

            for (Flecha flecha : flechas) flecha.update(globos);

//            for (Flecha flecha : flechas) {
//                for (Globo globo : globos) {
//                    if (globo.contains(flecha)) {
//                        globos.remove(globo);
//                        flechas.remove(flecha);
//                        break;
//                    }
//                }
//            }

            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public boolean keyDown(Event e, int key) {
        if (key == 27) System.exit(0);
        return true;
    }

    public boolean mouseDown(Event e, int x, int y) {
        flechas.add(new Flecha(flechaImg, y - 7));
        return true;
    }

    public boolean mouseMove(Event e, int x, int y) {
        arquero.update(y - 45);
        repaint();
        return true;
    }


}
