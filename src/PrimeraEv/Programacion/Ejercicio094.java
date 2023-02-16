package PrimeraEv.Programacion;

/*
Mostrar por pantalla el trimestre con mas nacimientos
Mes en el que más bajas se han producido .Defunciones y traslados fuera.
Mostrar por pantalla cuantas personas nuevas han inmigrado al pueblo y cuantas han emigrado.
 */
public class Ejercicio094 {
    public static void main(String[] args) {
        String[] movimientos = {"Nacimientos", "Defunciones", "Emigración", "Inmigracion"};
        int[][] poblacion = {{3, 2, 0, 0}, {1, 5, 0, 1}, {9, 4, 3, 1}, {0, 2, 9, 9},
                {3, 2, 6, 3}, {1, 5, 2, 4}, {3, 5, 4, 2}, {1, 7, 4, 4},
                {3, 5, 1, 2}, {1, 4, 6, 2}, {2, 9, 4, 5}, {2, 5, 6, 2}};
        int[] trimestres = {0, 0, 0, 0};
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        //Mostramos el trimiestre con mas nacimientos
        for (int i = 0; i < poblacion.length; i++)
            trimestres[i / 3] += poblacion[i][0];
        int max = 0;
        for (int i = 0; i < trimestres.length; i++) {
            if (trimestres[i] > trimestres[max]) {
                max = i;
            }
        }
        System.out.println("El trimestre con mas nacimientos es el " + (max + 1) + "º");

        //Mostramos el mes con mas defunciones sin un nuevo vector
        int max2 = 0;
        for (int i = 0; i <poblacion.length; i++) {
            if (poblacion[i][1] + poblacion[i][2] > poblacion[max2][1] + poblacion[max2][2]) {
                max2 = i;
            }
        }
        System.out.println("El mes con mas defunciones es " + meses[max2]);

        //Mostramos el mes con mas inmigracion
        int contador = 0;
        int contador2 = 0;
        for (int i = 0; i < poblacion.length; i++) {
            contador += poblacion[i][0] + poblacion[i][3];
            contador2 += poblacion[i][1] + poblacion[i][2];
        }
        System.out.println("Han inmigrado " + contador + " personas y han emigrado " + contador2);
    }
}
