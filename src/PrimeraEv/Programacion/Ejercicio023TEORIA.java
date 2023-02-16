package PrimeraEv.Programacion;
/*
FUNCIONAMIENTO DE LOS BUCLES ANIDADOS
 */

public class Ejercicio023TEORIA {
    public static void main(String[] args){
        for(int i=0; i < 5; i++){
            System.out.println("Fila: " + i);
            for(int j=0; j < 5; j++){
                System.out.println("Fila: " + i + " Columna: " + j);
            }
        }
    }
}
