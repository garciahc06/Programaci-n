package PrimeraEv.Programacion;

/*
Eliminar de la frase todas las ocurrencias del char eliminar.
Tras la eliminación, los caracteres que quedan a la derecha de la frase, se desplazan a la izquierda.
 */
public class Ejercicio068 {
    public static void main(String[] args) {
        char[] frase = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char eliminar = 'n';
        char[] fraseSinN = eliminarN(frase, eliminar);
        System.out.println(fraseSinN);
    }

    public static char[] eliminarN(char[] fr, char n) {
        char[] frSinN = new char[fr.length];
        int i2 = 0;
        for (int i1 = 0; i1 < fr.length; i1++){
            if (fr[i1] != n){
                frSinN[i2] = fr[i1];
                i2++;
            }
        }
        return frSinN;
    }
}