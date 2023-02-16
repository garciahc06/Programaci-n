package PrimeraEv.Programacion;
/*
Sumar las columnas y filas de la tabla creando 2 vectores nuevos
tras la suma de dichas columnas y filas.
 */
public class Ejercicio029 {
    public static void main(String[] args) {
        int[][] tabla = {{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120}};
        int[] v1 = {0, 0, 0};
        int[] v2 = {0, 0, 0, 0};
        int i, j;
        //suma de las columnas y filas de la tabla
        for (i = 0; i < tabla.length; i++) {
            for (j = 0; j < tabla[i].length; j++) {
                v1[i] += tabla[i][j];
                v2[j] += tabla[i][j];
            }//Mostramos por pantalla los vectores creados tras la suma de las columnas y filas
        }
        for (i = 0; i < v1.length; i++)
            System.out.printf("%d - ", v1[i]);
        System.out.println();
        for (i = 0; i < v2.length; i++)
            System.out.printf("%d - ", v2[i]);
        System.out.println();
    }
}