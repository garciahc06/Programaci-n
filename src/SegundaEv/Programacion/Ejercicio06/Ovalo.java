package SegundaEv.Programacion.Ejercicio06;

import java.awt.Color;
import java.util.Random;
import java.awt.Graphics;

/*
Crear una clase Ovalo que contenga un botón que cada vez que se clique,
el ovalo con unas medidas aleatorias y que salga por pantalla en unas coordenadas aleatorias cambiará de posición.
 */
public class Ovalo {
    int posX;
    int posY;
    int ancho;
    int alto;
    Color color;
    Random r = new Random();

    public Ovalo() {
       /* SIN IMPORTAR LA CARPETA DE java.util.Random
        posX = (int) (Math.random() * 600);
        posY = (int) (Math.random() * 400);
        ancho = (int) (Math.random() * 300);
        alto = (int) (Math.random() + 300);
        color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));

        OTRA FORMA DE HACERLO IMPORTANDO LA CARPETA DE java.util.Random */
        inicializar();
    }

    public void inicializar() {
        posX = r.nextInt(200) + 100;
        posY = r.nextInt(200) + 100;
        ancho = r.nextInt(300);
        alto = r.nextInt(300);
        color = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
    }

    public void paint(Graphics papel){
        papel.setColor(color);
        papel.fillOval(posX, posY, ancho, alto);
    }
    
}
