package SegundaEv.Programacion.Ejercicio11;

import java.awt.*;
import java.util.*;
import java.util.List;

public class DibujoApp extends Frame {
    private int tipo;
    DosPuntos actual;
    List<DosPuntos> lista = new ArrayList<DosPuntos>();


    public static void main(String[] args) {
        DibujoApp app = new DibujoApp();
    }


    public DibujoApp() {
        super("Dibujando objetos");

        setupMenuBar();
        tipo = DosPuntos.LINEA;

        pack();
        setSize(400, 400);
        setVisible(true);
    }

    public void setupMenuBar() {     //Metodo setupMenuBar
        MenuBar menuBar = new MenuBar();            //Crea la barra de menú
        //Primer menú
        Menu menu1 = new Menu("Fichero");
        menu1.add(new MenuItem("Nuevo"));
        menu1.addSeparator();
        menu1.add(new MenuItem("Salir"));
        menuBar.add(menu1);
        //Segundo menú
        Menu menu2 = new Menu("Dibujar");
        menu2.add(new MenuItem("Línea"));
        menu2.add(new MenuItem("Óvalo"));
        menu2.add(new MenuItem("Rectángulo"));
        menuBar.add(menu2);

        setMenuBar(menuBar);
    }

    public void paint(Graphics g) {
        //Dibujamos el objeto y lo añadimos a la lista
//      for (int i = 0; i < lista.size(); i++)
//          lista.get(i).paint(g);
        if (actual != null)
            actual.paint(g);
        for (DosPuntos item : lista)
            item.paint(g);
    }

    public boolean mouseDown(Event ev, int x, int y) {
        actual = new DosPuntos(x, y, tipo);
        repaint();
        return true;
    }

    public boolean mouseDrag(Event ev, int x, int y) {
        actual.setPosFinX(x);
        actual.setPosFinY(y);
        repaint();
        return true;
    }

    public boolean mouseUp(Event ev, int x, int y) {
        lista.add(actual);
        actual = null;
        return true;
    }

    public boolean action(Event ev, Object obj) {
        if (ev.target instanceof MenuItem)
            if (ev.arg.equals("Salir")) {
                System.exit(0);
                return true;
            } else if (ev.arg.equals("Nuevo")) {
                lista.clear();
                repaint();
                return true;
            } else if (ev.arg.equals("Línea")) {
                tipo = DosPuntos.LINEA;
                return true;
            } else if (ev.arg.equals("Óvalo")) {
                tipo = DosPuntos.OVALO;
                return true;
            } else if (ev.arg.equals("Rectángulo")) {
                tipo = DosPuntos.RECTANGULO;
                return true;
            }
        return false;
    }

}
