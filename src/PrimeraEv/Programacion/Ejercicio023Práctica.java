package PrimeraEv.Programacion;
/*
Bucles anidados
Cada fila del bucle, se mueven los valores del vector hacia la derecha 1 posición
y el ultimo pasa a ser el primero
 */
public class Ejercicio023Práctica {
    public static void main(String[] args) {
        int[] datos = {10, -20, 30, -40, 50, 60};
        int aux;
        for (int i = 0; i < datos.length; i++) {
            aux = datos[datos.length - 1];
            for (int j = datos.length - 1; j > 0; j--) {
                datos[j] = datos[j - 1];
            }
            datos[0] = aux;
            for (int j = 0; j < datos.length; j++) {
                System.out.print(datos[j] + " ");
            }
            System.out.println();
        }
    }
}