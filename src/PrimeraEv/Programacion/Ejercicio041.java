package PrimeraEv.Programacion;

/*
Ordenación de un vector. Ordenación directa.
Buscamos el elemento más pequeño del vector y lo intercambiamos con el elemento de la primera posición y así sucesivamente.
 */
public class Ejercicio041 {
    public static void main(String[] args) {
        int[] vector = {25, 2, 73, 81, 16, 4, 33};
        int min, aux;
        for (int i = 0; i < vector.length; i++) {
            min = i;
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j] < vector[min])
                    min = j;
            }
            aux = vector[i];
            vector[i] = vector[min];
            vector[min] = aux;


        }
        for (int i : vector) System.out.printf("%d - ", i);
    }
}
