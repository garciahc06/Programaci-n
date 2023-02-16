package PrimeraEv.Programacion;

/*

De cada palabra de la frase, poner en mayúsculas la primera y la última letra
 */
public class Ejercicio070 {
    public static void main(String[] args) {
        char[] frase = {'e', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'e', 'n', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        frase[0] = Character.toUpperCase(frase[0]);
        frase[frase.length - 1] = Character.toUpperCase(frase[frase.length - 1]);
        for (int i = 0; i < frase.length; i++) {
            if (frase[i] == ' ') {
                frase[i + 1] = Character.toUpperCase(frase[i + 1]);
                frase[i - 1] = Character.toUpperCase(frase[i - 1]);
            }
        }
        for (int i = 0; i < frase.length; i++)
            System.out.print(frase[i]);
    }
}
