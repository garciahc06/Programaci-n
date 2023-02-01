package PrimeraEv.Programacion;
/*
Multiplicar mediante sumas sucesivas
x = 7
y = 5
 */
public class Ejercicio011 {
    public static void main(String[] args){
        int x, y, acumulador, cont;
        x = 7;
        y = 5;
        acumulador = 0;
        for (cont = 1; cont <= y; cont++){
            acumulador += x;
            // acumulador = acumulador + x;
        }
        System.out.println(" El resultado de multiplicar " + x + " x 5 es: " + acumulador);
    }
}
