package PrimeraEv.Programacion;

/*
En "salas" tenemos guardados el número de espectadores que visitan cada una de
las cuatro salas cada día de la semana.
Mostrar por pantalla el día que mas entradas se vendieron y cuantas entradas se vendieron.
Tambíen mostrar el día que menos se vendieron y cuantas.
 */
public class Ejercicio032 {
    public static void main(String[] args) {
        int[][] salas = {{10, 20, 30, 40, 50, 60, 70}, {80, 90, 100, 110, 120, 130, 140}, {150, 160, 170, 180, 190, 200, 210}, {220, 230, 240, 250, 260, 270, 280}};
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int[] suma = {0, 0, 0, 0, 0, 0, 0};
        int max = 0, min = 0;
        for (int i = 0; i < salas.length; i++) {
            for (int j = 0; j < salas[i].length; j++) {
                suma[j] += salas[i][j];
                if (suma[j] > suma[max])
                    max = j;
                if (suma[j] < suma[min])
                    min = j;
            }
        }
        System.out.printf("El dia que mas entradas se vendieron fue el %s con %d entradas\n", dias[max], suma[max]);
        System.out.printf("El dia que menos entradas se vendieron fue el %s con %d entradas\n", dias[min], suma[min]);
    }
}
