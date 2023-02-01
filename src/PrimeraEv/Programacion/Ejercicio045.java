package PrimeraEv.Programacion;

/*
Instanciamos un array bidimensional de enteros con los salarios de los empleados y creamos
y llamamos a una funcion que nos sume todos los salarios
 */
public class Ejercicio045 {
    public static void main(String[] args) {
        int[][] salarios = {{700, 900, 1300, 800, 790, 850},
                {1000, 950, 1080, 1070, 1200, 1100},
                {1300, 930, 1200, 1170, 1000, 1000},
                {1500, 1950, 1880, 1970, 2200, 2100}};
        int total = sumaSalarios(salarios);
        System.out.printf("El total de salarios es %d", total);
    }
    public static int sumaSalarios(int[][] salarios) {
        int total = 0;
        for (int i = 0; i < salarios.length; i++) {
            for (int j = 0; j < salarios[i].length; j++)
                total += salarios[i][j];
        }
        return total;
    }
}
