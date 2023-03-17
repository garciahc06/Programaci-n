
package TerceraEv.Ejercicio01;

import java.awt.Frame;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import java.io.File;

import java.awt.Font;
import java.awt.Color;


public class Caminando extends Frame implements Runnable {
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Image img;
    Image[][] imagenes = new Image[3][4];
    String elementos[] = {"Guerrillero/g", "Hampon/h", "Vaquero/v"};
//    DibujoAnimado dib;

    public static void main(String[] args) {
        Caminando app = new Caminando();
    }
    public Caminando(){
            super("Ranas saltando :3");
            pack();
            setSize(300,300);
            setVisible(true);
            // init
            imagen = this.createImage(300, 300);
            noseve = imagen.getGraphics();
            try{
            for(int i = 0; i < 3 ; i++)
                for(int j = 0; j < 4; j++)
                imagenes[i][j] = ImageIO.read(new File("C://Users/Maramburu/Documents/NetBeansProjects/Tercera_Evaluacion/src/Ejercicio01/Sprites/"+elementos[i] + (j + 1) + ".gif"));
            } catch(IOException e){}
            //Start
            animacion = new Thread(this);
            animacion.start();
    }



    public void paint(Graphics g){
       noseve.setColor(Color.BLACK);
       noseve.fillRect(0, 0, 600, 600);
       noseve.drawImage(img, 70, 70, 100, 150, this);
//        if(dib != null)
//       dib.paint(noseve);

        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g){
        paint(g);
    }

    public void run(){
        while(true){
//            if(dib != null)
//            dib.update();
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex){
            }
        }
    }
//    public boolean keyDown(Event ev, int tecla){
//        if(tecla == 1006){
//            dib = new DibujoAnimado(imagenes[0]);
//        }
//        if(tecla == 1007){
//            dib = new DibujoAnimado(imagenes[1]);
//        }
//        if(tecla == 1004){
//            dib = new DibujoAnimado(imagenes[2]);
//        }
//        if(tecla == 1005){
//            dib = null;
//        }
//        if(tecla == 27)
//            System.exit(0);
//        return true;
//    }
}
