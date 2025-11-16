package COMPOSICIONYAGREGACION.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Ropero ropero = new Ropero("Madera");

        Ropa r1 = new Ropa("Camisa", "Algodón");
        Ropa r2 = new Ropa("Pantalón", "Denim");
        Ropa r3 = new Ropa("Chaqueta", "Cuero");
        Ropa r4 = new Ropa("Falda", "Seda");

        ropero.agregarRopa(r1);
        ropero.agregarRopa(r2);
        ropero.agregarRopa(r3);
        ropero.agregarRopa(r4);

        System.out.println("Ropas en el ropero:");
        ropero.mostrarRopas();

        System.out.println("\nRopas de material 'Algodón' y tipo 'Camisa':");
        ropero.mostrarRopasTipoXMaterialX("Algodón", "Camisa");
        
        System.out.println("\nRopas después de eliminar prendas de tipo 'Falda' o material 'Seda':");
        ropero.eliminarRopaTipoXMaterialX("Seda", "Falda");
        ropero.mostrarRopas();

    }
}
