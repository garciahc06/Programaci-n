package PrimeraEv.Programacion;

/*
Escribir en cadena2 la frase, sustituyendo las ocurrencias de subcad1, por subcad2.
 */
public class Ejercicio066 {
    public static void main(String[] args) {
        char[] frase = {'e', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'e', 'n', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char[] subcad1 = {'e', 'n', ' '};
        char[] subcad2 = {'X', 'X', 'X', 'X', 'X'};
        char[] cadena2 = new char[150];
        int j;
        for (int i = 0, z = 0; i < frase.length; i++, z++) {
            if (frase[i] == subcad1[0]) {
                j = 1;
                while ((j < subcad1.length) && (subcad1[j] == frase[i + j]))
                    j++;
                if (j == subcad1.length) {
                    for (int k = 0; k < subcad2.length; k++, z++)
                        cadena2[z] = subcad2[k];
                    i += (subcad1.length - 1);
                } else
                    cadena2[z] = frase[i];
            }
        }
        System.out.println(cadena2);
    }
}

