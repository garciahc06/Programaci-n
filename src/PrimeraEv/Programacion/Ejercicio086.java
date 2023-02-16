package PrimeraEv.Programacion;
/*
RECURSIVIDAD
 */
public class Ejercicio086 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("El factorial de " + n + " es : " + factorial(n));
    }

    public static int factorial(int fac){
        if(fac != 1)
            return fac * factorial(fac - 1);
        else
            return 1;
    }
}
