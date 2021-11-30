package Ejercicio_5;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GrupoDeAlumnos {

    public static void main(String[] args){

        List<Alumno> alumnos = new java.util.ArrayList<>(List.of(
                new Alumno("Homero", "Simpson", LocalDate.now().minusYears(30))));

        alumnos.add(new Alumno("Ramirez", "Mario",LocalDate.of(2000,10,26)));
        alumnos.add(new Alumno("Romina", "Gonzalez",LocalDate.of(1995,4,17)));
        alumnos.add(new Alumno("Valenzuela", "Carlos",LocalDate.of(1998,7,22)));
        alumnos.add(new Alumno("Roldan", "Sonia",LocalDate.of(2002,11,28)));
        alumnos.add(new Alumno("Olivieri", "Antonio",LocalDate.of(1997,2,11)));

        Map<String, Long> datos = alumnos.stream()
                .collect(Collectors.toMap(Alumno::getNombres, Alumno::getEdad));

        System.out.println(datos);

        }
}

