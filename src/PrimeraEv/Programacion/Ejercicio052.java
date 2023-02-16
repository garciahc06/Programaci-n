package PrimeraEv.Programacion;
/*
Implementar un método que modifique el contenido de la tabla "kilos"
multiplicando cada uno de sus elementos por su precio.
Sus precios estan en el vector de "precios".
 */
public class Ejercicio052 {
    public static void main(String[] args){
        int[][] kilos = {{5, 6, 9, 23, 7, 14, 0},
                        {16, 8, 4, 33, 15, 21, 0}};
        int[] precios = {6, 7};
        beneficios(kilos, precios);
        for (int i = 0; i < kilos.length; i++){
            for (int j = 0; j < kilos[i].length; j++)
                System.out.printf("%d - ", kilos[i][j]);
            System.out.println();
        }
    }
    public static void beneficios(int[][] tabla, int[] pr){
        for(int i = 0; i < tabla.length; i++){
            for(int j = 0; j < tabla[i].length; j++){
                tabla[i][j] *= pr[i];
            }
        }
    }
}
