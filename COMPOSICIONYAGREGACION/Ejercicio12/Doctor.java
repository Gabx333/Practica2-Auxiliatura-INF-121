package COMPOSICIONYAGREGACION.Ejercicio12;

//a) Crea la clase Doctor con atributos nombre, especialidad.
public class Doctor {
    private String nombre;
    private String especialidad;

    public Doctor(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEspecialidad() {
        return especialidad;
    }
}
