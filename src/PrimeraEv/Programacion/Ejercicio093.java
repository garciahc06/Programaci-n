package PrimeraEv.Programacion;
/*
ley d'hondt
 */
public class Ejercicio093 {
    public static void main(String[] args) {
        final int ESCANOS = 7;
        String[] partidos = {"P.P.", "P.S.O.E.", "Podemos", "Ciudadanos", "Vox"};
        int[] votos = {119421, 157420, 57398, 46645, 91978};
        int[] escanos = new int[partidos.length];
        int[] cociente = new int[partidos.length];

        for (int i = 0; i < partidos.length; i++)
            cociente[i] = votos[i] / (escanos[i] + 1);

        for (int i = 0; i < ESCANOS; i++) {
            int max = 0;
            int indice = 0;
            for (int j = 0; j < partidos.length; j++) {
                if (cociente[j] > max) {
                    max = cociente[j];
                    indice = j;
                }
            }
            escanos[indice]++;
            cociente[indice] = votos[indice] / (escanos[indice] + 1);
        }

        for (int i = 0; i < partidos.length; i++)
            System.out.println(partidos[i] + " ha obtenido " + escanos[i] + " escanos");
    }
}
/*
for (int i = 0; i < ESCANOS; i++){
int posmax = 0;
    for (int j = 0; j < partidos.length; j++){
        if (cociente[j] > cociente[posmax])
            posmax = j;
    }
    escanos[posmax]++;
}
for (int i = 0; i < partidos.length; i++)
    System.out.printf("%s -> %d escaños\n", partidos[i], escanos[i]);
 */