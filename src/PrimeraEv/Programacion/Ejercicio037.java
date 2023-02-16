package PrimeraEv.Programacion;

/*
Obtener la matriz traspuesta de una tabla cuadrada y mostrar el resultado.
*/
public class Ejercicio037 {
    public static void main(String[] args) {
        int[][] tabla = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] traspuesta = new int[tabla.length][tabla.length];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                traspuesta[j][i] = tabla[i][j];
            }
        }
        System.out.println("La tabla traspuesta es : ");
        for (int i = 0; i < traspuesta.length; i++) {
            for (int j = 0; j < traspuesta[i].length; j++) {
                System.out.printf("%d - ", traspuesta[i][j]);
            }
            System.out.println();
        }
    }
}
