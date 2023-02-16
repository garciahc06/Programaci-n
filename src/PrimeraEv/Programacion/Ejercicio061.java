package PrimeraEv.Programacion;
/*
IMPLEMENTAR UNA FUNCION QUE DEVUELVA EL NUMERO DE VECTORES QUE
TIENE DENTRO DE UNA CADENA
 */
public class Ejercicio061 {
    public static void main(String[] args){
        char[] frase = {'E', 'n', 'n', 'n', 'n', ' ', 'n', 'n', 'n', 'n', 'r', ' ', 'n', 'n', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char[] subcadena = {'n', 'n', 'n'};
        int contador = 0;
        for (int i = 0; i < frase.length; i++)
            if (frase[i] == subcadena[0])
                if (frase[i + 1] == subcadena[1])
                    if (frase[i + 2] == subcadena[2])
                        contador++;
        System.out.println(contador);

    }
    public static int contar(char[] fr, char[] sub){
        int contador = 0;
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] == sub[0]) {
                for (int j = 0; j < sub.length; j++) {
                    if (fr[i + j] == sub[j])
                        contador++;
                }
            }
        }
        return contador;
    }
}
