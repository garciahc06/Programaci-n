package SegundaEv.Programacion.Ejercicio07;

import java.awt.*;
import java.io.*;

public class Editor extends Frame {
    TextArea texto;
    MenuBar menuBar;
    FileDialog abrirFichero;
    FileDialog guardarFichero;

    public static void main(String[] args) {

        Editor app = new Editor();
    }

    public Editor() {
        super("Editor de textos");
        setup();

        //Construimos ventana
        this.pack();
        setSize(texto.getMinimumSize()); //this.resize(texto.minimmSize());
        setVisible(true);
    }

    public void setup() { //Metodo para establecer la configuración
        texto = new TextArea(20, 50);
        this.add("Center", texto);
        setupMenuBar();
        abrirFichero = new FileDialog(this, "Abrir fichero", FileDialog.LOAD);
        guardarFichero = new FileDialog(this, "Guardar fichero", FileDialog.SAVE);
    }

    public void setupMenuBar() { //Configuración del menu
        menuBar = new MenuBar();
        Menu menuArchivo = new Menu("Archivo");
        menuArchivo.add(new MenuItem("Nuevo"));
        menuArchivo.add(new MenuItem("Abrir..."));
        menuArchivo.addSeparator();
        menuArchivo.add(new MenuItem("Guardar..."));
        menuArchivo.addSeparator();
        menuArchivo.add(new MenuItem("Salir"));
        menuBar.add(menuArchivo);
        this.setMenuBar(menuBar);
    }
    public void abrirFichero(String nombreFichero) { //Borra el texto introducido y, abre y carga el seleccionado en el editor
        
    }
    public void guardarFichero(String nombreFichero) {
        DataOutputStream outStream;
        try {
            outStream = new DataOutputStream(new FileOutputStream(nombreFichero));
            outStream.writeBytes(texto.getText());
        } catch (FileNotFoundException e) {}
        catch (IOException e) {}
    }

    public boolean handleEvent(Event ev) { //Metodo para gestionar eventos
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        } else if (ev.id == Event.ACTION_EVENT) {
            if (ev.target instanceof MenuItem) {
                if (ev.arg.equals("Salir")) {
                    System.exit(0);
                    return true;
                } else if (ev.arg.equals("Nuevo")) {
                    texto.setText(" ");
                    return true;
                } else if (ev.arg.equals("Abrir...")) {
                    abrirFichero.setVisible(true);
                    String nomFichero = abrirFichero.getDirectory() + "/" + abrirFichero.getFiles();
                    abrirFichero(nomFichero);
                    return true;
                } else if (ev.arg.equals("Guardar...")){
                    guardarFichero.setVisible(true);
                    String guardFichero = guardarFichero.getDirectory() + guardarFichero.getFile();
                    guardarFichero(guardFichero);
                    return true;
                }
            }
        }
        return false;
    }
//    El codigo está mal en algun lado
}