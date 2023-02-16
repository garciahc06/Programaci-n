package PrimeraEv.Programacion;

/*
Dada una cadena de caracteres cuya palabra esté seprada por un espacio en blanco, cambiar a mayuscula las palabras cuya longitud
sea mayor que 3.
1. Hacerlo sobre la misma cadena
2. Hacerlo sobre otra cadena
 */
public class Ejercicio095 {
    public static void main(String[] args) {
        char[] frase = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        // 1. Hacerlo sobre la misma cadena
        for (int i = 0; i < frase.length; i++) {
            for (int j = i; j < frase.length; j++) {
                if (frase[j] == ' ') {
                    if (j - i > 3) {
                        for (int k = i; k < j; k++)
                            frase[k] = Character.toUpperCase(frase[k]);
                    }
                    i = j;
                    break;
                }
            }
        }
        for (int i = 0; i < frase.length; i++) {
            System.out.print(frase[i]);
        }
        System.out.println();
        // 2. Hacerlo sobre otra cadena respetando los espacion en blanco
        char[] frase2 = new char[frase.length];
           for (int i = 0; i < frase.length; i++)
                frase2[i] = frase[i];
        for (int i = 0; i < frase2.length; i++) {
            for (int j = i; j < frase2.length; j++) {
                if (frase2[j] == ' ') {
                    if (j - i > 3) {
                        for (int k = i; k < j; k++)
                            frase2[k] = Character.toUpperCase(frase2[k]);
                    }
                    i = j;
                    break;
                }
            }
        }
        for (int i = 0; i < frase2.length; i++)
            System.out.print(frase2[i]);
    }
}
