package PrimeraEv.Programacion;
/*
Explicamos la función substring
 */
public class Ejercicio074 {
    public static void main(String[] args) {
        String frase = "En un lugar de la mancha, de cuyo nombre no quiero acordarme";

        System.out.printf("%s", frase.substring(3, 11));

        for (int i = 1; i < frase.length(); i++){
            System.out.printf("%s\n", frase.substring(0, i + 1));
        }
    }
}
