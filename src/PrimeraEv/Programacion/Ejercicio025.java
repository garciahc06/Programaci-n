package PrimeraEv.Programacion;
/*
Mostrar por pantalla las 10 tablas de multiplicar
 */
public class Ejercicio025 {
    public static void main(String[] args){
        int datos[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int multiplos[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 1; i < datos.length; i++){
            for (int cont = 1; cont <multiplos.length; cont++){
                System.out.println( i + " x " + cont + " = " + (i * cont));
            }
            System.out.println(" tabla del "  + multiplos[i] + " : ");
        }
    }
}
