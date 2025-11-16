package MANEJOEXCEPCIONES.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Suma: " + Calculadora.sumar(10, 5));
        System.out.println("Resta: " + Calculadora.restar(10, 5));
        System.out.println("Multiplicación: " + Calculadora.multiplicar(10, 5));

        // División correcta
        Calculadora.dividir(10, 2);
        Calculadora.dividir(10, 0);

        Calculadora.convertirANumero("123");

        Calculadora.convertirANumero("abc");
    }
}
