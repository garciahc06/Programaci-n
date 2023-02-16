package SegundaEv.Estudio;

import java.util.LinkedList;
import java.util.List;

public class Debuger {

    private double suma;
    private List<Double> lista;

    public Debuger() {
        System.out.println("construyendo clase");
    }

    public double echaCuentas() {
        lista = new LinkedList<Double>();
        for (int i = 0; i < 100; i++) {
            lista.add((double) i);
        }
        suma = 5.0;
        for (Double valor : lista) {
            suma += valor;
        }
        return suma;
    }

}
