package PrimeraEv.Programacion;
/*
Mismo ejercicio que el 76 pero con un String y usando la función indexOf.
 */
public class Ejercicio077 {
    public static void main(String[] args) {
        String[] frase = {"En un lugar", "lugar de la mancha", "de cuyo nombre", "no quiero acordarme"};
        String palabra = "a";
        int cont = 0;
        cont = 0;
        for (int i = 0; i < frase.length; i++){
            int posicion = frase[i].indexOf(palabra);
            while (posicion != -1){
                cont++;
                posicion = frase[i].indexOf(palabra, posicion + 1);
            }
        }
        System.out.println("El caracter 'a' aparece hasta en " + cont + " ocasiones");
    }
}
