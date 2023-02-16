package PrimeraEv.Programacion;
/*
calcular el factorial de un número
 */
public class Ejercicio010Decremen {
    public static void main(String[] args){
        int x, cont, factorial;
        x = 10;
        factorial = 1;
        for (cont = x; cont >= 1; cont--) {
            factorial = factorial * cont;
        }
        System.out.println(" Factorial de " + x + " es : " + factorial);
    }
}
/*
factorial *= cont; // factorial = factorial * cont;
factorial /= cont; // factorial = factorial / cont;
factorial %= cont; // factorial = factorial % cont;
factorial += cont; // factorial = factorial + cont;
factorial -= cont; // factorial = factorial - cont;
 */