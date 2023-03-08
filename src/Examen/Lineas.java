package Examen;

import java.awt.*;

public class Lineas  {
    public static final int LINEA = 0;
    public int posIniX, posIniY, posFinX, posFinY;
    public int tipo;
    Color color;

    public Lineas(int px1, int py1, int px2, int py2, int tipo) {
        posIniX = px1;
        posIniY = py1;
        posFinX = px2;
        posFinY = py2;
        this.tipo = tipo;
    }
    public Lineas(int x, int y, int px1, int py1, int tipo, Color colores){
        this(px1, py1, px1, py1, tipo);
    }

    public int getPosIniX() {
        return posIniX;
    }

    public void setPosIniX(int posIniX) {
        this.posIniX = posIniX;
    }

    public int getPosIniY() {
        return posIniY;
    }

    public void setPosIniY(int posIniY) {
        this.posIniY = posIniY;
    }

    public int getPosFinX() {
        return posFinX;
    }

    public void setPosFinX(int posFinX) {
        this.posFinX = posFinX;
    }

    public int getPosFinY() {
        return posFinY;
    }

    public void setPosFinY(int posFinY) {
        this.posFinY = posFinY;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getColor(){
        return color.getRGB();
    }

    public void setColor(Color color){
        this.color = color;
    }
    public void paint(Graphics g){
        switch (tipo){
            case LINEA:
                g.drawLine(posIniX, posIniY, posFinX, posFinY);
                break;
        }
    }

}

