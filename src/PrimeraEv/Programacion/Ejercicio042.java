package PrimeraEv.Programacion;
/*
Ordenación de un vector. Ordenación parcial.
 */
public class Ejercicio042 {
    public static void main(String[] args){
        int[] vector = {25, 2, 73, 81, 16, 4, 33};
        int aux;
        //La condición del bucle anidado while es compuesta
        //&& significa "y" / "and"
        //|| significa "o" / "or"
        for(int i = 0; i < vector.length; i++){
            while(i > 0 && vector[i] < vector[i-1]){
                aux = vector[i];
                vector[i] = vector[i-1];
                vector[i-1] = aux;
                i--;
            }
        }
        for(int i : vector) System.out.printf("%d - ", i);
    }
}
