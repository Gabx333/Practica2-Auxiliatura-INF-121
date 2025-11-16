//DIAGRAMA YA HECHO EN LA GUIA DE PRACTICA
package COMPOSICIONYAGREGACION.Ejercicio10;

public class Main {
    public static void main(String[] args) {
        // ====== CREAR SPEAKERS ======
        Speaker s1 = new Speaker("Carlos", "Pérez", 40, 101, "Inteligencia Artificial");
        Speaker s2 = new Speaker("María", "López", 35, 102, "Ciberseguridad");

        // ====== CREAR PARTICIPANTES ======
        Participante p1 = new Participante("Ana", "Torres", 22, 201, 1);
        Participante p2 = new Participante("Luis", "Mamani", 25, 202, 2);
        Participante p3 = new Participante("Sofía", "Choque", 28, 203, 3);
        Participante p4 = new Participante("Mario", "Quispe", 30, 204, 4);

        // ====== CREAR CHARLAS ======
        Charla c1 = new Charla("Introducción a la IA", "Auditorio 1", s1, 0);
        c1.agregarParticipante(p1);
        c1.agregarParticipante(p2);
        c1.agregarParticipante(p3);

        Charla c2 = new Charla("Ciberseguridad moderna", "Auditorio 2", s2, 0);
        c2.agregarParticipante(p4);
        c2.agregarParticipante(p1);

        // ====== CREAR EVENTO ======
        Evento evento = new Evento("TecnoConferencia 2025");
        evento.agregarCharla(c1);
        evento.agregarCharla(c2);

        // ====== a) Calcular edad promedio de participantes ======
        System.out.println("a) Edad promedio de participantes: " + evento.calcularPromedioEdad());
        System.out.println();

        // ====== b) Verificar si una persona está registrada ======
        System.out.println("b) ¿'Ana Torres' está en el evento?: " +
                evento.verificarSiSeEncuentraParticipanteX("Ana", "Torres"));
        System.out.println("b) ¿'María López' está en el evento?: " +
                evento.verificarSiSeEncuentraParticipanteX("María", "López"));
        System.out.println("b) ¿'Pedro Pérez' está en el evento?: " +
                evento.verificarSiSeEncuentraParticipanteX("Pedro", "Pérez"));

        // ====== d) Ordenar charlas por número de participantes ======
        System.out.println("\nd) Charlas ordenadas por número de participantes:");
        evento.ordenarCharlasNroParticipantes();
        evento.mostrarCharlas();

        // ====== c) El speaker con CI 101 no pudo asistir ======
        System.out.println("\nc) Eliminando charlas del speaker con CI 101...");
        evento.eliminarCharlasSpeakerX(101);
        evento.mostrarCharlas();
        }
}

