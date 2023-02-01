package SegundaEv.Programacion.Ejercicio02;

public class Programa {
    public static void main(String[] args) {
        Casa casa1, casa2;
        Chalet chalet1, chalet2;

        casa1 = new Casa("Avenida Ave del paraíso", 98, 4, "España");
        casa2 = new Casa("Avenida de España", 110, 5, "España");

        chalet1 = new Chalet("Avenida Pablo Gargallo", 102, 4, "España", 30, true);
        chalet2 = new Chalet("Camino del Calvario", 89, 3, "Andorra", 25, false);

        casa1.mostrar();
        casa2.mostrar();
        chalet1.mostrar();
        chalet2.mostrar();

    }
}
