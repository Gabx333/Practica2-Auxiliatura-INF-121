class Empleado:
    def __init__(self, nombre, puesto, salario):
        self.nombre = nombre
        self.puesto = puesto
        self.salario = salario

    def getNombre(self):
        return self.nombre

    def getPuesto(self):
        return self.puesto

    def getSalario(self):
        return self.salario
    
class Empresa:
    def __init__(self, nombre):
        self.nombre = nombre
        self.empleados = []

    def agregarEmpleado(self, e):
        self.empleados.append(e)

    def mostrarInformacion(self):
        print("Empresa:", self.nombre)
        for e in self.empleados:
            print("Empleado:", e.getNombre(), ",", e.getPuesto(), ", con salario de:", e.getSalario())
        print("-------------------------------")

    def buscarEmpleadoX(self, nombreX):
        for e in self.empleados:
            if e.getNombre() == nombreX:
                return ("Se encontro empleado X: " + e.getNombre() + ", " + e.getPuesto() + ", con salario de: " + str(e.getSalario()))
        return "No se encontro al empleado X: " + nombreX

    def eliminarEmpleadoX(self, nombreX):
        nuevaLista = []
        for e in self.empleados:
            if e.getNombre() != nombreX:
                nuevaLista.append(e)
        self.empleados = nuevaLista

    def promedioSalario(self):
        cont = 0
        suma = 0
        for e in self.empleados:
            suma += e.getSalario()
            cont += 1
        return suma / cont if cont > 0 else 0

    def salarioMayor(self, valorX):
        salarioMay = []
        for e in self.empleados:
            if e.getSalario() > valorX:
                salarioMay.append(e)
        print("Empresa:", self.nombre)
        for e in salarioMay:
            print("Empleado:", e.getNombre(), ",", e.getPuesto(), ", con salario de:", e.getSalario())
        print("-------------------------------")

empresa = Empresa("Mi Empresa")
e1 = Empleado("Juan", "Desarrollador", 5000)
e2 = Empleado("Maria", "Diseñadora", 6000)
e3 = Empleado("Pedro", "Gerente", 8000)
e4 = Empleado("Carlos", "Marketing", 4000)
e5 = Empleado("Carla", "Gerente", 6500)
e6 = Empleado("Daniela", "Ejecutiva", 7000)

empresa.agregarEmpleado(e1)
empresa.agregarEmpleado(e2)
empresa.agregarEmpleado(e3)
empresa.agregarEmpleado(e4)
empresa.agregarEmpleado(e5)
empresa.agregarEmpleado(e6)

print("b) Mostrar la informacion inicial de la empresa")
empresa.mostrarInformacion()

print("c) Mostrar la informacion del EmpleadoX: Juan")
print(empresa.buscarEmpleadoX("Juan"))
print("-------------------------------")

print("d) Eliminar empleadoX: Maria")
empresa.eliminarEmpleadoX("Maria")
empresa.mostrarInformacion()

print("e) Mostrar el promedio del salario de la empresa")
print("El promedio es:", empresa.promedioSalario())
print("-------------------------------")

print("f) Listar todos los empleados que tengan un salario mayor a 6200")
empresa.salarioMayor(6200)