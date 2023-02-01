package PrimeraEv.Estudio;
/*
Formula binaria de Newton. Usando math.pow y funcion factorial (x+y)^5
 */
public class Newton {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int n = 5;
        int resultado = 0;
for (int i = 0; i <= n; i++) {
            resultado += (factorial(n) / (factorial(i) * factorial(n - i))) * (int) Math.pow(x, n - i) * (int) Math.pow(y, i);
        }
        System.out.println(resultado);
    }

    public static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
