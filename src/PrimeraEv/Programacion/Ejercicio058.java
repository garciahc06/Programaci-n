package PrimeraEv.Programacion;
/*
USAR UN METODO "PASAR FUNCION" PARA QUE CAMBIE LAS 'a' por 'X' de la frase.
 */
public class Ejercicio058 {
    public static void main(String[] args){
        char[] frase = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        pasarFuncion(frase);
        System.out.println(frase);
    }

    public static void pasarFuncion(char[] fr){
        for(int i = 0; i < fr.length; i++){
            if(fr[i] == 'a')
                fr[i] = 'X';
        }
    }
}
