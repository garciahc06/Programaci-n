package PrimeraEv.Estudio;

public class Factorial {
    public static void main(String[] args){
        int x, y, factorial1, factorial2, factorial3, factorial4, resultado;
        x = 7;
        y = 3;
        factorial1 = 1;
        //HAYO EL FACTORIAL DE 7, DE 2 FORMAS DISTINTAS:
        for(int cont = 1; cont <= x; cont++){ // USO EL FOR PARA HAYAR EL FACTORIAL DE 7 (BUCLE)
            factorial1 *= cont;
        }
        System.out.println("Factorial de " + x + " es : " + factorial1);
        factorial2 = x * 6 * 5 * 4 * 3 * 2;  // HAYO EL FACTORIAL DE 3 DE MANERA SIMPLE
        System.out.println(" El factorial de 7 (forma sencilla) es " + factorial2);

        //AHORA HAYO EL FACTORIAL DE 3
        factorial3 = 1;
        for(int cont = 1; cont <= y; cont++){ // HAYO EL FACTORIAL DE 3 A TRAVES DEL FOR (BUCLE)
            factorial3 *= cont;
        }
        System.out.println(" El factorial de 3 es " + factorial3);
        factorial4 = y * 2; // HAYO EL FACTORIAL DE 3 DE FORMA SIMPLE
        System.out.println(" El factorial de 3 (forma sencilla) es " + factorial4);

        resultado = factorial1 / factorial3;
        System.out.println(" El resultado es :" + resultado);


    }
}
