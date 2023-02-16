package PrimeraEv.Programacion;
/*
Dada la tabla de salarios (Ejercicio045), instanciar funciones para que devuelva
el salario semestral de cada empleado.
 */
public class Ejercicio046 {
    public static void main(String[] args){
        int[][] salarios = {{700, 900, 1300, 800, 790, 850},
                {1000, 950, 1080, 1070, 1200, 1100},
                {1300, 930, 1200, 1170, 1000, 1000},
                {1500, 1950, 1880, 1970, 2200, 2100}};
        String[] empleados ={"Javier Marías", "Antonio Muñoz", "Isabel Allende", "Javier Sierra"};
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio"};
        //llamamos a una funcion "salariosSemesrales" que nos devuelva un array con los salarios
        int[] salariosSemestrales = salariosSemestrales(salarios);
        for(int i = 0; i < salariosSemestrales.length; i++)
            System.out.println("El salario semestral de " + empleados[i] + " es " + salariosSemestrales[i]);
        //2do metodo
        System.out.println("\n");
        for(int i = 0; i < salarios.length; i++)
            System.out.println("El salario semestral de " + empleados[i] + " es " + salariosSemestrales[i]);
       //suma salarios por mes
        System.out.println("\n");
        int[] sumaSalariosMes = sumaSalarios(salarios);
        for(int i = 0; i < sumaSalariosMes.length; i++)
            System.out.println("La suma de los salarios del mes de " + meses[i] + " es " + sumaSalariosMes[i]);
        //suma salarios por mes (2do metodo)
        System.out.println("\n");
        int[] sumaSalariosMes2 = sumaSalarios(salarios);
        for(int i = 0; i < sumaSalariosMes2.length; i++)
            System.out.println("La suma de los salarios del mes de " + meses[i] + " es " + sumaSalariosMes2[i]);
    }
    public static int [] salariosSemestrales(int[][] salarios){
        int[] salariosSemestrales = new int[salarios.length];
        for(int i = 0; i < salarios.length; i++){
            for(int j = 0; j < salarios[i].length; j++)
                salariosSemestrales[i] += salarios[i][j];
        }
        return salariosSemestrales;
    }
    public static void salariosSemestrales(int [][] salarios, int[] salariosSemestrales){
        for(int i = 0; i < salarios.length; i++){
            for(int j = 0; j < salarios[i].length; j++)
                salariosSemestrales[i] += salarios[i][j];
        }
    }
    //Creamos 2 funciones llamadas "sumaSalarios" que acumulen los salarios por meses y mostramos
    //por cada mes cuánto hemos pagado a los empleados.
    public static int[] sumaSalarios(int[][] salarios){
        int[] sumaSalarios = new int[salarios[0].length];
        for(int i = 0; i < salarios[0].length; i++){
            for(int j = 0; j < salarios.length; j++)
                sumaSalarios[i] += salarios[j][i];
        }
        return sumaSalarios;
    }
    public static void sumaSalarios(int[][] salarios, int[] sumaSalarios){
        for(int i = 0; i < salarios[0].length; i++){
            for(int j = 0; j < salarios.length; j++)
                sumaSalarios[i] += salarios[j][i];
        }
    }

}
