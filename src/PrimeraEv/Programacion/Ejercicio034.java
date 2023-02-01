package PrimeraEv.Programacion;
/*
Mostrar por pantalla el nombre de la película que consiguió mayor número de espectadores en un día
y que día de la semana ocurrió esto.
Lo mismo con la película que menos espectadores tuvo en un día.

 */
public class Ejercicio034 {
    public static void main(String[] args) {
        int[][] salas = {{32, 28, 37, 99, 45, 72, 81}, {66, 60, 70, 89, 60, 46, 21}, {58, 79, 56, 98, 85, 78, 80}, {32, 67, 52, 104, 40, 83, 92}};
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        String[] peliculas = {"Avatar", "Gran Torino", "Blonde", "Harry potter"};
        int posMaxFila = 0, posMaxCol = 0, posMinFila = 0, posMinCol = 0;
        for(int i=0; i<salas.length; i++){
            for(int j=0; j<salas[i].length; j++){
                if(salas[i][j] > salas[posMaxFila][posMaxCol]){
                    posMaxFila = i;
                    posMaxCol = j;
                }
                if(salas[i][j] < salas[posMinFila][posMinCol]){
                    posMinFila = i;
                    posMinCol = j;
                }
            }
        }
        System.out.printf("La pelicula que mas espectadores tuvo fue %s con %d espectadores el dia %s\n", peliculas[posMaxFila], salas[posMaxFila][posMaxCol], dias[posMaxCol]);
        System.out.printf("La pelicula que menos espectadores tuvo fue %s con %d espectadores el dia %s\n", peliculas[posMinFila], salas[posMinFila][posMinCol], dias[posMinCol]);
    }
}
