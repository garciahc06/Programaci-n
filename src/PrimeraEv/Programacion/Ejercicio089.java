package PrimeraEv.Programacion;

public class Ejercicio089 {
    public static void main(String[] args) {
        mostrarFrase(5);
    }
    public static void mostrarFrase(int a){
        if (a > 0){
            System.out.println("mostrarFrase(" + a + ")");
            mostrarFrase(a - 1);
            System.out.println("mostrarFrase(" + a + ")");
        }
    }
}
