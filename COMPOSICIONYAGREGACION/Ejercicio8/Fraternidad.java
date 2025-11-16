package COMPOSICIONYAGREGACION.Ejercicio8;
import java.util.ArrayList;

public class Fraternidad {
    private String nombre;
    private String encargado;
    private ArrayList<Bailarin> bailarines;

    public Fraternidad(String nombre, String encargado){
        this.nombre = nombre;
        this.encargado = encargado;
        this.bailarines = new ArrayList<>();
    }
    public String getNombre(){
        return nombre;
    }
    public ArrayList<Bailarin> getBailarines(){
        return bailarines;
    }
    //2) conocer al encargado de cada fraternidad
    public String getEncargado(){
        return encargado;
    }
    public void agregarBailarin(Bailarin b){
        // Verificar que no esté en otra fraternidad
        bailarines.add(b);
    }
}
