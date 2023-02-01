package PrimeraEv.Programacion;
/*
Número de campanas que han sonado
 */
public class Ejercicio090 {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("Sonaron " + campanadas1(3) + " campanas");
        System.out.println("Sonaron " + campanadas2(3) + " campanas");
    }
    public static int campanadas1(int hora){
        int acum = 0;
        for (int i = hora; i > 0; i--)
            if (i > 12)
                acum += i - 12;
            else
                acum += i;
        return acum;
    }
    public static int campanadas2(int hora){
        if (hora == 1)
            return 1;
        else
            if (hora > 12)
                return hora - 12 + campanadas2(hora - 1);
            else
                return hora + campanadas2(hora - 1);
    }
}
