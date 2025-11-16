package COMPOSICIONYAGREGACION.Ejercicio14;
import java.util.ArrayList;

public class Empresa {
    
    private String nombre;
    private ArrayList<Empleado> empleados;
    
    public Empresa(String nombre){
        this.nombre = nombre;
        this.empleados = new ArrayList<>(); 
    }
    public void agregarEmpleado(Empleado e){
        empleados.add(e);
    }
//b) Mostrar la información de la empresa y sus empleados.
    public void mostrarInformacion(){
        System.out.println("Empresa: " + nombre);
        for (Empleado e: empleados){
            System.out.println("Empleado: " + e.getNombre() + ", " + e.getPuesto() + ", con salario de: " + e.getSalario());
        }
        System.out.println("-------------------------------");
    }
//c) Implementar un método en Empresa para buscar un empleado por nombre y retornar su información.
    public String buscarEmpleadoX(String nombreX){
        for(Empleado e: empleados){
            if(e.getNombre().equals(nombreX)){
                return ("Se encontro empleado X: " + e.getNombre() + ", " + e.getPuesto() + ", con salario de: " + e.getSalario());
            }
        }
        return("No se encontro al empleado X: " + nombreX);
    }
//d) Crear un método para eliminar un empleado de la empresa por nombre.
    public void eliminarEmpleadoX(String nombreX) {
        ArrayList<Empleado> nuevaLista = new ArrayList<>();
        for(Empleado e: empleados){
            if(!e.getNombre().equals(nombreX)){
                nuevaLista.add(e);
            }
        }
        empleados = nuevaLista;
    }
//e) Agregar un método que calcule y muestre el promedio salarial de todos los empleados.
    public double promedioSalario(){
        double cont = 0;
        double suma = 0;
        for(Empleado e: empleados){
            suma = suma + e.getSalario();
            cont++;
        }
        return suma / cont;
    }
//f) Implementar un método para listar todos los empleados que tengan un salario mayor a un valor dado.
    public void salarioMayor(double valorX){
        ArrayList<Empleado> salarioMay = new ArrayList<>();
        for(Empleado e: empleados){
            if(e.getSalario() > valorX){
                salarioMay.add(e);
            }
        }
        System.out.println("Empresa: " + nombre);
        for (Empleado e: salarioMay){
            System.out.println("Empleado: " + e.getNombre() + ", " + e.getPuesto() + ", con salario de: " + e.getSalario());
        }
        System.out.println("-------------------------------");
    }
}
