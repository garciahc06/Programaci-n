package PrimeraEv.Programacion;
/*
Implementar una función "sumarKilos" que te devuelva un vector de
2 elementos con los kilos que se han vendido de cada producto.
 */
public class Ejercicio054 {
    public static void main(String[] args){
        int [][] kilos = {{5, 6, 9, 23, 7, 14, 0},
                {16, 8, 4, 33, 15, 21, 0}};
        int[] precios = {6, 7};
        String[] productos = {"Manzanas", "Peras"};
        //lamamos a la funcion sumarKilos
        int[] sumaKilos = sumarKilos(kilos);
        //mostramos por pantalla los kilos vendidos de cada fruta
        for (int i = 0; i < sumaKilos.length; i++){
            System.out.printf("Kilos vendidos de %s: %d%n", productos[i], sumaKilos[i]);
        }

    }
    public static int[] sumarKilos(int[][] tabla){
        int[] kilos = new int[tabla.length];
        for(int i = 0; i < tabla.length; i++){
            for(int j = 0; j < tabla[i].length; j++){
                kilos[i] += tabla[i][j];
            }
        }
        return kilos;
    }
}
