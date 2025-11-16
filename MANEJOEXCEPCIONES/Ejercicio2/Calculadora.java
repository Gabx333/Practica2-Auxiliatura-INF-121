package MANEJOEXCEPCIONES.Ejercicio2;

public class Calculadora {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static void dividir(int a, int b) {
        try {
            System.out.println("División: " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("La division " + a + " / " + b + " no se puede dividir.");
        }
    }
    public static void convertirANumero(String valor){
        try {
            int n = Integer.parseInt(valor);
            System.out.println("Número convertido: " + n);
        } catch (NumberFormatException e) {
            System.out.println("Error en conversión: El valor '" + valor + "' no es un número entero válido.");
        }
    }
}

