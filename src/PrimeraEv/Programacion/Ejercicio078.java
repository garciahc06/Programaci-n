package PrimeraEv.Programacion;

/*
Convertir a mayúsculas la subcadena definida, cada vez que aparezca en las frases
 */
public class Ejercicio078 {
    public static void main(String[] args) {
        String[] frase = {"en un lugar", "lugar en la mancha", "de cuyo nombre", "no quiero acordarme"};
        String palabra = "en";
        String fraseConvertida = "";
        for (int i = 0; i < frase.length; i++) {
            fraseConvertida += frase[i].replace(palabra, palabra.toUpperCase()) + " ";
        }
        System.out.println(fraseConvertida);
    }
}
