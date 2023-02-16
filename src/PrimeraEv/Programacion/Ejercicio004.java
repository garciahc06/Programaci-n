package PrimeraEv.Programacion;

public class Ejercicio004 {
    public static void main(String[] args){
        int x, y, z;
        x = 75;
        y = 105;
        z = 105;
        if (x == y && y == z){
            System.out.println("Son iguales");
        } else {
            if (x > y && x > z) {
                System.out.println("El mayor es: " + x);
            } else {
                if (y == z) {
                    System.out.println("Los valores Y e Z son iguales: " + y);
                } else {
                    if (y > z) {
                        System.out.println("El mayor es: " + y);
                    } else {
                        System.out.println("El mayor es: " + z);
                    }
                }
            }
        }
    }
}
