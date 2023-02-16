package PrimeraEv.Programacion;
/*
Recursividad con multiplicación mediante sumas
 */
public class Ejercicio087 {
    public static void main(String[] args) {
        int n = 5;
        int m = 3;
        System.out.println("La multiplicacion entre " + n + " * " + m + " es : " + multiplicacion(n, m));
    }

    public static int multiplicacion(int p, int q){
        if(q == 1)
            return p;
        else
            return p + multiplicacion(p, q - 1);
    }
}
