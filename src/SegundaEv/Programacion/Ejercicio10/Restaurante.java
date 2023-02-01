package SegundaEv.Programacion.Ejercicio10;

import java.awt.*;

public class Restaurante extends Frame {
    String[] comidas = {"Desayuno", "Comida", "Cena"};
    String[][] platos = {{"Café", "Té", "Leche", "Churros", "Zumo de naranja", "Cereales"},
            {"Hamburguesa", "Solomillo", "Ensalada", "Albondigas", "Pescado", "Pasta"},
            {"Sopa", "Pescado", "Hamburguesa", "Pizza", "Ensalada", "Tortilla"}};
    List presentar;
    List listaPlatos[];
    Choice horario;
    TextField texto;

    public static void main(String[] args) {
        Restaurante app = new Restaurante();
    }

    public Restaurante() {
        super("Comanda");
        setup();


        this.pack();
        this.setSize(275, 175);
        this.setVisible(true);
    }


    public void setup() {
        this.add("North", new Label("Elige tu comanda", Label.CENTER));

        horario = new Choice();
        for (int i = 0; i < comidas.length; i++)
            horario.addItem(comidas[i]);

        this.add("West", horario);


        listaPlatos = new List[platos.length];

        for (int i = 0; i < listaPlatos.length; i++) {
            listaPlatos[i] = new List(5, true);
            for (int j = 0; j < platos[i].length; j++) {
                listaPlatos[i].addItem(platos[i][j]);
            }
        }

        presentar = listaPlatos[0];
        this.add("East", presentar);


        texto = new TextField("", 40);
        this.add("South", texto);

    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        } else if (ev.id == Event.ACTION_EVENT) {
            if (ev.target instanceof Choice) {
                this.remove(this.presentar);
                this.presentar = listaPlatos[horario.getSelectedIndex()];
                this.add("East", presentar);
                texto.setText(horario.getSelectedIndex() + ": ");
                this.show();
                return true;
            }
        } else if ((ev.id == Event.LIST_SELECT) || (ev.id == Event.LIST_DESELECT)) {
            String frase = "";
           frase = horario.getSelectedIndex() + ": ";
            String[] items = presentar.getSelectedItems();
            for (int i = 0; i < items.length; i++) {
                frase += items[i] + ", ";
            }
            texto.setText(frase);
            return true;
        }
        return false;
    }
}