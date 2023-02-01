package SegundaEv.Programacion.Ejercicio04;

public class Nif {
    public int dni;
    public char letra;
    public static char[] TABLA = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    //El modificador static indica que el atributo es constante y que pertenece a la clase, no a los objetos.

    public Nif(int dni, char l) throws Exception {
        this.dni = dni;
        if (l != TABLA[dni % TABLA.length]){
            letra = TABLA[dni % TABLA.length];
            throw new Exception("La letra con el DNI no coinciden");
        }
        letra = l;
    }
    public Nif(int dni) {
        this.dni = dni;
        letra = TABLA[dni % TABLA.length];
    }

    public void mostrar() {
        System.out.println("DNI: " + dni + letra);
    }
    /*
    EVITAR QUE EL PROGRAMA NO PUEDA ROMPERSE A CAUSA DE UNA EXCEPCIÓN
    try {
        int t = 33/0;
    } catch (ArithmeticException e) {
        System.out.println("Error: " + e.getMessage());
    }
     */
}
