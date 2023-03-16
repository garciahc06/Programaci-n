package TerceraEv.Ejercicio01;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class Caminando extends Frame implements Runnable {
    public static final int FILAS = 10;
    public static final int COLUMNAS = 3;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Image img;
    Image[][] fotogramas;
    String[] elementos = {"Guerrillero/g", "Hampon/h", "Vaquero/v"};

    public static void main(String[] args) {
        Caminando c = new Caminando();
    }

    public Caminando() {
        pack();
        setSize(500, 500);
        setVisible(true);

        //Método init
        imagen = createImage(500, 500);
        noseve = imagen.getGraphics();

        fotogramas = new Image[FILAS][COLUMNAS];

        try {

            for (int i = 0; i < FILAS; i++)
                for (int j = 0; j < COLUMNAS; j++)
                    fotogramas[i][j] = ImageIO.read(new File("C://Users/Administrator/Clase/IdeaProjects/Programacion/src/TerceraEv/Ejercicio01/Sprites/" + elementos[i] + (j + 1) + ".gif"));
        } catch (IOException e) {
        }

//        img = new ImageIcon("Sprites/Guerrillero/g1.gif").getImage();

        //Método start
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.black);
        noseve.fillRect(0, 0, 500, 500);

        noseve.drawImage(fotogramas[1][1], 70, 70, 100,150, this);

        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }
    }

}
