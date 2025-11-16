package COMPOSICIONYAGREGACION.Ejercicio4;

public class Ropa {
    public String tipo;
    public String material;

    public Ropa(String tipo, String material) {
        this.tipo = tipo;
        this.material = material;
    }
    public String getTipo() {
        return tipo;
    }
    public String getMaterial() {
        return material;
    }
    @Override
    public String toString(){
        return "Tipo: " + tipo + ", Material: " + material;
    }
}