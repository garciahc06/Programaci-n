package PrimeraEv.Programacion;
/*
Escribir frase1 sobre frase2, pero los caracteres deben estar en orden inverso.
 */
public class Ejercicio082 {
    public static void main(String[] args) {
        String frase1 = "Había una vez, un circo, que alegraba siempre el corazon";
        String frase2 = "";
        for (int i = frase1.length() - 1; i >= 0; i--)
            frase2 += frase1.charAt(i);
        System.out.println(frase2);
    }
}
