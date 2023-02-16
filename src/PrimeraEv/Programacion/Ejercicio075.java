package PrimeraEv.Programacion;
/*
Reemplazar en un String y su infexOf
 */
public class Ejercicio075 {
    public static void main(String[] args) {
        String frase = "en un lugar lugar de la mancha, de cuyo nombre no quiero acordarme";
        String palabra = "lugar";
        String frase2 = frase.replace('n', 'X');
        //Tambíen se puede sobreescribir en la misma frase
        // frase = frase.replace('n', 'X');
        System.out.printf("%s", frase2);

        System.out.println();
        String frase3 = frase2.replaceAll("X", "PPPP");
        System.out.printf("%s", frase3);

        //Función indexOf
        //numero de veces que aparece la palabra
        System.out.println();
        int contador = 0;
        int posicion = frase.indexOf(palabra);
        while (posicion != -1){
            contador++;
            posicion = frase.indexOf(palabra, posicion + 1);
        }
        System.out.printf("La palabra '%s' aparece %d veces", palabra, contador);
    }
}
