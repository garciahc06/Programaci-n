package SegundaEv.Programacion.Ejercicio12;

import java.awt.*;

public class Animacion extends Frame implements Runnable {
    Thread hilo = new Thread(this);
    String[] frames = {"*", "**", "***", "****", "*****","******", "*****", "****", "***", "**"};
    int acutal = 0;

    public static void main(String[] args) {
        Animacion app = new Animacion();

    }
    public Animacion() {
        super("Animacion sencilla");
        pack();
        setSize(400, 400);
        setVisible(true);

        hilo.start();
    }

    public void paint(Graphics g) {
        g.drawString(frames [acutal], 100, 100);
    }
    public void run() {
       //bucle infinito
        while (true) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {}
            acutal++;
            if (acutal == frames.length) {
                acutal = 0;
            }
            repaint();
        }
    }
    public boolean handleEvent(Event evt) {
        if (evt.id == Event.WINDOW_DESTROY) {
            System.exit(0);
        }
        return super.handleEvent(evt);
    }
}
