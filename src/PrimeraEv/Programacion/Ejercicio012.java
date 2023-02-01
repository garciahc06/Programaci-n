package PrimeraEv.Programacion;
/*
Division por restas sucesivas
 */
public class Ejercicio012 {
    public static void main(String[] args){
        int x, y, resta, modificador;
        x = 10;
        y = 2;
        resta = 0;
        modificador = x;
        while (modificador >= y){
            modificador -= y;
            resta++;
        }
        System.out.println(x + " / " + y +" = " + resta);
    }
}
