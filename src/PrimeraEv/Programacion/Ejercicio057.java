package PrimeraEv.Programacion;
/*
PASAR A MAYUSCULAS LA FRASE
 */
public class Ejercicio057 {
    public static void main(String[] args) {
        char[] frase = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char[] fraseMayusculas = pasarAMayusculas(frase);
        for (int i = 0; i < fraseMayusculas.length; i++)
            System.out.print(fraseMayusculas[i]);
        aMayusculas(frase);
        System.out.println();
        for (int i = 0; i < frase.length; i++)
            System.out.print(frase[i]);
    }

    public static char[] pasarAMayusculas(char[] fr) {
        char[] fraseMayusculas = new char[fr.length];
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] >= 'a' && fr[i] <= 'z')
                fraseMayusculas[i] = (char) (fr[i] - 32);
        }
        return fraseMayusculas;
    }

    public static void aMayusculas(char[] fr){
        for(int i = 0; i < fr.length; i++){
            fr[i] = Character.toUpperCase(fr[i]);
        }
    }
}
