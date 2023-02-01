package SegundaEv.Programacion.Ejercicio05;

public class Programa {
    public static void main(String[] args) {
        Bombo bombo = new Bombo();
        int tabla[][] = new int[6][8];
        cargarTabla(bombo, tabla);
        mostrarTabla(tabla);
    }

    private static void mostrarTabla(int[][] tabla) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void cargarTabla (Bombo bombo, int[][] tabla) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                tabla[i][j] = bombo.sacarBola();
            }
        }
    }
}
