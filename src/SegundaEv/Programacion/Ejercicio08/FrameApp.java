package SegundaEv.Programacion.Ejercicio08;

import java.awt.*;

public class FrameApp extends Frame {
    MenuBar porDefecto;
    MenuBar alternativo;
    String tituloInicial;
    int[] cursores = {Cursor.DEFAULT_CURSOR, Cursor.CROSSHAIR_CURSOR, Cursor.HAND_CURSOR, Cursor.MOVE_CURSOR, Cursor.WAIT_CURSOR, Cursor.TEXT_CURSOR, Cursor.N_RESIZE_CURSOR, Cursor.S_RESIZE_CURSOR, Cursor.E_RESIZE_CURSOR, Cursor.W_RESIZE_CURSOR, Cursor.NE_RESIZE_CURSOR, Cursor.NW_RESIZE_CURSOR, Cursor.SE_RESIZE_CURSOR, Cursor.SW_RESIZE_CURSOR, Cursor.NW_RESIZE_CURSOR, Cursor.NE_RESIZE_CURSOR, Cursor.SW_RESIZE_CURSOR, Cursor.SE_RESIZE_CURSOR, Cursor.HAND_CURSOR, Cursor.MOVE_CURSOR};
    int indCursor = 0;
    Color[] colores = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};
    int indFondo = 0;
    int indTexto = 0;
    String[] fuentes = {"Arial", "Courier", "Dialog", "DialogInput", "Helvetica", "TimesRoman"};
    int indFuente = 0;
    public static void main(String[] args) {
        FrameApp app = new FrameApp();

    }

    public FrameApp() {      //Constructor
        super("Propiedades del Frame");
        tituloInicial = super.getTitle();
        setup();
        this.pack();
        setSize(400, 400);
        setVisible(true);
    }

    public void paint(Graphics g) { //Metodo para pintar
        g.drawString("Cambia el color al pulsar Foreground", 100, 150);
    }

    public void setup() {    //Metodo para establecer la configuración
        setupMenuBar();
        setupPaneles();
    }

    public void setupPaneles() {
        Panel principal = new Panel();
        principal.setLayout(new GridLayout(4, 1));

        principal.add(new Label("Cambiar las características de la ventana", Label.CENTER));
        Panel panel1 = new Panel();                    //Primer panel de botones
        panel1.add(new Button("MenuBar"));
        panel1.add(new Button("Título"));
        panel1.add(new Button("Resizable"));
        principal.add(panel1);

        principal.add(new Label("Salidas en la ventana", Label.CENTER));

        Panel panel2 = new Panel();                    //Segundo panel de botones
        panel2.add(new Button("Cursor"));
        panel2.add(new Button ("Background"));
        panel2.add(new Button ("Foreground"));
        panel2.add(new Button ("Fuente"));

        principal.add(panel2);
        this.add("South", principal);
    }

    public void setupMenuBar() {                //Creación de la barra de menú
        porDefecto = new MenuBar();
        Menu fileMenu = new Menu("File");
        fileMenu.add(new MenuItem("Exit"));
        porDefecto.add(fileMenu);
        this.setMenuBar(porDefecto);            //Metemos porDefecto en el Frame
        alternativo = new MenuBar();
        Menu fileMenu2 = new Menu("Archivo");
        fileMenu2.add(new MenuItem("salir"));
        alternativo.add(fileMenu2);
    }

    public boolean handleEvent(Event ev) {     //Gestión de eventos
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        } else if (ev.id == Event.ACTION_EVENT) {
            if (ev.target instanceof Button) {
                if (ev.arg.equals("MenuBar")) {            //Cambiar la barra de menú
                    if (this.getMenuBar() == porDefecto)
                        this.setMenuBar(alternativo);
                    else
                        this.setMenuBar(porDefecto);
                    return true;
                } else if (ev.arg.equals("Título")) {      //Cambiar el título
                    if (this.getTitle() == tituloInicial)
                        this.setTitle("Título alternativo");
                    else
                        this.setTitle(tituloInicial);
                    return true;
                } else if (ev.arg.equals("Resizable")) {   //Cambiar la propiedad resizable
                        this.setResizable(false);
                    return true;
                } else if (ev.arg.equals("Cursor")){       //Cambiar el cursor
                    this.setCursor(cursores[indCursor]);
                    indCursor++;
                    if (indCursor == cursores.length)
                        indCursor = (indCursor + 1) % cursores.length;
                    return true;
                } else if (ev.arg.equals("Background")) {  //Cambiar el color de fondo
                    this.setBackground(colores[indFondo]);
                    indFondo = (indFondo + 1) % colores.length;
                } else if (ev.arg.equals("Foreground")) {  //Cambiar el color del texto
                    this.setForeground(colores[indTexto]);
                    indTexto = (indTexto + 1) % colores.length;
                } else if (ev.arg.equals("Fuente")) {      //Cambiar la fuente
                    this.setFont(new Font(fuentes[indFuente], Font.PLAIN, 12));
                    indFuente = (indFuente + 1) % fuentes.length;
                }
            }
        }
        return false;
    }
}
