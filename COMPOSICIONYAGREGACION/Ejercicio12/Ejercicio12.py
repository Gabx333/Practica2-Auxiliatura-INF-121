class Doctor:
    def __init__(self, nombre, especialidad):
        self.nombre = nombre
        self.especialidad = especialidad

    def getNombre(self):
        return self.nombre

    def getEspecialidad(self):
        return self.especialidad

class Hospital:
    def __init__(self, nombre):
        self.nombre = nombre
        self.doctores = []  

    def getNombre(self):
        return self.nombre

    def getDoctores(self):
        return self.doctores

    def agregarDoctor(self, doctor):
        self.doctores.append(doctor)

    def mostrarDoctores(self):
        print(f"Doctores del hospital: {self.nombre}")
        for d in self.doctores:
            print(f"Nombre: {d.getNombre()}, Especialidad: {d.getEspecialidad()}")
        print("----------------------------")


h1 = Hospital("Hospital Central")
h2 = Hospital("Clinica San Jose")

d1 = Doctor("Dr. Juan Perez", "Cardiologia")
d2 = Doctor("Dra. Maria Gomez", "Pediatria")
d3 = Doctor("Dr. Carlos Ruiz", "Neurologia")
d4 = Doctor("Dra. Ana Torres", "Dermatologia")

h1.agregarDoctor(d1)
h1.agregarDoctor(d2)
    
h2.agregarDoctor(d2)
h2.agregarDoctor(d3)
h2.agregarDoctor(d4)

h1.agregarDoctor(d4)

h1.mostrarDoctores()
h2.mostrarDoctores()