package PrimeraEv.Programacion;
/*
Mostrar por pantalla el nombre del alumno que mejores notas ha sacado y cúal el su media
Y el nombre del alumno que peores notas ha sacado y cuál es su media.
Despues mostrar la asignatura con mejores notas y su media y la que tiene peores notas y su media.
 */
public class Ejercicio035EXAMEN {
    public static void main(String[] args) {
        int[][] notas = {{7, 9, 3, 8},
                        {10, 9, 9, 8},
                        {9, 10, 7, 1},
                        {8, 5, 4, 5},
                        {3, 10, 5, 6}};
        String[] asignaturas = {"Programacion", "Lenguajes", "Sistemas", "Bases de datos"};
        String[] alumnos = {"Ismael Abed", "Mikel Aramburu", "Ismael Bernad", "Ignacio Bielsa", "Marcos Burgos"};
        int[] mediaalumnos = {0, 0, 0, 0, 0};
        int[] mediaasignaturas = {0, 0, 0, 0};
        int max = 0, min = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                mediaalumnos[i] += notas[i][j];
                mediaasignaturas[j] += notas[i][j];
            }
            mediaalumnos[i] /= notas[i].length;
            if (mediaalumnos[i] > mediaalumnos[max])
                max = i;
            if (mediaalumnos[i] < mediaalumnos[min])
                min = i;
        }
        for (int i = 0; i < mediaasignaturas.length; i++) {
            mediaasignaturas[i] /= notas.length;
            if (mediaasignaturas[i] > mediaasignaturas[max])
                max = i;
            if (mediaasignaturas[i] < mediaasignaturas[min])
                min = i;
        }
        System.out.printf("El alumno con mejores notas es %s con una media de %d\n", alumnos[max], mediaalumnos[max]);
        System.out.printf("El alumno con peores notas es %s con una media de %d\n", alumnos[min], mediaalumnos[min]);
        System.out.printf("La asignatura con mejores notas es %s con una media de %d\n", asignaturas[max], mediaasignaturas[max]);
        System.out.printf("La asignatura con peores notas es %s con una media de %d\n", asignaturas[min], mediaasignaturas[min]);
    }
}
