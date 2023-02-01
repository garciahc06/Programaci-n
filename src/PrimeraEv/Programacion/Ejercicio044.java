package PrimeraEv.Programacion;

//Implementar una funcion a la que le pases un vector de enteros y te devuelva
//la posicion del mayor elemento del vector.
public class Ejercicio044 {
    public static void main(String[] args) {
        int[] vector = {24, 45, 65, 12, 7, 123, 16, 50};
        int pos = maximo(vector);
        //Mostramos por pantalla el mayor elemento y su posicion
        System.out.println("El mayor elemento es " + vector[pos] + " y esta en la posicion " + pos);
    }
    public static int maximo(int[] vector) {
        int max = vector[0];
        int pos = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > max) {
                max = vector[i];
                pos = i;
            }
        }
        return pos;
    }
}
