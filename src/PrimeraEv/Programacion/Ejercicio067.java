package PrimeraEv.Programacion;

/*
Meter en frase2 la misma frase, pero con las palabras en sentido inverso.
la primera en la ultima, la segunda en la penultima, etc.
 */
public class Ejercicio067 {
    public static void main(String[] args) {
        char[] frase = {' ', 'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char[] frase2 = new char[150];
        int inicio = frase.length - 1;
        int fin = frase.length - 1;
        int i2 = 0;
        while (inicio > 0) {
            while (frase[inicio] != ' ')
                inicio--;
            for (int i = inicio + 1; i <= fin; i++, i2++)
                frase2[i2] = frase[i];
            frase2[i2] = ' ';
            i2++;
            inicio--;
            fin = inicio;
        }
        System.out.println(frase2);
    }
}