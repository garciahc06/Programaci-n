package SegundaEv.Programacion.Ejercicio01;

public class Programa {
    public static void main(String[] args) {
        Persona persona_1, persona_2, persona_3;

        persona_1 = new Persona(19999111, "Kevin", "22/09/03", "Chez moi" );
        persona_2 = new Persona();
        persona_3 = new Persona(14444444, "Carlos", "20/09/03", "Chez lui");

        persona_1.mostrar();
        persona_2.mostrar();
        persona_3.mostrar();
    }
}
