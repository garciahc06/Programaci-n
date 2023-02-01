package PrimeraEv.Programacion;
/*
   Se coje la primera palabra de frase1 y la metemos en frase 3, luego la primera de frase2 y la metemos,
   la segunda de frase 1 y la metemos y así sucesivamente.
 */
public class Ejercicio081 {
    public static void main(String[] args) {
        String frase1 = "Había vez circo alegraba el ";
        String frase2 = "una un que siempre corazón sin temer jamás";
        String frase3 = "";
        int inicioF1 = 0;
        int finF1 = frase1.indexOf(" ");
        int inicioF2 = 0;
        int finF2 = frase2.indexOf(" ");
        while (finF1 != -1) {
            frase3 += frase1.substring(inicioF1, finF1) + " " + frase2.substring(inicioF2, finF2) + " ";
            inicioF1 = finF1 + 1;
            finF1 = frase1.indexOf(" ", inicioF1);
            inicioF2 = finF2 + 1;
            finF2 = frase2.indexOf(" ", inicioF2);
        }
        frase3 += frase1.substring(inicioF1) + " " + frase2.substring(inicioF2);
        System.out.println(frase3);
    }
}
