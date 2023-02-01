package PrimeraEv.Programacion;
/*
Dado un numero entero que se encuentra en una variable, diseccionarlo, analizarlo hasta los centenares de millar
usando recursividad
 */
public class Ejercicio091 {
    public static void main(String[] args) {
        String[] medidas = {"Unidades", "Decenes", "Centenas", "Unidades de millar", "Decenas de millar", "Centenas de millar"};
        int numero = 256809;
        for (int i = medidas.length - 1; i >= 0; i--)
            System.out.println(medidas[i] + " : " + descomponer(numero, i));
    }
    public static int descomponer(int numero, int medida){
        if (medida == 0)
            return numero % 10;
        else
            return descomponer(numero / 10, medida - 1);
    }
}
