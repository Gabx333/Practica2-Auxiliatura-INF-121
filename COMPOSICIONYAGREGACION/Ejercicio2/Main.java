//DIAGRAMA YA HECHO EN LA GUIA DE PRACTICA
package COMPOSICIONYAGREGACION.Ejercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // (a) Instanciar 2 departamentos
        Departamento d1 = new Departamento("Recursos Humanos", 150.5);
        Departamento d2 = new Departamento("Finanzas", 200.0);

        // Agregar 5 empleados al departamento 1
        d1.agregarEmpleado(new Empleado("Ana", "Gerente", 5000));
        d1.agregarEmpleado(new Empleado("Luis", "Asistente", 3000));
        d1.agregarEmpleado(new Empleado("Carlos", "Analista", 3200));
        d1.agregarEmpleado(new Empleado("María", "Secretaria", 2800));
        d1.agregarEmpleado(new Empleado("Jorge", "Reclutador", 3100));

        // Departamento 2 sin empleados
        System.out.println("Antes de los cambios:");
        d1.mostrarEmpleados();
        d2.mostrarEmpleados();

        // (c) Cambiar salario de todos los empleados del departamento 1
        d1.cambioSalario(4000);
        System.out.println("\nDespués del cambio de salario:");
        d1.mostrarEmpleados();

        // (d) Verificar si algún empleado del d1 está en d2
        boolean hayCoincidencia = false;
        for (Empleado e1 : d1.getEmpleados()) {
            for (Empleado e2 : d2.getEmpleados()) {
                if (e1.getNombre().equals(e2.getNombre())) {
                    hayCoincidencia = true;
                    break;
                }
            }
        }

        System.out.println("\n¿Algún empleado del d1 pertenece también a d2? " + (hayCoincidencia ? "Sí" : "No"));

        // (e) Mover empleados del d1 al d2
        d2.setEmpleados(d1.getEmpleados());
        d1.setEmpleados(new ArrayList<>()); // dejar d1 vacío

        System.out.println("\nDespués de mover empleados:");
        d1.mostrarEmpleados();
        d2.mostrarEmpleados();
    }
}
