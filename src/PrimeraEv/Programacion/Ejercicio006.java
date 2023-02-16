package PrimeraEv.Programacion;

/*
Mostrar por pantalla si un número termina en 5 o no
 */

public class Ejercicio006 {
    public static void main(String[] args){
        int x, y;
        x= 45;
        y= 50;
        if (x % 10 == 5) {
            System.out.println("El número " + x + " termina en 5");
        } else {
            System.out.println("El número " + x + " no termina en 5");
        }
        if (y % 10 == 5){
            System.out.println("El número " + y + "termina en 5");
        } else {
            System.out.println("El número " + y + " no termina en 5");
        }
    }
}
