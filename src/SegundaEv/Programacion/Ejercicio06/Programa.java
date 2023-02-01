package SegundaEv.Programacion.Ejercicio06;

import java.awt.*;

public class Programa extends Frame {
    Ovalo ovalo;

    public static void main(String[] args) {
        Programa ventana = new Programa();
    }

    public Programa() {
        super("Dibujando Ovalos");
        ovalo = new Ovalo();

        Button boton1 = new Button("Salir");
        Button boton2 = new Button("Siguiente");
        Panel panel = new Panel();


        setSize(600, 600);
        setVisible(true);

//      this.resize(600, 600);
//      this.show(true);

        panel.add(boton1);
        panel.add(boton2);
        this.add("South", panel);
    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        } else if (ev.id == Event.ACTION_EVENT) {
            if (ev.target instanceof Button) {
                if (ev.arg.equals("Salir")) {
                    System.exit(0);
                    return true;
                }
//          PRIMERA FORMA DE HACERLO (CREANDO NUEVOS OBJETOS)
//              else if (ev.arg.equals("Siguiente")){
//                    ovalo = new Ovalo();
//                    repaint();
//                    return true;
//              }
//          SEGUNDA FORMA DE HACERLO (MODIFICANDO EL OBJETO YA EXISTENTE)
                else if (ev.arg.equals("Siguiente")) {
                    ovalo.inicializar();
                    repaint();
                    return true;
                }
            }
        }
        return false;
    }

    public void paint(Graphics papel) {
        ovalo.paint(papel);
    }
}
//Layout = distribución

