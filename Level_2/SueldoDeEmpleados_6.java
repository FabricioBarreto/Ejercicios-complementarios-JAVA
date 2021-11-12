package Level_2;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class SueldoDeEmpleados_6 {

    static Scanner entrada = new Scanner (System.in);

    public static void main(String[] args) {

        Map<Integer , Integer> sueldos = new HashMap<>();

        System.out.println("Ingrese el dni de el empleado:");
        int dniEmpleado = entrada.nextInt();

        //Calculamos el sueldo del empleado
        System.out.println("ingrese el total de las horas trabajadas:");
        int horasTrabajadas = entrada.nextInt();
        System.out.println("Ingrese el valor por horas traajadas:");
        int valorPorHoras = entrada.nextInt();
        int sueldoEmpleado = horasTrabajadas*valorPorHoras;

        //Cargamos los datos al MAP
        sueldos.put(dniEmpleado,sueldoEmpleado);
        System.out.println(sueldos);
    }
}
