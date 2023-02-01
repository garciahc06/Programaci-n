package PrimeraEv.Programacion;
//Variaciones de 7 elementos de 3 en 3. V^3_7 = 7! / 3!
public class Ejercicio013 {
    public static void main(String[] args){
        int x, y, factorial;
        x = 7;
        y = 3;
        factorial = 1;
        for (int cont = x; cont >= x - y; cont--){
            factorial = factorial * cont;
        }
        System.out.println(" Variaciones de " + x + " elementos, tomados de " + y + " en " + y + " = " + factorial);

        factorial = 1;
        int cont = x;
        while(cont > y){
            factorial *= cont;
            cont--;
        }
        System.out.println(" Variaciones de " + x + " elementos, tomados de " + y + " en " + y + " = " + factorial);
        System.out.printf(" Variaciones de %d elementos, tomados de %d en %d = %d \n", x, y, y, factorial);


    }
}
/*
\n significa secuencia de escape de nueva línea
 */