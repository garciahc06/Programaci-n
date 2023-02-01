package PrimeraEv.Programacion;
/*
Si un número es múltiple de otro o no lo es
 */

public class Ejercicio007 {
    public static void main(String[] args){
        int x, y, intermedio;
        x= 3;
        y= 21;
        if (y > x) {
            intermedio = y;
            y = x;
            x = intermedio;
        }
        if (x % y == 0){
            System.out.println("El número " + x + " es múltiple de " + y);
        } else {
            System.out.println("El número " + x + " no es múltiple de " + y);
        }


    }
}