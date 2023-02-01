package PrimeraEv.Programacion;
/*
Mismo ejercicio que el "Ejercicio059" pero sin crear un char auxiliar
es decir, con una función que devuelva void y con bucle descendente
 */
public class Ejercicio060 {
    public static void main(String[] args) {
        char[] frase = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char sustituir = 'n';
        char[] sustituto = {'X', 'Y', 'Z'};
        char[] frase2 = new char[frase.length +  (contar(frase, sustituir) + 3)];
        for (int i = 0; i < frase.length; i++)
            frase2[i] = frase[i];
        sustitucion(frase2, sustituir, sustituto);
        System.out.println(frase2);
    }

    public static void sustitucion(char[] fr, char sustituir, char[] sustituto){
        //Hacemos un bucle decrementativo en el que al sustituir el caracter por el char sustituto, los demás caracteres
        //del char frase, se muevan hacia la derecha 2 posiciones, y ahí incluir los valores X,Y,Z.
        for (int i = fr.length - 1; i >= 0; i--) {
            if (fr[i] == sustituir) {
                fr[i] = sustituto[0];
                for (int j = fr.length - 1; j > i + 2; j--)
                    fr[j] = fr[j - 2];
                fr[i + 1] = sustituto[1];
                fr[i + 2] = sustituto[2];
            }
        }
    }
    public static int contar(char[] fr, char sustituir){
        int contador = 0;
        for (int i = 0; i < fr.length; i++)
            if (fr[i] == sustituir)
                contador++;
        return contador;
    }
}
