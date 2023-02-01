package PrimeraEv.Programacion;
/*
Modificar los elementos del vector pasando los valores negativos a positivos y multiplicando por 2 los ya positivos
 */
public class Ejercicio019 {
    public static void main(String[] args){
        int datos[] = {10, -20, 30, -40, 50, 60};
        int cont;
        for(cont = 0; cont < datos.length; cont++){
            if (datos[cont] < 0) {
                datos[cont] *= -1;
            }else{
                datos[cont] *= 2;
            }
        }
        for(cont = 0; cont < datos.length; cont++)
        System.out.printf(" %d ", datos[cont]);
    }
}
