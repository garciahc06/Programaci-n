package PrimeraEv.Programacion;

/*
Mostrar el String sin espacios en blanco usando indexOf y concat
 */
public class Ejercicio079 {
    public static void main(String[] args) {
        String frase = "Había una vez, un circo, que alegraba siempre el corazón";
        String fraseSinEspacios = "";
        int posicion = frase.indexOf(" ");
        while (posicion != -1) {
            frase = frase.substring(0, posicion).concat(frase.substring(posicion + 1));
            posicion = frase.indexOf(" ");
        }
        System.out.println(frase);
    }
}
