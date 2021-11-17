package Ejercicio_5;

import java.time.LocalDate;

public class Alumno {
    String apellido, nombre;
    LocalDate fechaDeNacimiento;
        
    public Alumno(String _apellido, String _nombre,LocalDate _fechaDeNacimiento){
        this.apellido = _apellido;
        this.nombre = _nombre;
        this.fechaDeNacimiento = _fechaDeNacimiento;
    }
    
    @Override
    public java.lang.String toString() {
        return apellido + " " + nombre;
    }
    
    LocalDate getfechaDeNacimiento(){
        return fechaDeNacimiento;
    }
}
