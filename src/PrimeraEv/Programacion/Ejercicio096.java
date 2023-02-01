package PrimeraEv.Programacion;

/*
Caulcular el maximo comun divisor de 2 numeros mediante el algoritmo de euclides
1. Con recursividad
2. Sin recursividad
 */
public class Ejercicio096 {
    public static void main(String[] args) {
        int a = 20, b = 12;
        //1. Con recursividad
        System.out.println("El maximo comun divisor de " + a + " y " + b + " es : " + euclides(a, b) + "\n");
        //2. Sin recursividad
        int mcd = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                mcd = i;
        }
        System.out.println("El maximo comun divisor de " + a + " y " + b + " es : " + mcd);
    }

    public static int euclides(int a, int b) {
        if (a == b)
            return a;
        else if (a > b)
            return euclides(a - b, b);
        else
            return euclides(a, b - a);
    }
}
