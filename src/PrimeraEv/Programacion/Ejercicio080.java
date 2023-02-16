package PrimeraEv.Programacion;
/*
Tenemos una frase formada por palabras separadas por un espacio en blanco.
Cada palabra se debe guardar en un elemento del vector.
Despues ordenamos el vector y mostramos la frase ordenada.
 */
public class Ejercicio080 {
    public static void main(String[] args) {
        String frase = "5Cinco 6Seis 2Dos 4Cuatro 1Uno 3Tres ";
        String[] vector;
        String aux;
        vector = frase.split(" ");
        for (int i = 0; i < vector.length; i++){
            for (int j = i + 1; j < vector.length; j++){
                if (vector[i].compareTo(vector[j]) > 0){
                    aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }
        for (int i = 0; i < vector.length; i++)
            System.out.printf("%s - ", vector[i]);
    }
}
//Otr forma de realiar el ejercicio es:
/*
int cont = 0;
int posicion = frase.indexOf(" ");
while (posicion != -1){
    cont++;
    posicion = frase.indexOf(" ", posicion + 1);
}
vector = new String[cont];

int i = 0
int inicio = 0;
int fin = frase.indexOf(" ");
while (fin != -1){
    vector[i] = frase.substring(inicio, fin);
    inicio = fin + 1;
    fin = frase.indexOf(" ", inicio);
    i++;
}
String aux;
for (int i = 0; i < vector.length; i++){
    for (int j = i + 1; j < vector.length; j++){
        if (vector[i].compareTo(vector[j]) > 0){
            aux = vector[i];
            vector[i] = vector[j];
            vector[j] = aux;
        }
    }
}
frase = "";
for (int j = 0; j < vector.length; j++)
    frase += frase.concat(vector[j] + " ");

System.out.println(frase);
 */
