package PrimeraEv.Programacion;
/*
Trabajamos con la clase String
 */
public class Ejercicio072 {
    public static void main (String[] args){
        String frase = "En un lugar de la mancha, cuyo nombre no quiero acordarme";
        char[] cadena = new char[frase.length()];

        for (int i = 0; i < frase.length(); i++)
            System.out.printf("%c - ", frase.charAt(i));
        for (int i = 0; i < frase.length(); i++)
            cadena[i] = frase.charAt(i);
        System.out.println();
        System.out.println(cadena);
    }
}
