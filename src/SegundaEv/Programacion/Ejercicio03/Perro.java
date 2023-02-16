package SegundaEv.Programacion.Ejercicio03;

public class Perro extends Animal {
    String raza;

    public Perro(int cod, String pais, String nom, String onoma, String sex, String r){
        super(cod, nom, onoma, sex);
        raza = r;
    }

    public void hablar() {
        System.out.println("guau guau voy a morderte joputo");
    }
}
