package PrimeraEv.Programacion;

/*
De cada palabra se desplaza todos los caracteres a la derecha, y el ultimo
pasa al primer lugar.
 */
public class Ejercicio063 {
    public static void main(String[] args) {
        char[] frase = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        int inicio = 0, fin = 0;
        // con 2 bucles while llamamos al metodo desplazarI
        while (fin < frase.length) {
            while (frase[fin] != ' ')
                fin++;
            desplazarI(frase, inicio, fin);
            inicio = fin = fin + 1;
        }
        System.out.println(frase);
    }
    //Metodo que desplaza los caracteres de una palabra a la derecha
    //respetando los espacios entre palabras
    public static void desplazarD(char[] frase, int inicio, int fin) {
        char aux = frase[fin - 1];
        for (int i = fin - 1; i > inicio; i--) {
            frase[i] = frase[i - 1];
        }
        frase[inicio] = aux;
    }

    //Hacemos lo mismo pero moviendo las letras a la izquierda y la primera letra en la ultima posicion de cada palabra
    public static void desplazarI(char[] frase, int inicio, int fin) {
        char aux = frase[inicio];
        for (int i = inicio + 1; i < fin; i++)
            frase[i - 1] = frase[i];
        frase[fin - 1] = aux;
    }
}

