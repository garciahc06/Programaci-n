package PrimeraEv.Programacion;
/*
Mostrar por pantalla 3 líneas donde en cada una de ellas aparecerán
los elemetnos de datos multiplicados por cada uno de los elementos
de los múltiplos.
 */
public class Ejercicio024 {
    public static void main(String[] args){
        int[] datos = {10, 20, 30, 40, 50, 60};
        int multiplos[] = {3, 5, 7};
        for (int i = 0; i < multiplos.length; i++){
            for (int j = 0; j < datos.length; j++){
                System.out.print(datos[j] * multiplos[i] + " ");
            }
            System.out.println(" = resultado de multiplicar el vector datos * " + multiplos[i]);
        }
    }
}
