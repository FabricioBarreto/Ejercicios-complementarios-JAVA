package Ejercicio_5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GrupoDeAlumnos {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Introduce fecha actual, ej: 17/11/2021");
        String fecha = entrada.nextLine();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate ahora = LocalDate.parse(fecha,formato);
    
        List<Alumno> alumnos = List.of(new Alumno("Simpson","Homero",(LocalDate.now().minusYears(30))),
        new Alumno("Ramirez", "Mario", (ahora.minusYears(22))),
        new Alumno("Romina", "Gonzalez",(ahora.minusYears(22))),
        new Alumno("Carlos", "Valenzuela",(ahora.minusYears(27))),
        new Alumno("Roldan", "Sonia",(ahora.minusYears(19))),
        new Alumno("Olivieri", "Antonio",(ahora.minusYears(27))));
    
        Map<String,Integer> datos = new HashMap<String,Integer>();
    
        for(Alumno persona:alumnos){
            int edad =  ahora.getYear() - persona.fechaDeNacimiento.getYear() ;
            datos.put(persona.getNombres(),edad);
        }
        System.out.println(datos);
    } 
}
