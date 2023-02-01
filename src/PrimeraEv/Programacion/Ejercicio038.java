package PrimeraEv.Programacion;
/*
Intercambiar las diagonales principales de una matriz cuadrada y que los demás elementos no se modifiquen.
 */

public class Ejercicio038 {
    public static void main(String[] args) {
        int[][] tabla = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int intercambio;
        //Intercambiamos las diagonales principales
        for (int i = 0; i < tabla.length; i++){
            intercambio = tabla[i][i];
            tabla[i][i] = tabla[i][tabla.length - 1 - i];
            tabla[i][tabla.length - 1 - i] = intercambio;
        }
        //Mostramos la tabla
        System.out.println("La tabla es :");
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.printf("%d - ", tabla[i][j]);
            }
            System.out.println();
        }
    }
}
