package SegundaEv.Programacion.Ejercicio09;

import org.w3c.dom.Text;

import java.awt.*;
import java.lang.reflect.Constructor;
import java.util.Vector;

public class Objetos extends Frame {
    TextArea textArea;

    public static void main(String[] args) {   //Metodo main
        Objetos app = new Objetos();
    }

    public Objetos() {             //Constructor
        super("Objetos comunes");
        setup();

        pack();
        setSize(400, 400);
        setVisible(true);
    }

    public void setup() {       //Metodo setup
        Panel principal = new Panel();
        principal.setLayout(new GridLayout(3, 3));
        Panel[][] paneles = new Panel[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                paneles[i][j] = new Panel();

        //Panel 1
        paneles[0][0].add(new Label("Campo de texto: "));
        paneles[0][0].add(new MiTextField("", 15));
        principal.add(paneles[0][0]);

        //Panel 2
        textArea = new TextArea(5, 15);
        textArea.setBackground(Color.yellow);
        paneles[0][1].add(textArea);
        principal.add(paneles[0][1]);

        //Panel 3

        paneles[0][2].add(new MiButton("Limpiar", textArea));
        principal.add(paneles[0][2]);

        //Panel 4
//        Choice eleccion = new Choice();
//        eleccion.add("Uno");
//        eleccion.add("Dos");
        String[] opciones = {"Sí", "No", "Quizás"};
        paneles[1][0].add(new MiChoice(opciones, textArea));
        principal.add(paneles[1][0]);

        //Panel 5
        String[] deportes = {"Fútbol", "Baloncesto", "Tenis", "Natación", "Atletismo", "Esgrima"};
        paneles[1][1].add(new MiLista(deportes, textArea));
        principal.add(paneles[1][1]);

        //Panel 6
        paneles[1][2].add(new MiCanvas());
        principal.add(paneles[1][2]);

        //Panel 7
        String[] alimentos = {"Leche", "Carne", "Pescado", "Fruta"};
        paneles[2][0].add(new MiCheckBosxGroup(alimentos));
        principal.add(paneles[2][0]);

        this.add("Center", principal);
    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        }
        return false;
    }
}

class MiTextField extends TextField {
    MiTextField(String valor, int longitud) {
        super(valor, longitud);
    }
    public boolean action(Event ev, Object obj) {
        this.setText(this.getText().toUpperCase());
        return false;
    }
}

class MiButton extends Button {
    TextArea text;
    MiButton(String valor, TextArea ta) {
        super(valor);
        text = ta;
    }
    public boolean action(Event ev, Object obj) {
        text.setText(" ");
        return false;
    }
}

class MiChoice extends Choice {
    TextArea tx;
    MiChoice(String[] opciones, TextArea tx) {
        super();
        for (int i = 0; i < opciones.length; i++)
            this.add(opciones[i]);
        this.tx = tx;
    }
    public boolean action(Event ev, Object obj) {
        tx.setText(this.getSelectedItem());
        return true;
    }
}

class MiLista extends List {
    TextArea texto;
    MiLista(String[] deportes, TextArea tr){
        super(5, true);
        for (int i = 0; i < deportes.length; i++)
            this.add(deportes[i]);
        texto = tr;
    }
    public boolean handleEvent(Event ev){
        if ((ev.id == Event.LIST_SELECT) || (ev.id == Event.LIST_DESELECT)) {
            String[] v = this.getSelectedItems();
            String s = "";
            for (int i = 0; i < v.length; i++)
                s += v[i] + "\n";
            texto.setText(s);
            return true;
        }
        return false;
    }
}

class MiCanvas extends Canvas {
    int posx = 25;
    int posy = 25;
    MiCanvas() {
        super();
        this.setSize(75, 75);
        this.setBackground(Color.red);
        this.setForeground(Color.white);
        this.setVisible(true);
    }
    public void paint(Graphics g) {
       g.fillRect(posx, posy, 5, 5);
    }
    public boolean mouseDown(Event ev, int x, int y) {
        posx = x;
        posy = y;
        repaint();
        return true;
    }
}

class MiCheckBosxGroup extends Panel{
    public TextField resultado;
    MiCheckBosxGroup(String[] alimentos) {
        super();
        this.setLayout(new GridLayout(alimentos.length + 1, 1));
        for (int i = 0; i < alimentos.length; i++)
            this.add(new Checkbox(alimentos[i]));
        this.add(resultado = new TextField("",15));
    }
    public boolean action(Event ev, Object obj) {
        return true;
    }
}