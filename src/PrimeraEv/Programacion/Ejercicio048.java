package PrimeraEv.Programacion;

/*
Ordenar los vectores de una tabla, llamando  a un vector "ordenar"
 */
public class Ejercicio048 {
    public static void main(String[] args) {
        int[][] salarios = {{700, 900, 1300, 800, 790, 850},
                {1000, 950, 1080, 1070, 1200, 1100},
                {1300, 930, 1200, 1170, 1000, 1000},
                {1500, 1950, 1880, 1970, 2200, 2100}};
        //llamamos a la funcion ordenar 4 veces para mostrar por pantalla los vectores ordenados
        for (int i = 0; i < salarios.length; i++)
            ordenar(salarios[i]);
        for (int i = 0; i < salarios[i].length; i++) {
            for (int k = 0; k < salarios[i].length; k++)
                System.out.printf("%d - ", salarios[i][k]);
            System.out.println();
        }

    }

    //ordenamos el vector de menor a mayor
    public static void ordenar(int v[]) {
        int aux;
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] > v[j]) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }

    }
}
