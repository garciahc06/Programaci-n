package SegundaEv.Programacion.Ejercicio01;

public class Persona {
    int dni;
    String nombre;
    String fNac;
    String domicilio;

    public Persona (int dni, String nom, String fN, String dom){
        this.dni = dni;
        nombre = nom;
        fNac = fN;
        domicilio = dom;
    }
    public Persona () {
        dni = 15555555;
        nombre = "Pepe Pérez";
        fNac = "22/12/2000";
        domicilio = "Chez toi";
    }
    /*El metodo constructor puede ser mixto
    Puede tener atributos fijos o variables
    this.dni = dni
    nombre = "Pepe Pérez";
     */
    public void mostrar(){
        System.out.println(nombre + " - " + dni + " - f.nac:(" + fNac + ") - domicilio:(" + domicilio + ")");
    }
}
