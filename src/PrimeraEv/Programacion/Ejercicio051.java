package PrimeraEv.Programacion;
/*
Implementar un método que modifique los datos de una tabla,
multiplicandolos por un entero.
 */
public class Ejercicio051 {
    public static void main(String[] args){
        int[][] tabla ={{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12},{13, 14, 15, 16}};
        int multiplicador = 4;
        //Llama al método que multiplica la tabla por el multiplicador y mostramos
        multiplicarTabla(tabla, multiplicador);
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " - ");
            }
            System.out.println();
        }
    }
    public static void multiplicarTabla(int[][] t1, int multi){
        for(int i = 0; i < t1.length; i++){
            for(int j = 0; j < t1[i].length; j++)
                t1[i][j] *= multi;
        }
    }
}
