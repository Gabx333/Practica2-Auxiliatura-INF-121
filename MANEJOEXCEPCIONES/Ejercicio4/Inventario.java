package MANEJOEXCEPCIONES.Ejercicio4;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        try {
            for (Producto prod : productos) {
                if (prod.getCodigo().equals(p.getCodigo())) {
                    throw new Exception("El producto con código " + p.getCodigo() + " ya existe");
                }
            }
            if (p.getPrecio() < 0 || p.getStock() < 0) {
                throw new Exception("Precio o stock no pueden ser negativos");
            }
            productos.add(p);
            System.out.println("Producto " + p.getNombre() + " agregado correctamente.");
        } catch (Exception e) {
            System.out.println("Error al agregar producto " + p.getNombre() + ": " + e.getMessage());
        }
    }

    public void buscarProducto(String codigo) {
        try {
            boolean encontrado = false;
            for (Producto p : productos) {
                if (p.getCodigo().equals(codigo)) {
                    System.out.println("Producto encontrado: " + p.getNombre() +
                            ", Precio: " + p.getPrecio() +
                            ", Stock: " + p.getStock());
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                throw new Exception("Producto con código " + codigo + " no encontrado");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void venderProducto(String codigo, int cantidad) {
        try {
            Producto producto = null;
            for (Producto p : productos) {
                if (p.getCodigo().equals(codigo)) {
                    producto = p;
                    break;
                }
            }
            if (producto == null) {
                throw new Exception("Producto con código " + codigo + " no encontrado");
            }
            if (producto.getStock() >= cantidad) {
                producto.setStock(producto.getStock() - cantidad);
                System.out.println("Se vendieron " + cantidad + " unidades de "
                        + producto.getNombre() + ". Stock restante: " + producto.getStock());
            } else {
                throw new Exception("Stock insuficiente para " + producto.getNombre()
                        + ". Disponible: " + producto.getStock());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
