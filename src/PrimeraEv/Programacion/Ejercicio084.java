package PrimeraEv.Programacion;
/*
Quitar los espacios en solo poner 1.

frase1 = frase1.replace(" +", " ");
System.out.println(frase1);
 */
public class Ejercicio084 {
    public static void main(String[] args) {
        String frase1 = "Había una  vez        un  circo";
        int inicio = 0;
        int fin = frase1.indexOf(" ");
        while (fin != -1) {
            if (frase1.charAt(fin + 1) == ' ') {
                frase1 = frase1.substring(0, fin) + frase1.substring(fin + 1);
                fin = frase1.indexOf(" ", inicio);
            } else {
                inicio = fin + 1;
                fin = frase1.indexOf(" ", inicio);
            }
        }
        System.out.println(frase1);
    }
}

/*
boolean primero = true;
int posicion = 0;
for (int i = 0; i < frase1.length(); i++) {
    if (frase1.charAt(i) == ' ') {
        if (primero) {
            posicion = i;
            primero = false;
        } else {
            frase1 = frase1.substring(0, posicion).concat(frase1.substring(i));
            i = posicion;
            primero = true;
        }
    } else {
        primero = true;
    }
}
System.out.println(frase1);
 */