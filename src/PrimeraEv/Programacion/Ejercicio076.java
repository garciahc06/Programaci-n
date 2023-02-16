package PrimeraEv.Programacion;
/*
Mostrar por pantalla el número de apariciones de un caracter dentro de un vector de Strings
 */
public class Ejercicio076 {
    public static void main(String[] args) {
        String[] frase = {"En un lugar", "lugar de la mancha", "de cuyo nombre", "no quiero acordarme"};
        int cont = 0;
        for (int i = 0; i < frase.length; i++){
            for (int j = 0; j < frase[i].length(); j++){
                if (frase[i].charAt(j) == 'a')
                    cont++;
            }
        }
        System.out.println("El caracter 'a' aparece hasta en " + cont + " ocasiones");
    }
}
