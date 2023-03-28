package TerceraEv.Ejercicio04;

import javax.sound.midi.Soundbank;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class Tablero extends Frame {
    private static final int NUM_IMAGENES = 25;
    private static final int DIM = 5;
    Image imagen;
    Image[] imagenes;
    Graphics noseve;
    Casilla[][] casillas;
    Soundbank error, acierto, exito;
    Point hueco;

    public static void main(String[] args) {
        Tablero tablero = new Tablero();
    }

    public Tablero() {
        super("Tablero");
        pack();
        setSize(600, 600);
        setVisible(true);

        // Método init
        imagenes = new Image[NUM_IMAGENES];
        for (int i = 0; i < NUM_IMAGENES - 1; i++)
            imagenes[i] = getToolkit().getImage("src/TerceraEv/Ejercicio04/botones/" + (i + 1) + ".gif");
        imagenes[NUM_IMAGENES - 1] = null;

        casillas = new Casilla[DIM][DIM];
        for (int i = 0; i < DIM; i++)
            for (int j = 0; j < DIM; j++)
                casillas[i][j] = new Casilla(imagenes[i * DIM + j], i * Casilla.DIMENSION, j * Casilla.DIMENSION, i * DIM + j + 1);

        // Metemos el archivo de error.wav en la variable error, con la sintaxis propia de Soundbank
        try {
            error = (Soundbank) AudioSystem.getAudioInputStream(new URL("src/TerceraEv/Ejercicio04/sonidos/error.wav"));
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Metemos el archivo de correct.mp3 en la variable acierto, con la sintaxis propia de Soundbank
        try {
            acierto = (Soundbank) AudioSystem.getAudioInputStream(new URL("src/TerceraEv/Ejercicio04/sonidos/correct.mp3"));
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Metemos el archivo de exito.wav en la variable exito, con la sintaxis propia de Soundbank
        try {
            exito = (Soundbank) AudioSystem.getAudioInputStream(new URL("src/TerceraEv/Ejercicio04/sonidos/exito.wav"));
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        hueco = new Point(Casilla.DIMENSION - 1, Casilla.DIMENSION - 1);

        imagen = createImage(600, 600);
        noseve = imagen.getGraphics();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.black);
        noseve.fillRect(0, 0, 600, 600);

        for (int i = 0; i < DIM; i++)
            for (int j = 0; j < DIM; j++)
                casillas[i][j].paint(noseve, this);

        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public boolean mover(Point click) {
        Point desplazamiento, hasta;
        desplazamiento = new Point(click.x - 1, click.y);

        return true;
    }

    public int delta(int a, int b) {
        if (a == b) return 0;
        else return ((b-a) / Math.abs(b-a));
    }
    public boolean mouseDown(Event evt, int x, int y) {
        Point click;
        click = new Point(y/Casilla.DIMENSION, x/Casilla.DIMENSION);
        return true;
    }

    public boolean keyDown(Event evt, int key) {
        if (key == 27) System.exit(0);
        return true;
    }
}
