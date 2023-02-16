package PrimeraEv.Programacion;

/* Tabla de 3x4 y los números negativos, los pasamos a positivos
y los positivos los multiplicamos x2
 */
public class Ejercicio027 {
    public static void main(String[] args) {
        int[][] tabla = {{10, -20, 30}, {-40, 50, -60}, {70, -80, 90}, {-100, 110, -120}};
        int i;
        for (i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] < 0) {
                    tabla[i][j] = tabla[i][j] * -1;
                } else {
                    tabla[i][j] = tabla[i][j] * 2;
                }
                System.out.print(tabla[i][j] + " - ");
            }
            System.out.println();
        }
    }
}

