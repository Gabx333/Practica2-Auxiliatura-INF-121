package COMPOSICIONYAGREGACION.Ejercicio14;

public class Main {
    public static void main(String[] args) {
//a) Crear una empresa y agregar varios empleados
        Empresa empresa = new Empresa("Mi Empresa");
        Empleado e1 = new Empleado("Juan", "Desarrollador", 5000);
        Empleado e2 = new Empleado("Maria", "Diseñadora", 6000);
        Empleado e3 = new Empleado("Pedro", "Gerente", 8000);
        Empleado e4 = new Empleado("Carlos", "Marketing", 4000);
        Empleado e5 = new Empleado("Carla", "Gerente", 6500);
        Empleado e6 = new Empleado("Daniela", "Ejecutiva", 7000);
        empresa.agregarEmpleado(e1);
        empresa.agregarEmpleado(e2);
        empresa.agregarEmpleado(e3);
        empresa.agregarEmpleado(e4);
        empresa.agregarEmpleado(e5);
        empresa.agregarEmpleado(e6);

        System.out.println("b) Mostrar la informacion inicial de la empresa" );
        empresa.mostrarInformacion();

        System.out.println("c) Mostrar la informacion del EmpleadoX: Juan" );
        System.out.println(empresa.buscarEmpleadoX("Juan"));
        System.out.println("-------------------------------");

        System.out.println("d) Eliminar empleadoX: Maria");
        empresa.eliminarEmpleadoX("Maria");
        empresa.mostrarInformacion();

        System.out.println("e) Mostrar el promedio del salario de la empresa");
        System.out.println("El promedio es: " + empresa.promedioSalario());
        System.out.println("-------------------------------");

        System.out.println("f) Listar todos los empleados que tengan un salario mayor a 6200");
        empresa.salarioMayor(6200);

    }
}
