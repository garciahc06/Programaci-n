package PrimeraEv.Programacion;
/*
Tratamiento de funciones / métodos.
 */
public class Ejercicio043 {
    public static void main(String[] args) {
        String palabras;
        escribir();
        hablar("Buenos días 1ºH");
        animalHabla("perro", "guau guau");
        String frase = concatenar("En un lugar", " de La Mancha");
        System.out.println(frase);
        int c = suma(10, 5);
        System.out.println("El resultado de la suma entre 10 y 5 es : " + c);
    }
    public static void escribir() {
        System.out.println("Hola");
    }
    public static void hablar(String frase) {
        System.out.println(frase);
    }
    public static void animalHabla(String animal, String onomatopeya) {
        System.out.println("El " + animal + " dice " + onomatopeya);
    }
    public static String concatenar(String frase1, String frase2) {
        return frase1 + frase2;
    }
    public static int suma(int a, int b) {
        return a + b;
    }
}
