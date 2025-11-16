//DIAGRAMA YA HECHO EN LA GUIA DE PRACTICA
package COMPOSICIONYAGREGACION.Ejercicio2;

    import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private double area;
    private ArrayList<Empleado> empleados;

    public Departamento(String nombre, double area) {
        this.nombre = nombre;
        this.area = area;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public double getArea() {
        return area;
    }
    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    // (b) Agregar el metodo mostrarEmpleados
    public void mostrarEmpleados() {
        System.out.println("Departamento: " + nombre + " (Área: " + area + ")");
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados en este departamento.");
        } else {
            for (Empleado e : empleados) {
                System.out.println("  - " + e);
            }
        }
    }

    // (c) Cambiar salario a todos los empleados
    public void cambioSalario(double nuevoSueldo) {
        for (Empleado e : empleados) {
            e.setSueldo(nuevoSueldo);
        }
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
}
