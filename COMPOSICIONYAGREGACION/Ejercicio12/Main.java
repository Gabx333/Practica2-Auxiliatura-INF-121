package COMPOSICIONYAGREGACION.Ejercicio12;

public class Main {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("Hospital Central");
        Hospital h2 = new Hospital("Clinica San Jose");

        Doctor d1 = new Doctor("Dr. Juan Perez", "Cardiologia");
        Doctor d2 = new Doctor("Dra. Maria Gomez", "Pediatria");
        Doctor d3 = new Doctor("Dr. Carlos Ruiz", "Neurologia");
        Doctor d4 = new Doctor("Dra. Ana Torres", "Dermatologia");

        h1.agregarDoctor(d1);
        h1.agregarDoctor(d2);
        h2.agregarDoctor(d2);
        h2.agregarDoctor(d3);
        h2.agregarDoctor(d4);
        h1.agregarDoctor(d4);

        h1.mostrarDoctores();
        h2.mostrarDoctores();
    }
}
