package COMPOSICIONYAGREGACION.Ejercicio4;

import java.util.ArrayList;

public class Ropero {
    public String material;
    public ArrayList<Ropa> ropas;
    public int nroRopas;

    public Ropero(String material) {
        this.material = material;
        this.ropas = new ArrayList<>();
        this.nroRopas = 0;
    }
    public ArrayList<Ropa> getRopas(){
        return ropas;
    }
    //b) Adicionar N prendas al ropero
    public void agregarRopa(Ropa r){
        ropas.add(r);
        nroRopas++;
    }
    public int getNroRopas() {
        return nroRopas;
    }
    //c) Eliminar las prendas de material x o de tipo y
    public void eliminarRopaTipoXMaterialX(String materialX, String tipoX){
        ArrayList<Ropa> ropasSeleccionadas = new ArrayList<>();
        for (Ropa r: ropas){
            if (r.getTipo().equals(tipoX) || r.getMaterial().equals(materialX)){
                //ropas.remove(r);
                nroRopas--;
            } else {
                ropasSeleccionadas.add(r);
            }
        }
        ropas = ropasSeleccionadas;
    }
    //d) mostrar las prendas de materia X y de tipoX.
    public void mostrarRopasTipoXMaterialX(String materialX, String tipoX){   
        System.out.println("Ropero: ");
        if (ropas.isEmpty()) {
            System.out.println("No hay ropas en este ropero.");
        } else {
            for (Ropa r : ropas) {
                if(r.getMaterial().equals(materialX) && r.getTipo().equals(tipoX)) {
                    System.out.println("  - " + r.getTipo() + " (" + r.getMaterial() + ")");
                }
            }
        }
    }
    
    public void mostrarRopas(){   
        System.out.println("Ropero: ");
        if (ropas.isEmpty()) {
            System.out.println("No hay ropas en este ropero.");
        } else {
            for (Ropa r : ropas) {
                System.out.println("  - " + r.getTipo() + " (" + r.getMaterial() + ")");
            }
        }
    }
}
