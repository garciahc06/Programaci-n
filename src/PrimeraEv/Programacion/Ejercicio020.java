package PrimeraEv.Programacion;
/*
Calcular la media de los elementos del vector
 */
public class Ejercicio020 {
    public static void main(String[] args) {
        int datos[] = {10, -20, 30, -40, 50, 60};
        int acu = 0;
        for(int cont = 0; cont < datos.length; cont++){
            acu += datos[cont];
        }
        acu = acu / (datos.length);
        System.out.println(" la media es = " + acu);
    }
}