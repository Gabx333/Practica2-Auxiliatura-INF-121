package COMPOSICIONYAGREGACION.Ejercicio8;

import java.util.ArrayList;

public class Facultad {
    private String nombre;
    private ArrayList<Fraternidad> fraternidades;

    public Facultad(String nombre){
        this.nombre = nombre;
        this.fraternidades = new ArrayList<>();
    }
    public String getNombre(){
        return nombre;
    }
    public void agregarFraternidad(Fraternidad f){
        fraternidades.add(f);
    }
    public void agregarBailarin(Bailarin b){
        // Verificar que no esté en otra fraternidad
        for (Fraternidad frat : fraternidades) {
            for (Bailarin bai : frat.getBailarines()) {
                if (bai.getNombre().equals(b.getNombre())) {
                    System.out.println("- " + b.getNombre() + " ya está registrado en otra fraternidad.");
                    return;
                }
            }
        }
        fraternidades.get(0).agregarBailarin(b);
    }
}
