package PrimeraEv.Programacion;
/*
Desplazar todos los valores hacia la derecha y el último en el primero
 */
public class Ejercicio022 {
    public static void main(String[] args){
        int datos[]= {10, -20, 30, -40, 50, 60};
        int aux = datos[datos.length-1];
        for(int cont = 1; cont < datos.length; cont++){
            System.out.println("Fila " + cont + " : ");
            for (int i = 0; i < datos.length; i++){
                datos[datos.length - 1] = datos[cont];
                datos[0] = aux;
                for(cont = 0; cont < datos.length; cont++)
                    System.out.printf(" %d ", datos[cont]);
            }
        }
    }
}
