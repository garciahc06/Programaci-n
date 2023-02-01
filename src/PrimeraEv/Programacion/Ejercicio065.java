package PrimeraEv.Programacion;
/*
Poner al revés una cadena de caracteres.
 */
public class Ejercicio065 {
    public static void main(String[] args) {
        char[] frase = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char[] fraseAlReves = alReves(frase);
        System.out.println(fraseAlReves);
    }
    public static char[] alReves(char[] frase){
        char[] fraseAlReves = new char[frase.length];
        int i2 = 0;
        for (int i1 = frase.length - 1; i1 >= 0; i1--){
            fraseAlReves[i2] = frase[i1];
            i2++;
        }
        return fraseAlReves;
    }
}
