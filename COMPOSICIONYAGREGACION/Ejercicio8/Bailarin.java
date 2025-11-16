package COMPOSICIONYAGREGACION.Ejercicio8;

public class Bailarin {
    private String nombre;
    private int edad;
    private Facultad facultad;
    private Fraternidad fraternidad;
    //5) Cada vez que haya un nuevo integrante debe de ser registrado tomando sus datos personales, la facultad y fraternidad a la que pertenecen respectivamente.
    public Bailarin(String nombre, int edad, Facultad facultad, Fraternidad fraternidad){
        this.nombre = nombre;
        this.edad = edad;
        this.facultad = facultad;
        this.fraternidad = fraternidad;
    }

    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public Facultad getFacultad(){
        return facultad;
    }
    public Fraternidad getFraternidad(){
        return fraternidad;
    }
    //1) ver a los bailarines y a que fraternidad y facultad pertenecen
    //3) ver las edades de los participantes
    @Override
    public String toString() {
        return "Bailarín: " + nombre + ", Edad: " + edad + ", Facultad: " + facultad.getNombre() + ", Fraternidad: " + fraternidad.getNombre();
    }
}
