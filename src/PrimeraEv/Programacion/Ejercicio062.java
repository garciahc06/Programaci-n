package PrimeraEv.Programacion;

/*
Modificar frase, transformandola de manera que el primer y ultimo caracter de cada
palabra se intercambien de lugar.
 */
public class Ejercicio062 {
    public static void main(String[] args) {
        char[] frase = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char[] frase2 = new char[frase.length];
        for (int i = 0; i < frase.length; i++)
            frase2[i] = frase[i];
        intercambio(frase2);
        System.out.println(frase2);

        //OTRO METODO DE HACERLO
        int inicio = 0, fin = 0;
        char intercambio;
        while (fin < frase.length) {
            while (frase[fin] != ' ')
                fin++;
            intercambio = frase[inicio];
            frase[inicio] = frase[fin - 1];
            frase[fin - 1] = intercambio;
            inicio = fin = fin + 1;
        }

        //OTRO METODO DE HACERLO
        for (int i = 0; i < frase.length; i++) {
            if (frase[i] == ' ') {
                intercambio = frase[inicio];
                frase[inicio] = frase[fin - 1];
                frase[fin - 1] = intercambio;
                inicio = fin + 1;
            }
        }
    }

    public static void intercambio(char[] fr) {
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != ' ') {
                for (int j = i + 1; j < fr.length; j++) {
                    if (fr[j] == ' ') {
                        char aux = fr[i];
                        fr[i] = fr[j - 1];
                        fr[j - 1] = aux;
                        i = j;
                        break;
                    }
                }
            }
        }
    }
}