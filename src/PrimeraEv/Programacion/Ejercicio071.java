package PrimeraEv.Programacion;
/*
Convertir a mayúscula las vocales de la frase y las que estén en mayúscula las pase a minúscula
y las consonantes convertilas en $
 */
public class Ejercicio071 {
    public static void main(String[] args){
        char[] frase = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'e', 'n', ' ', 'L', 'A', ' ', 'M', 'A', 'n', 'c', 'h', 'a'};
        for (int i = 0; i < frase.length; i++){
            switch (frase[i]){
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    frase[i] = Character.toUpperCase(frase[i]);
                    break;
                case 'A': case 'E': case 'I': case 'O': case 'U':
                    frase[i] = Character.toLowerCase(frase[i]);
                    break;
                default:
                    frase[i] = '$';
            }
        }
        for (int i = 0; i < frase.length; i++)
            System.out.print(frase[i]);
    }
}
