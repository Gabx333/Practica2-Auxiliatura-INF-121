package COMPOSICIONYAGREGACION.Ejercicio8;

public class Main {
    public static void main(String[] args) {
        Facultad facultad1 = new Facultad("Ingeniería");
        Facultad facultad2 = new Facultad("Medicina");
        Fraternidad fraternidad1 = new Fraternidad("Los bailarines", "Carlos Pérez");
        facultad1.agregarFraternidad(fraternidad1);
        Fraternidad fraternidad2 = new Fraternidad("Ritmo y pasión", "Ana Gómez");
        facultad2.agregarFraternidad(fraternidad2);
        Bailarin bailarin1 = new Bailarin("Juan", 20, facultad1, fraternidad2);
        Bailarin bailarin2 = new Bailarin("María", 22, facultad2, fraternidad2);
        Bailarin bailarin3 = new Bailarin("Luis", 21, facultad1, fraternidad1);
        Bailarin bailarin4 = new Bailarin("Lucía", 23, facultad2, fraternidad1);
        Bailarin bailarin5 = new Bailarin("Juan", 24, facultad1, fraternidad1); // Mismo nombre que bailarin1

        // Agregar bailarines a sus respectivas fraternidades
        facultad1.agregarBailarin(bailarin4);
        facultad1.agregarBailarin(bailarin3);
        facultad2.agregarBailarin(bailarin1);
        facultad2.agregarBailarin(bailarin2);
        facultad1.agregarBailarin(bailarin5);
        facultad2.agregarBailarin(bailarin4);

        // Mostrar información de los bailarines
        System.out.println(bailarin1);
        System.out.println(bailarin2);
        System.out.println(bailarin3);
        System.out.println(bailarin4);
        System.out.println(bailarin5);

        // Mostrar encargados de las fraternidades
        System.out.println("Encargado de la fraternidad " + fraternidad1.getNombre() + ": " + fraternidad1.getEncargado());
        System.out.println("Encargado de la fraternidad " + fraternidad2.getNombre() + ": " + fraternidad2.getEncargado());
    }
}