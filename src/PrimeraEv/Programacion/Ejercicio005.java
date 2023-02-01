package PrimeraEv.Programacion;
/*
 Mostrar por pantalla si un número es par o impar
 % es el resto de la división
 / es la división
 */

public class Ejercicio005 {
    public static void main(String[] args){
        int x, y;
        x = 49;
        y = 50;
        if (x % 2 == 0) {
            System.out.println("El número " + x + " es par");
        } else {
            System.out.println("El número " + x + " es impar");
        }
        if (y % 2 == 0) {
            System.out.println("El número " + y + " es par");
        } else {
            System.out.println("El número " + y + " es impar");
        }
    }
}
/*
Una variable % 2 == 0 es par
Una variable % 2 == 1 es impar
 */