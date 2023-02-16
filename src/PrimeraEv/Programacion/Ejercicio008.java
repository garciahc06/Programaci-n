package PrimeraEv.Programacion;
/*
Primer bucle tipo for
 */


public class Ejercicio008 {
    public static void main(String[] args){
       int cont;
       for (cont = 0; cont < 10; cont = cont + 1){
           System.out.println("Iteración : " + (cont + 1));
       }
    }
}

/*
Cada una de las repeticiones se llama iteración.
El bucle for se compone de tres partes:
1. Inicialización: se ejecuta una única vez al principio del bucle.
2. Condición: se evalúa al principio de cada iteración. Si es verdadera, se ejecuta el cuerpo del bucle.
3. Actualización: se ejecuta al final de cada iteración.
cont = cont + 1 es una actualización. Se puede escribir de otra forma: cont++.
 */