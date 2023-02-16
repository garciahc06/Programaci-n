package PrimeraEv.Programacion;
/*
Multiplicar una tabla por un vector en una nueva tabla de 4x4
*/
public class Ejercicio097 {
    public static void main(String[] args) {
        int[][] tabla = {{1, 2, 3, 4}, {2, 4, 6, 8}, {3, 6, 9, 12}, {4, 8, 12, 16}};
        int[] vector = {1, 2, 3, 4};
        int[][] resultado = new int[tabla.length][tabla.length];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                resultado[i][j] = tabla[i][j] * vector[j];
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }
    }
}