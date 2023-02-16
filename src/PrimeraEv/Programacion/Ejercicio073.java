package PrimeraEv.Programacion;
/*
Ordenar los nombres del vector en orden alfabético
 */
public class Ejercicio073 {
    public static void main(String[] args) {
        String[] nombres = {"Pepe", "Juan", "María", "Antonio", "Luisa"};
        String aux;
        //ordenamos el vector
        for (int i = 0; i < nombres.length; i++){
            for (int j = i + 1; j < nombres.length; j++){
                if (nombres[i].compareTo(nombres[j]) > 0){
                    aux = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = aux;
                }
            }
        }
        for (int i = 0; i < nombres.length; i++)
            System.out.printf("%s - ", nombres[i]);
    }
}
