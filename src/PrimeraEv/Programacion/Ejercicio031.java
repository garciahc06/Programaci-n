package PrimeraEv.Programacion;
/*
Mostrar por pantalla, de cada producto el dinero recaudado y tambíen
el dinero recaudado en total
*/

public class Ejercicio031 {
    public static void main(String[] args) {
        int[][] tabla = {{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120}};
        String[] productos = {"Naranjas", "Peras", "Manzanas"};
        double[] precios = {1.5, 2, 0.8};
        double total = 0;
        int suma;
        for (int i = 0; i < tabla.length; i++) {
            suma = 0;
            for (int j = 0; j < tabla[i].length; j++)
                suma += tabla[i][j];
            total += suma * precios[i];
            System.out.printf("He obtenido %.2f€ de las %s\n", suma * precios[i], productos[i]);
        }
        System.out.printf("El dinero recaudado en total es de %.2f euros", total);
    }
}
