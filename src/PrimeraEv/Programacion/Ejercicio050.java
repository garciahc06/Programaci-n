package PrimeraEv.Programacion;
/*
Mostrar por pantalla, de cada empleado, lo que ha ganado en total.
Para esto, declarar y utilizar una funcion que reciba el vector de los salarios
de un empleado y devuelva la suma de todos ellos.
 */
public class Ejercicio050 {
    public static void main(String[] args){
        int[][] salarios = {{700, 900, 1300, 800, 790, 850},
                {1000, 950, 1080, 1070, 1200, 1100},
                {1300, 930, 1200, 1170, 1000, 1000},
                {1500, 1950, 1880, 1970, 2200, 2100}};
        String[] nombres = {"Juan", "Pedro", "Maria", "Luis"};
        //llamamos al metodo "sumaSalarios" y lo mostramos por pantalla
        for (int i = 0; i < salarios.length; i++)
            System.out.printf("%s ha ganado %d euros en total%n", nombres[i], sumaSalarios(salarios[i]));
    }
    public static int sumaSalarios(int[] sal){
        int suma = 0;
        for(int i = 0; i < sal.length; i++)
            suma += sal[i];
        return suma;
    }
}
