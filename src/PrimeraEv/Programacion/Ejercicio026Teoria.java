package PrimeraEv.Programacion;

/*
Creación y manipulación de una tabla
 */
public class Ejercicio026Teoria {
    public static void main(String[] args) {
        int[][] tabla = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}, {100, 110, 120}};
        //Mostrar por pantalla el contenido de la tabla
        for (int i = 0; i < tabla.length; i++){
            for (int j = 0; j < tabla[i].length; j++)
                System.out.print(tabla[i][j] + " ");
            System.out.println();
        }

    }
}