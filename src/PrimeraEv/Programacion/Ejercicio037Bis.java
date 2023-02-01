package PrimeraEv.Programacion;
/*
Mismo que Ejercicio037 pero sin matriz auxiliar
Obtener la matriz traspuesta de una tabla cuadrada y mostrar el resultado por pantalla
 */
public class Ejercicio037Bis {
    public static void main(String[] args){
        int[][] tabla = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println("La tabla traspuesta es : \n");
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.printf("%d - ", tabla[j][i]);
            }
            System.out.println();
        }
        //Hacemos lo mismo pero con una variable int llamada intercambio
        int intercambio;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = i; j < tabla[i].length; j++) {
                intercambio = tabla[i][j];
                tabla[i][j] = tabla[j][i];
                tabla[j][i] = intercambio;
            }
        }
        System.out.println("La tabla traspuesta es : \n");
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.printf("%d - ", tabla[i][j]);
            }
            System.out.println();
        }
    }
}
