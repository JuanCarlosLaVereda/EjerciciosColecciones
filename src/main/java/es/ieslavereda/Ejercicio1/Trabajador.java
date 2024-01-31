package es.ieslavereda.Ejercicio1;

import java.time.LocalDate;
//Falta iterar los que tengan mas de 50 años
//En el mapa ordenar por orden alfabetico (primero el apellido y luego el nombre)

public class Trabajador {
    private String dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    public Trabajador(String dni, String nombre, String apellido, LocalDate fechaNacimiento){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDni() {
        return dni;
    }
    public Integer getEdad() {
        return LocalDate.now().getYear()-fechaNacimiento.getYear();
    }
}
