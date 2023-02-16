package PrimeraEv.Estudio;
/*
Hacer una calculadora que permita sumar, restar, multiplicar y dividir dos número
 usando funciones respectivamente
 */
public class Calculadora {
    public static void main(String[] args) {
        double num1 = 5.2;
        double num2 = 3.1;
        System.out.printf("Suma: %.2f + %.2f = %.2f%n", num1, num2, suma(num1, num2));
        System.out.printf("Resta: %.2f - %.2f = %.2f%n", num1, num2, resta(num1, num2));
        System.out.printf("Multiplicación: %.2f * %.2f = %.2f%n", num1, num2, multiplicacion(num1, num2));
        System.out.printf("División: %.2f / %.2f = %.2f%n", num1, num2, division(num1, num2));
    }
    public static double suma(double num1, double num2){
        return num1 + num2;
    }
    public static double resta(double num1, double num2){
        return num1 - num2;
    }
    public static double multiplicacion(double num1, double num2){
        return num1 * num2;
    }
    public static double division(double num1, double num2){
        return num1 / num2;
    }
}