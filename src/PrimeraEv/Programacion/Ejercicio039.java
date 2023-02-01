package PrimeraEv.Programacion;
/*
Calcular la media de goles de cada futbolista, por temporada.
 */
public class Ejercicio039 {
    public static void main(String[] args) {
        int[][] goles = {{18, 19, 22, 33, 8},
                        {22, 24, 19, 18, 10},
                        {19, 20, 31, 22, 34},
                        {13, 14, 15, 16, 17},
                        {18, 19, 20, 21, 22}};
        String[] futbolistas = {"Messi", "Ronaldo", "Halland", "Mbappe", "Vinicius"};
        String[] temporadas = {"21/22", "20/21", "19/20", "18/19", "17/18"};
        for (int j=0; j < futbolistas.length; j++) {
            double acum = 0;
            for (int i = 0; i < goles.length; i++)
                acum += goles[i][j];
            System.out.printf("El futbolista %s ha marcado una media de %.2f goles por temporada\n", futbolistas[j], acum / goles.length);
        }
        System.out.println("\n"); //CALCULAMOS CUANTOS GOLES SE HAN METIDO EN CADA TEMPORADA Y MOSTRAMOS EL RESULTADO
//        for (int i = 0; i < temporadas.length; i++) {
//            int acumulador = 0;
//            for (int j = 0; j < goles[i].length; j++)
//                acumulador += goles[i][j];
//            System.out.printf("En la temporada %s se han marcado %d goles\n", temporadas[i], acumulador);
//        }
        //CALCULAMOS LA MEDIA DE GOLES POR TEMPORADA
for (int i = 0; i < temporadas.length; i++) {
            double acumulador = 0;
            for (int j = 0; j < goles[i].length; j++)
                acumulador += goles[i][j];
            System.out.printf("En la temporada %s se han marcado %.2f goles\n", temporadas[i], acumulador / goles[i].length);
        }

    }
}
