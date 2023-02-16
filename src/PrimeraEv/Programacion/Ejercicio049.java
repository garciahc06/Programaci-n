package PrimeraEv.Programacion;

/*
Factoriales con funciones
 */
public class Ejercicio049 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int resultado = factorial(a) / (factorial(a-b) * factorial(b));
        System.out.println("5! / 2! es : " + resultado);
    }

    public static int factorial(int x) {
        int aux = 1;
        for (int i = 1; i <= x; i++)
            aux *= i;
        return aux;
    }
}
