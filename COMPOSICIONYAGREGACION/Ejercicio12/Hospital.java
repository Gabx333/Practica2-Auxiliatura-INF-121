package COMPOSICIONYAGREGACION.Ejercicio12;
import java.util.ArrayList;

//b) Crea la clase Hospital que tiene una lista de doctores.
public class Hospital {
    
    private String nombre;
    private ArrayList<Doctor> doctores;
    public Hospital(String nombre){
        this.nombre = nombre;
        this.doctores = new ArrayList<>();
    }
    public String getNombre(){
        return nombre;
    }
    public ArrayList<Doctor> getDoctores(){
        return doctores;
    }
//c) Permite asignar doctores a hospitales y mostrar los doctores de cada hospital
    public void agregarDoctor(Doctor d){
        doctores.add(d);
    }
    public void mostrarDoctores(){
        System.out.println("Doctores del hospital: " + nombre);
        for(Doctor d: doctores){
            System.out.println("Nombre: " + d.getNombre() + ", Especialidad: " + d.getEspecialidad());
        }
        System.out.println("---------------------------");
    }
}
