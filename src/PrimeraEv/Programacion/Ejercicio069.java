package PrimeraEv.Programacion;

/*
Eliminar una subcadena de la frase tantas veces como aparezca
 */
public class Ejercicio069 {
    public static void main(String[] args) {
        char[] frase = {'e', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'e', 'n', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char[] cadena = {'e', 'n', ' '};
        char[] fraseSinCadena = eliminarCadena(frase, cadena);
        System.out.println(fraseSinCadena);
        /*int j = 0;   //FORMA DE HACERLO SIN VARIABLE AUXILIAR
        for (int i = 0; i < frase.length; i++) {
            if (frase[i] == cadena[0]) {
                j = 1;
                while ((j < cadena.length) && (cadena[j] == frase[i + j]))
                    j++;
                if (j == cadena.length)
                    for (int z = 0; z < cadena.length; z++){
                        for (int x = (i + j - z); x < frase.length; x++)
                            frase[x - 1] = frase[x];
                        frase[frase.length - 1] = ' ';
                    }
            }
           */
    }

    public static char[] eliminarCadena(char[] fr, char[] cad) {
        char[] frSinCad = new char[fr.length];
        int i2 = 0;
        for (int i1 = 0; i1 < fr.length; i1++) {
            if (fr[i1] == cad[0]) {
                int j = 1;
                while ((j < cad.length) && (cad[j] == fr[i1 + j]))
                    j++;
                if (j == cad.length)
                    i1 += (cad.length - 1);
                else
                    frSinCad[i2] = fr[i1];

            } else
                frSinCad[i2] = fr[i1];
            i2++;
        }
        return frSinCad;
    }
}
