package PrimeraEv.Programacion;
/*
Pasar de numero decimal a numero binario
 */
public class Ejercicio092 {
    public static void main(String[] args) {
        int numero = 29;
        System.out.println("El numero " + numero + " en binario es : " + binario(numero));

    }
    public static int binario (int binario){
        if (binario == 1)
            return 1;
        else
            return binario % 2 + 10 * binario(binario / 2);
    }
}
