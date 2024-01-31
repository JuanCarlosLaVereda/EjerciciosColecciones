package es.ieslavereda.Ejercicio1;

public class Pais {
    private String nombre;
    private Integer poblacion;

    public Pais(String nombre, Integer poblacion){
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }
    public Integer getPoblacion() {
        return poblacion;
    }
    public void setPoblacion(Integer poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString(){
        return "\nNombre del pais: " + nombre +
                "\nNº de poblacion: " + poblacion;
    }
}
