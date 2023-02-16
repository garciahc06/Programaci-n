package PrimeraEv.Programacion;
/*
IMPLEMENTAR UNA FUNCION QUE SUSTITUA EL CAREACTER "SUSTIUIR" POR
LA CADENA DE CARACTERES "SUSTITUTO" EN LA FRASE.
 */
public class Ejercicio059 {
    public static void main(String[] args) {
        char[] frase = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char sustituir = 'n';
        char[] sustituto = {'X', 'Y', 'Z'};
        char[] fraseSustituida = sustitucion(frase, sustituir, sustituto);
        System.out.print(fraseSustituida);
    }

   public static char[] sustitucion(char[] fr1, char sustituir, char[] sustituto){
        char[] fr2 = new char[100];
        int i2 = 0;
        for (int i1 = 0; i1 < fr1.length; i1++){
           if(fr1[i1] == sustituir){
               for (int i3 = 0; i3 < sustituto.length; i3++){
                   fr2[i2] = sustituto[i3];
                   i2++;
               }
           }else{
               fr2[i2] = fr1[i1];
               i2++;
           }
        }
        return fr2;
   }
}