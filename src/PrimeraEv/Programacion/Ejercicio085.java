package PrimeraEv.Programacion;
/*
    Separar las palabras de frase1 y meterlas alternativamente en fraseA y fraseB.
 */
public class Ejercicio085 {
    public static void main(String[] args) {
        String frase1 = "Había una vez un circo que alegraba siempre el corazon ";
        String fraseA = "";
        String fraseB = "";
        int inicio = 0;
        int fin = frase1.indexOf(" ");
        while (fin != -1){
            fraseA += frase1.substring(inicio, fin).concat(" ");
            inicio = fin + 1;
            fin = frase1.indexOf(" ", inicio);
            if (fin != -1){
                fraseB += frase1.substring(inicio, fin).concat(" ");
                inicio = fin + 1;
                fin = frase1.indexOf(" ", inicio);
            }
        }
        System.out.println(fraseA);
        System.out.println(fraseB);
    }
}
