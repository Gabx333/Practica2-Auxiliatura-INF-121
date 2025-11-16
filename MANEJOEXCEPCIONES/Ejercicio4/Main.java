package MANEJOEXCEPCIONES.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        Producto p1 = new Producto("001", "Mouse", 25.0, 10);
        Producto p2 = new Producto("002", "Teclado", 40.0, 5);
        Producto p3 = new Producto("001", "Monitor", 150.0, 3); // Código duplicado

        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3); // Muestra error de código duplicado

        inv.venderProducto("001", 3);   // Venta válida
        inv.venderProducto("002", 10);  // Stock insuficiente
        inv.venderProducto("003", 1);   // Producto no encontrado

        inv.buscarProducto("002");      // Producto encontrado
        inv.buscarProducto("004");      // Producto no encontrado
    }
}
