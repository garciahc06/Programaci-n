package PrimeraEv.Programacion;

/*
nombramos una funcion "ordenar" que nos ordene los elementos de un array de enteros
 */
public class Ejercicio047 {
    public static void main(String[] args) {
        int[] array = {51, 32, 244, 11, 45};
        int[] arrayOrdenado = ordenar(array);
        for(int i = 0; i < array.length; i++)
            System.out.printf("%d - ", arrayOrdenado[i]);
    }
//ordenamos el vector de mayor a menor
    public static int[] ordenar(int[] array) {
        int aux;
           for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] < array[j]) {
                        aux = array[i];
                        array[i] = array[j];
                        array[j] = aux;
                    }
                }
            }
        return array;
    }
}