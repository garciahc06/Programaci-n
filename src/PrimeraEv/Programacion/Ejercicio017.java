package PrimeraEv.Programacion;
//Calcular el valor máximo y el mínimo de un vector y en que posición están de este
public class Ejercicio017 {
    public static void main(String[] args) {
        int datos[] = {17, 55, -33, 21, 88};
        int mayor = datos[0];
        int menor = datos[0];
        int posmayor = 0;
        int posmenor = 0;
        for (int cont = 1; cont < datos.length; cont++) {
            if (datos[cont] > mayor) {
                mayor = datos[cont];
                posmayor = cont;
            }
            if (datos[cont] < menor) {
                menor = datos[cont];
                posmenor = cont;
            }
        }
        System.out.println(" El valor mayor del vector es " + mayor);
        System.out.println(" El valor menor del vector es " + menor);
        System.out.println(" La posicion " + posmayor + " = " + mayor + " es el mayor del vector ");
        System.out.println(" La posicion " + posmenor + " = " + menor + " es el menor del vector ");
    }
}