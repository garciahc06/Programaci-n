package PrimeraEv.Programacion;
/*
Mostrar por pantalla la película más taquillera y cuántas entradas ha vendido
y la menos taquillera y cuántas ha vendido.
 */

public class Ejercicio033 {
    public static void main(String[] args){
        int[][] salas = {{32, 28, 37, 99, 45, 72, 81}, {66, 60, 70, 89, 60, 46, 21}, {58, 79, 36, 98, 85, 78, 80}, {92, 67, 52, 104, 40, 83, 92}};
        String[] peliculas = {"Avatar", "Gran Torino", "Blonde", "Harry potter"};
        int[] acumulador = {0, 0, 0, 0};
        int max = 0, min = 0;
        for(int i=0; i<salas.length; i++) {
            for (int j = 0; j < salas[i].length; j++) {
                acumulador[i] += salas[i][j];
            }
        }
        for(int i=0; i<acumulador.length; i++){
            if(acumulador[i] > acumulador[max])
                max = i;
            if(acumulador[i] < acumulador[min])
                min = i;
        }
        System.out.printf("La pelicula mas taquillera es %s con %d entradas\n", peliculas[max], acumulador[max]);
        System.out.printf("La pelicula menos taquillera es %s con %d entradas\n", peliculas[min], acumulador[min]);
    }
}
