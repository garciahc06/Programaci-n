package PrimeraEv.Programacion;
/*
Recursividad con division mediante restas
 */
public class Ejercicio088 {
    public static void main(String[] args) {
        int dividendo = 10;
        int divisor = 3;
        int resto = 0;
        System.out.println("La division entre " + dividendo + " / " + divisor + " es : " + division(dividendo, divisor, resto));
    }

    public static int division(int dividendo, int divisor, int resto){
        if (dividendo < divisor)
            return 0;
        else
            return division(dividendo - divisor, divisor, resto + 1);
    }
}
