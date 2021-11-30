package Ejercicio_5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alumno {
    String apellido, nombre;
    LocalDate fechaDeNacimiento;
        
    public Alumno(String _apellido, String _nombre, LocalDate _fechaDeNacimiento){
        this.apellido = _apellido;
        this.nombre = _nombre;
        this.fechaDeNacimiento = _fechaDeNacimiento;
    }

    String getNombres() {
        return apellido + " " + nombre;
    }

    public long getEdad() {
        return ChronoUnit.YEARS.between(fechaDeNacimiento,LocalDate.now());
    }
}