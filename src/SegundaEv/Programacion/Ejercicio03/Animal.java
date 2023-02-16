package SegundaEv.Programacion.Ejercicio03;

public abstract class Animal {
    int codigo;
    String pais_origen;
    String nombre;
    String onomatopeya;
    String sexo;

    public Animal(int cod, String nom, String onoma, String sex) {
        codigo = cod;
        nombre = nom;
        onomatopeya = onoma;
        sexo = sex;
    }
    public abstract void hablar();
}
