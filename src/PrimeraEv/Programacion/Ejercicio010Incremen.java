package PrimeraEv.Programacion;

public class Ejercicio010Incremen {
    public static void main(String[] args){
        int x, cont, factorial;
        x = 10;
        factorial = 1;
        for (cont = 1; cont <=x; cont++){
            factorial = factorial * cont;
        }
        System.out.println(" Factorial de " + x + " es : " + factorial);
    }
}
