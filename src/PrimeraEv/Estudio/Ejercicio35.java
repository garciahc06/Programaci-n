package PrimeraEv.Estudio;
/*
Mostrar por pantalla el nombre del alumno que mejores notas ha sacado y cúal el su media
Y el nombre del alumno que peores notas ha sacado y cuál es su media.
Despues mostrar la asignatura con mejores notas y su media y la que tiene peores notas y su media.
*/
public class Ejercicio35 {
    public static void main(String[] args) {
        int[][] notas = {{7, 9, 3, 8},
                {10, 9, 9, 8},
                {9, 10, 7, 1},
                {8, 5, 4, 5},
                {3, 10, 5, 6}};
        String[] asignaturas = {"Programacion", "Lenguajes", "Sistemas", "Bases de datos"};
        String[] alumnos = {"Ismael Abed", "Mikel Aramburu", "Ismael Bernad", "Ignacio Bielsa", "Marcos Burgos"};
        //1er apartado
        int[] mediaAlumnos = {0, 0, 0, 0 , 0};
        int[] mediaAsignaturas = {0, 0, 0, 0};
        int max = 0, min = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                mediaAlumnos[i] += notas[i][j];
            }
            mediaAlumnos[i] /= notas[i].length;
        }
        for(int i = 0; i < mediaAlumnos.length; i++){
            if (mediaAlumnos[i] > mediaAlumnos[max])
                max = i;
            if (mediaAlumnos[i] < mediaAlumnos[min])
                min = i;
        }
        System.out.println("El alumno con mejores notas es " + alumnos[max] + " con una media de " + mediaAlumnos[max]);
        System.out.println("El alumno con peores notas es " + alumnos[min] + " con una media de " + mediaAlumnos[min]);

        //2º apartado
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                mediaAsignaturas[j] += notas[i][j];
            }
        }
        for (int i = 0; i < mediaAsignaturas.length; i++){
            mediaAsignaturas[i] /= notas.length;
        }
        for(int i = 0; i < mediaAsignaturas.length; i++){
            if (mediaAsignaturas[i] > mediaAsignaturas[max])
                max = i;
            if (mediaAsignaturas[i] < mediaAsignaturas[min])
                min = i;
        }
        System.out.println("La asignatura con mejores notas es " + asignaturas[max] + " con una media de " + mediaAsignaturas[max]);
        System.out.println("La asignatura con peores notas es " + asignaturas[min] + " con una media de " + mediaAsignaturas[min]);
    }
}
