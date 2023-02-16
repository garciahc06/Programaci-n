package PrimeraEv.Programacion;

/*
Ordenación de un vector. Método burbuja.
Comparamos los elementos del vector entre sí, y los vamos intercambiando de posición si no están ordenados.
 */
public class Ejercicio040 {
    public static void main(String[] args) {
        int[] vector = {25, 2, 73, 81, 16, 4, 33};
        int aux;
        //bucle anidado decrementativo
        //Modificar el bucle anidado para que en cada iteración haga una comparación menos
        for (int a = 0; a < vector.length; a++) {
            for (int i = vector.length - 1; i > a; i--) {
                if (vector[i] < vector[i - 1]) {
                    aux = vector[i];
                    vector[i] = vector[i - 1];
                    vector[i - 1] = aux;
                }
            }
        }
        for (int j : vector) System.out.printf("%d - ", j);
    }
}
