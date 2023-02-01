package PrimeraEv.Programacion;
/*
Añadir una "a" al final de cada palabra de la frase. sin usar la función replaceAll.
frase1 = frase1.replace(" ", "a");
 */
public class Ejercicio083 {
    public static void main(String[] args) {
        String frase1 ="Había una vez un circo que alegraba siempre el corazon ";
        int inicio = 0;
        int fin = frase1.indexOf(" ");
        while (fin != -1){
            frase1 = frase1.substring(0, fin) + "a" + frase1.substring(fin);
            inicio = fin + 2;
            fin = frase1.indexOf(" ", inicio);
        }
        System.out.println(frase1);
    }
}

/*
int posicion
while (posicion != -1){
    frase1 = frase1.substring(0, posicion).concat("a").concat(frase1.substring(posicion));
    posicion = frase1.indexOf(" ", posicion + 2);
}
System.out.println(frase1);
 */
