package PrimeraEv.Programacion;

import static PrimeraEv.Programacion.Ejercicio055.contarPalabras;

/*
IMPLEMENTAR UNA FUNCION A LA QUE LE PASEIS LA FRASE Y DEVUELVA OTRA FRASE EN LA QUE CADA PALABRA TERMINE EN X
 */
public class Ejercicio056 {
    public static void main(String[] args) {
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char[] fraseX = fraseX(frase);
        for (int i = 0; i < fraseX.length; i++) {
            System.out.print(fraseX[i]);
        }
        //Lo mismo pero sin funcion
        char[] frase2 = new char[200];
        for (int i = 0; i < frase2.length; i++)
            frase2[i] = frase[i];
        for (int i = 0; i < frase2.length; i++) {
            if (frase2[i] == ' ') {
                frase2[i] = 'X';
            }
        }
        System.out.println();
        //Añadimos espacios en blanco sin quitar la X
        for (int i = 0; i < frase2.length; i++) {
            if (frase2[i] == 'X') {
                frase2[i] = ' ';
                frase2[i + 1] = 'X';
            }
        }
        for (int i = 0; i < frase2.length; i++) {
            System.out.print(frase2[i]);
        }
    }

    //funcion en donde nos ponga una X antes de cada espacioy al final de la frase.
    public static char[] fraseX(char[] frase) {
        int numPalabras = contarPalabras(frase);
        char[] fraseX = new char[frase.length + numPalabras];
        for (int i = 0, j = 0; i < frase.length; i++, j++) {
            if (frase[i] == ' ') {
                fraseX[j] = 'X';
                j++;
            }
            fraseX[j] = frase[i];
        }
        return fraseX;
    }

}
