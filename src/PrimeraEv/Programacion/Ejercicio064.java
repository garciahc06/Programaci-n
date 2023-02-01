package PrimeraEv.Programacion;
/*
Sustituir un caracter por una subcadena y hacerlo utilizando una nueva cadena de caracteres.
 */
public class Ejercicio064 {
    public static void main(String[] args){
        char[] frase = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char caracter = 'a';
        char[] subcadena = {'A', 'B', 'C', 'D', 'E'};
        char[] cadena2 = new char[frase.length + (subcadena.length * a(frase, caracter))];
        for (int i = 0, j = 0; i < frase.length; i++, j++) {
            if (frase[i] != caracter)
                cadena2[j] = frase[i];
            else {
                for (int k = 0; k < subcadena.length; k++, j++)
                    cadena2[j] = subcadena[k];
            }
        }
        System.out.println(cadena2);


    }
    //hayamos cuantas veces aparece el caracter en la frase
    public static int a(char[] frase, char caracter){
        int contador = 0;
        for (int i = 0; i < frase.length; i++){
            if (frase[i] == caracter)
                contador++;
        }
        return contador;
    }
}
