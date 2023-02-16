package PrimeraEv.Programacion;
/*
Mismo ejercicio que el Ejercicio052 pero los datos de venta se guardarán
en una tabla nueva.
 */
public class Ejercicio053 {
    public static void main(String[] args){
        int [][] kilos = {{5, 6, 9, 23, 7, 14, 0},
                        {16, 8, 4, 33, 15, 21, 0}};
        int[] precios = {6, 7};
        int[][] beneficios = beneficios(kilos, precios);
        for (int i = 0; i < beneficios.length; i++){
            for (int j = 0; j < beneficios[i].length; j++)
                System.out.printf("%d - ", beneficios[i][j]);
            System.out.println();
        }
    }
    public static int[][] beneficios(int[][] tabla, int[] pr){
        int[][] beneficios = new int[tabla.length][tabla[0].length];
        for(int i = 0; i < tabla.length; i++){
            for(int j = 0; j < tabla[i].length; j++){
                beneficios[i][j] = tabla[i][j] * pr [i];
            }
        }
        return beneficios;
    }
}
