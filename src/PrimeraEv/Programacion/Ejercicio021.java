package PrimeraEv.Programacion;
/*
Desplazar todos los valores del vector hacia la izquierda y el primero en el último
 */
public class Ejercicio021 {
    public static void main(String[] args){
        int datos[]= {10, -20, 30, -40, 50, 60};
        int aux = datos[0];
        int cont;
        for(cont = 1; cont < datos.length; cont++){
            datos[cont - 1] = datos[cont];
        }
        datos[datos.length - 1] = aux;
        for(cont = 0; cont < datos.length; cont++)
            System.out.printf(" %d ", datos[cont]);
    }
}
