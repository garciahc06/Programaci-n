package PrimeraEv.Programacion;
/*
Intercambiar el contenido de los elementos de un vector de enteros
de manera que se intercambien los valores de: la primera con la ultima,
la segunda con la penultima, la tercera con la antepenultima, etc.
 */

public class Ejercicio018 {
    public static void main(String[] args){
        int datos[] = {10, 20, 30, 40, 50, 60};
        int aux, cont;
        for(cont = 0; cont < datos.length/2; cont++){ //SE DIVIDE POR 2 PARA TENER EL NÚMERO DE ITERACIONES DEL BUCLE
            aux = datos[cont]; //DAMOS VALOR A LA VARIABLE AUXILIAR
            datos[cont] = datos[datos.length - 1 - cont];
            datos[datos.length - 1 - cont] = aux;

        }
        for(cont = 0; cont < datos.length; cont++)
        System.out.printf(" %d ", datos[cont]);
    }
}

