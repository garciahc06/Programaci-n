package PrimeraEv.Programacion;

public class Ejercicio004Profe {
    public static void main(String[] args){
        int x, y, z;
        x= 1022;
        y= 50;
        z= 65;
        if (x > y) {
            if (x > z) {
                System.out.println("El mayor es: " + x);
            } else {
                System.out.println("El mayor es: " + z);
            }
        }else {
            if (y > z) {
                System.out.println("El mayor es: " + y);
            } else {
                System.out.println("El mayor es: " + z);
            }
        }
    }
}

