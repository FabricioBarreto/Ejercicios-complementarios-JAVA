package Level_2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MontoACobrar_5 {

    static Scanner entrada = new Scanner (System.in);
    
    public static void main(String[] args) {

        List<Integer> montosPorDia = new ArrayList<Integer>();
        int totalDia=0;
        int totalDeSemana=0;

        for(int i=1; i < 6; i++){

        System.out.println("Ingrese cantidad de horas trabajadas en el día " + i);
        int horasDia = entrada.nextInt();

        System.out.println("Ingrese el monto a cobrar por hora de el día " + i);
        int montoDia = entrada.nextInt();

        totalDia = horasDia * montoDia;
        montosPorDia.add(totalDia);
        totalDeSemana += totalDia;
        }

        System.out.println(montosPorDia);
        System.out.println("Total final: " + totalDeSemana);
    }
}