package PrimeraEv.Programacion;

/*
Mostrar por pantalla cuantos kilos de cada pruducto que hemos vendido
 */
public class Ejercicio030 {
    public static void main(String[] args) {
        int[][] tabla = {{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120}};
        String[] productos = {"Naranjas", "Peras", "Manzanas"};
        for (int i = 0; i < tabla.length; i++) {
            int suma = 0;
           for(int j = 0; j < tabla[i].length; j++)
               suma += tabla[i][j];
           System.out.printf("Se han vendido %d kilos de %s\n", suma, productos[i]);
        }
    }
}
