package PrimeraEv.Programacion;
/*
Mostrar por pantalla el valor mayor de un elemento de un vector de 5
 */
public class Ejercicio016 {
    public static void main(String[] args){
        int datos[] = {17, 55, 33, 21, 88};
        int mayor = datos[0];
        for (int cont = 1; cont < datos.length; cont++){
            if(datos[cont] > mayor){
                mayor = datos[cont];
            }
        }
        System.out.println(" El valor mayor del vector es " + mayor);

        int posmax = 0;
                for(int cont = 1; cont < datos.length; cont++){
                    if(datos[cont] > datos[posmax]){
                        posmax = cont;
                    }

                }
                System.out.println(" La posicion " + posmax + " = " + datos[posmax] + " es el mayor del vector ");
    }

}
