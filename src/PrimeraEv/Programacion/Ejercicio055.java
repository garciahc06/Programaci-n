package PrimeraEv.Programacion;
/*
VECTORES DE CARACTERES. IMPLEMENTAR UNA FUNCION QUE DEVUELVA EL NUMERO DE PALABRAS DE UNA FRASE
 */
public class Ejercicio055 {
    public static void main(String[] args){
        char frase[]= {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        int palabras = contarPalabras(frase);
        System.out.println(palabras);
    }
    public static int contarPalabras(char[] frase){
        int contador = 0;
        for(int i = 0; i < frase.length; i++){
            if(frase[i] == ' '){
                contador++;
            }
        }
        return contador;
    }
}
