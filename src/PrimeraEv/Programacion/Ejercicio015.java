package PrimeraEv.Programacion;
/*
Modificar cada elemento del vector multiplicandolo x2
 */
public class Ejercicio015 {
    public static void main(String [] args) {
        int datos[] = {17, 55, 33, 21, 88};
        for (int cont = 0; cont < datos.length; cont++) {
            System.out.printf(" datos [%d] = %d ", cont, datos[cont]);
        }
        System.out.println();
        for (int cont = 0; cont < datos.length; cont++) {
            datos[cont] *= 2;
        }
        for(int cont = 0; cont < datos.length; cont++) {
            System.out.printf(" datos [%d] = %d ", cont, datos[cont]);
        }
    }
}
